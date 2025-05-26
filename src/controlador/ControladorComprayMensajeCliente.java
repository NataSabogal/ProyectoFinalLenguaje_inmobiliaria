/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import dao.DAOMensaje;
import exceptions.MensajePendienteException;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Estado;
import modelo.Inmueble;
import modelo.Mensaje;
import modelo.TipoPropiedad;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorComprayMensajeCliente {

    DAOInmueble daoI;
    DAOMensaje daoM;

    public ControladorComprayMensajeCliente() {
        daoI = new DAOInmueble();
        daoM = new DAOMensaje();
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }

    public void CompraArrendo(Inmueble inm) {
        if (inm.getTipo() == TipoPropiedad.VENTA || inm.getTipo() == TipoPropiedad.AMBAS) {
            inm.setEstado(Estado.VENDIDO);
        }
        if (inm.getTipo() == TipoPropiedad.ARRENDAMIENTO || inm.getTipo() == TipoPropiedad.AMBAS) {
            inm.setEstado(Estado.ARRENDADO);
        }

    }

    public boolean clienteTieneMensajePendiente(Inmueble inm, Cliente cliente) {
        return daoM.clienteTieneMensajePendiente(inm, cliente);
    }

    public void guardarMensaje(Inmueble inm, Mensaje mensaje) throws MensajePendienteException {
        if (daoM.clienteTieneMensajePendiente(inm, mensaje.getCliente())) {
            throw new MensajePendienteException();
        }
        daoM.guardarMensaje(inm, mensaje);
    }

    public boolean responderMensaje(Inmueble inm, String idMensaje, String respuesta) {
        return daoM.responderMensaje(inm, idMensaje, respuesta);
    }

    public ArrayList<Mensaje> obtenerMensajesPorInmueble(Inmueble inm) {
        return daoM.obtenerMensajesPorInmueble(inm);
    }

}
