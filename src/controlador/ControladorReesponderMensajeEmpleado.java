/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOMensaje;
import java.util.ArrayList;
import modelo.Inmueble;
import modelo.Mensaje;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorReesponderMensajeEmpleado {
    
    DAOMensaje daoM;

    public ControladorReesponderMensajeEmpleado() {
        daoM = new DAOMensaje();
    }
    
    public boolean responderMensaje(Inmueble inm, String idMensaje, String respuesta) {
        return daoM.responderMensaje(inm, idMensaje, respuesta);
        
    }

    public ArrayList<Mensaje> obtenerMensajesPorInmueble(Inmueble inm) {
        return daoM.obtenerMensajesPorInmueble(inm);
    }
    
    
}
