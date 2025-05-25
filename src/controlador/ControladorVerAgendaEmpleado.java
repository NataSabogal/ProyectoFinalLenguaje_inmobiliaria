/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorVerAgendaEmpleado {
    
    DAOInmueble daoI;

    public ControladorVerAgendaEmpleado() {
        daoI = new DAOInmueble();
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }
    
    
    
    
}
