/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOAgenda;
import dao.DAOInmueble;
import exceptions.HorarioLaboralException;
import exceptions.PosibilidadInmuebleConVisitaException;
import java.time.LocalTime;
import java.util.ArrayList;
import modelo.Agenda;
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

    public void guardarAgenda(Agenda agenda, Inmueble inm) throws PosibilidadInmuebleConVisitaException, HorarioLaboralException {
        if (!inm.isVisita()) {
            throw new PosibilidadInmuebleConVisitaException();
        }
        if (!horarioLaboralNormal(agenda)) {
            throw new HorarioLaboralException();
        }
        if (!agendaValidad(agenda)) {
            throw new HorarioLaboralException();
        }
        daoA.guardarAgenda(agenda, inm);
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

//    public void cancelarAgendas(Inmueble inm) {
//        Inmueble aux = buscarInmueble(inm.getId());
//
//    }

}
