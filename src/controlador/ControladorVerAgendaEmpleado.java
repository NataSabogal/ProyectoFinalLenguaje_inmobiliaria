/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOAgenda;
import dao.DAOInmueble;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Agenda;
import modelo.Estado;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorVerAgendaEmpleado {

    DAOInmueble daoI;
    DAOAgenda daoA;

    public ControladorVerAgendaEmpleado() {
        daoI = new DAOInmueble();
        daoA = new DAOAgenda();
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }

    public DefaultTableModel llenarTablaAgendaPorInmueble(Inmueble inm) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Fecha", "Hora Inicio", "Hora Final", "Duración"});
        Inmueble inmueble = daoI.buscarInmueble(inm.getId());
        if (inmueble != null && inmueble.getAgendas() != null) {
            if (inmueble.getEstado() == Estado.VENDIDO || inmueble.getEstado() == Estado.ARRENDADO) {
                cancelarTodasLasAgendas(inm);
            }
            ArrayList<Agenda> agendas = inmueble.getAgendas();
            for (int i = 0; i < agendas.size(); i++) {
                Agenda agenda = agendas.get(i);
                if (agenda != null) {
                    model.addRow(new Object[]{
                        agenda.getId(),
                        agenda.getFecha().toString(),
                        agenda.getHoraInicio().toString(),
                        agenda.getHoraFinal().toString(),
                        agenda.getDuracionHoras()
                    });

                }
            }
        }

        return model;

    }

    public void cancelarTodasLasAgendas(Inmueble inm) {
        daoA.cancelarTodasLasAgendas(inm);
    }

}
