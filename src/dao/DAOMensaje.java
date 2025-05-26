/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Inmueble;
import modelo.Mensaje;
import serializadora.SerializadoraInmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOMensaje {

    public DAOMensaje() {
        SerializadoraInmueble.getInstancia().getInmueble();
    }
    
    
    public boolean clienteTieneMensajePendiente(Inmueble inm, Cliente cliente) {
        ArrayList<Mensaje> mensajes = inm.getMensajes();
        for (int i = 0; i < mensajes.size(); i++) {
            Mensaje mensaje = mensajes.get(i);
            if (mensaje.getCliente().equals(cliente) && !mensaje.estaRespondido()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean guardarMensaje(Inmueble inm, Mensaje mensaje) {
        if (!clienteTieneMensajePendiente(inm, mensaje.getCliente())) {
            inm.getMensajes().add(mensaje);
            SerializadoraInmueble.getInstancia().escribirInmueble();
            return true;
        }
        return false;
    }
    
    public boolean responderMensaje(Inmueble inm, String idMensaje, String respuesta) {
        ArrayList<Mensaje> mensajes = inm.getMensajes();
        for (int i = 0; i < mensajes.size(); i++) {
            Mensaje m = mensajes.get(i);
            if (m.getId().equals(idMensaje) && !m.estaRespondido()) {
                m.setRespuesta(respuesta);
                SerializadoraInmueble.getInstancia().escribirInmueble();
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Mensaje> obtenerMensajesPorInmueble(Inmueble inm) {
        return inm.getMensajes();
    }   
}
