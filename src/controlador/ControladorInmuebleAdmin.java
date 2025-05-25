/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import dao.DAOUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorInmuebleAdmin {

    DAOInmueble daoI;
    DAOUsuario daoU;

    public ControladorInmuebleAdmin() {
        daoI = new DAOInmueble();
        daoU = new DAOUsuario();
    }

    public ArrayList<Inmueble> getInmuebles() {
        return daoI.getInmuebles();
    }

    public boolean editarInmuebleConEmpleado(Inmueble inmueble) {
        Inmueble aux = daoI.buscarInmueble(inmueble.getId());
        if (aux != null && inmueble.getEmpleado().getCedula().equals(aux.getEmpleado().getCedula())) {
            return daoI.editarInmueble(inmueble);
        }
        return false;
    }

    public DefaultTableModel historialPropiedades() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Dirección", "Ciudad", "Número de Habitaciones", "Número de Baños", "Número de Plantas", "Tipo de Propiedad", "Estado", "Visita", "Descripción", "Precio"});
        ArrayList<Inmueble> lista = daoI.getInmuebles();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).PropiedadesCerradas()) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getPropiedad().getDireccion(),
                    lista.get(i).getPropiedad().getCiudad(),
                    lista.get(i).getPropiedad().getNumHabitaciones(),
                    lista.get(i).getPropiedad().getNunBanios(),
                    lista.get(i).getPropiedad().getNumPlantas(),
                    lista.get(i).getTipo(),
                    lista.get(i).getEstado(),
                    lista.get(i).isVisita(),
                    lista.get(i).getDescripcion(),
                    lista.get(i).getPrecio()
                });
            }

        }
        return model;
    }
}
