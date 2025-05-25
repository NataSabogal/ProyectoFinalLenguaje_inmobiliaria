/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorPropiedadescerradasEmpleado {
    
    DAOInmueble daoI;
    Empleado empleado;

    public ControladorPropiedadescerradasEmpleado(Empleado empleado) {
        daoI = new DAOInmueble();
        this.empleado = empleado;
    }
    
    public DefaultTableModel llenarPropiedadesCerradasEmpleado() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Dirección", "Ciudad", "Número de Habitaciones", "Número de Baños", "Número de Plantas", "Tipo de Propiedad", "Estado", "Visita", "Descripción", "Precio"});
        ArrayList<Inmueble> lista = filtrarInmuebleCerradosPorEmpleado(daoI.getInmuebles());

        for (int i = 0; i < lista.size(); i++) {
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
        return model;
    }

    private ArrayList<Inmueble> filtrarInmuebleCerradosPorEmpleado(ArrayList<Inmueble> inmuebles) {
        ArrayList<Inmueble> salida = new ArrayList();
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i).PropiedadesCerradas() && inmuebles.get(i).getEmpleado() != null && inmuebles.get(i).getEmpleado().getCedula().equals(empleado.getCedula())) {
                salida.add(inmuebles.get(i));
            }
        }
        return salida;
    }
    
}
