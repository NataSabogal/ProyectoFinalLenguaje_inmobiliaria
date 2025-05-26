/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOAgenda;
import dao.DAOInmueble;
import exceptions.HorarioCruzadoException;
import exceptions.HorarioLaboralException;
import exceptions.LimiteDeVisitasException;
import exceptions.PosibilidadInmuebleConVisitaException;
import java.time.LocalTime;
import modelo.Agenda;
import modelo.Cliente;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorAgenda {

    DAOAgenda daoA;
    DAOInmueble daoI;

    public ControladorAgenda() {
        daoA = new DAOAgenda();
        daoI = new DAOInmueble();
    }

    public Agenda buscarAgendaPorId(String id, Inmueble inm) {
        return daoA.buscarAgendaPorId(id, inm);
    }

    public void guardarAgenda(Agenda agenda, Inmueble inm) throws PosibilidadInmuebleConVisitaException, HorarioLaboralException, HorarioCruzadoException, LimiteDeVisitasException {
        if (!inm.isVisita()) {
            throw new PosibilidadInmuebleConVisitaException();
        }
        if (!horarioLaboralNormal(agenda)) {
            throw new HorarioLaboralException();
        }
        if (!agendaValidad(agenda)) {
            throw new HorarioLaboralException();
        }
        if (!validarHorarioAgendaNoCruzado(agenda, inm)) {
            throw new HorarioCruzadoException();
        }
        if (!validarCantidadDeVisitasTotalesActivas(agenda.getCliente())) {
            throw new LimiteDeVisitasException();
        }
        daoA.guardarAgenda(agenda, inm);
    }

    public boolean validarHorarioAgendaNoCruzado(Agenda agenda, Inmueble inm) {
        for (int i = 0; i < inm.getAgendas().size(); i++) {
            Agenda aux = inm.getAgendas().get(i);

            if (aux != null && !aux.isCancelada()) {
                if (aux.getFecha().equals(agenda.getFecha())) {
                    if ((agenda.getHoraInicio().isBefore(aux.getHoraFinal())
                            && agenda.getHoraFinal().isAfter(aux.getHoraInicio()))
                            || agenda.getHoraInicio().equals(aux.getHoraFinal())
                            || agenda.getHoraFinal().equals(aux.getHoraInicio())) {
                        return false; 
                    }
                }
            }
        }
        return true;  
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }

    public boolean horarioLaboralNormal(Agenda agenda) {
        LocalTime inicioLaboral = LocalTime.of(7, 30);
        LocalTime finLaboral = LocalTime.of(17, 0);

        LocalTime inicio = agenda.getHoraInicio();
        LocalTime fin = agenda.getHoraFinal();

        if (inicio.isBefore(inicioLaboral) || fin.isAfter(finLaboral)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean agendaValidad(Agenda agenda) {
        int duracion = agenda.getDuracionHoras();
        if (duracion >= 1 && duracion <= 3) {
            return true;
        }
        return false;
    }

    public void cancelarTodasLasAgendas(Inmueble inm) {
        daoA.cancelarTodasLasAgendas(inm);
    }

    public boolean validarCantidadDeVisitasTotalesActivas(Cliente cliente) {
        int contador = 0;

        for (int i = 0; i < daoI.getInmuebles().size(); i++) {
            Inmueble inmueble = daoI.getInmuebles().get(i);
            for (int j = 0; j < inmueble.getAgendas().size(); j++) {
                Agenda agenda = inmueble.getAgendas().get(j);
                if (agenda != null && !agenda.isCancelada() && agenda.getCliente().getCedula().equals(cliente.getCedula())) {
                    contador++;
                    if (contador >= 2) {
                        return false; 
                    }
                }
            }
        }

        return true;
    }
}
