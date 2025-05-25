/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOAgenda;
import dao.DAOInmueble;
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
    
//    public DefaultTableModel llenarTablaAgendaPorInmueble(){
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(new String []{"ID", "Fecha","Hora Inicio", "Hora Final", "Duración" });
//        ArrayList<Agenda> listaAgenda = 
//    }

    
}
