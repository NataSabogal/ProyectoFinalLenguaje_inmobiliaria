/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import modelo.Agenda;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorAgenda {
    
    DAOInmueble daoI;

    public ControladorAgenda() {
        daoI = new DAOInmueble();
    }

    public Agenda buscarAgenda(String id, Inmueble inm) {
        return daoI.buscarAgenda(id, inm);
    }

    public boolean guardarAgenda(Agenda agenda, Inmueble inm) {
        if (inm.isVisita() == false ) {
            return false;
        }
        return daoI.guardarAgenda(agenda, inm);
    }

    public boolean eliminarAgenda(String id, Inmueble inm) {
        return daoI.eliminarAgenda(id, inm);
    }

    public boolean editarAgenda(Agenda agenda, Inmueble inm) {
        return daoI.editarAgenda(agenda, inm);
    }
    
}
