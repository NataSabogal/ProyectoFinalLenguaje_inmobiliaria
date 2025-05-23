/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOAgenda;
import dao.DAOInmueble;
import exceptions.PosibilidadInmuebleConVisitaException;
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

    public void guardarAgenda(Agenda agenda, Inmueble inm) throws PosibilidadInmuebleConVisitaException {
        if (!inm.isVisita()) {
           throw new PosibilidadInmuebleConVisitaException();
        }
         daoA.guardarAgenda(agenda, inm);
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }
    
    
   

   
    
}
