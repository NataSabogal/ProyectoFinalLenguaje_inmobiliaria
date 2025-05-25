/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import modelo.Estado;
import modelo.Inmueble;
import modelo.TipoPropiedad;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorComprayMensajeCliente {

    DAOInmueble daoI;

    public ControladorComprayMensajeCliente() {
        daoI = new DAOInmueble();
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

}
