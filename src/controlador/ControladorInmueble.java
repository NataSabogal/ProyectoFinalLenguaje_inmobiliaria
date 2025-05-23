/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import dao.DAOUsuario;
import exceptions.CantidadDePropiedadesNoCoincidenException;
import exceptions.GestionarPropiedadDelMismoTipoException;
import exceptions.IdInmuebleEnUsoException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.Inmueble;
import modelo.TipoPropiedad;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorInmueble {

    DAOInmueble daoI;
    Empleado empleado;
    DAOUsuario daoU;

    public ControladorInmueble(Empleado empleado) { //como parametro!!
        daoI = new DAOInmueble();
        this.empleado = empleado;

    }

    public ControladorInmueble() {
        daoI = new DAOInmueble();
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }

    public void guardarInmueble(Inmueble inmueble, Empleado empleado) throws GestionarPropiedadDelMismoTipoException, CantidadDePropiedadesNoCoincidenException, IdInmuebleEnUsoException {
        Inmueble aux = buscarInmueble(inmueble.getId());
        if (aux != null) {
            throw new IdInmuebleEnUsoException();
        }
        if ((empleado.getTipoPropiedad() == TipoPropiedad.VENTA && inmueble.getTipo() != TipoPropiedad.VENTA)
                || (empleado.getTipoPropiedad() == TipoPropiedad.ARRENDAMIENTO && inmueble.getTipo() != TipoPropiedad.ARRENDAMIENTO)) {

            throw new GestionarPropiedadDelMismoTipoException();
        }
        int activos = daoI.InmueblesActivosPorEmpleado(empleado);
        if (activos >= empleado.getCantidadPropiedades()) {
            throw new CantidadDePropiedadesNoCoincidenException();
        }

        daoI.guardarInmueble(inmueble);
    }

    public boolean eliminarPropiedad(String id) {
        return daoI.eliminarPropiedad(id);
    }

    public boolean editarInmueble(Inmueble inmueble, Empleado empleado) {
        if ((empleado.getTipoPropiedad() == TipoPropiedad.VENTA && inmueble.getTipo() != TipoPropiedad.VENTA)
                || (empleado.getTipoPropiedad() == TipoPropiedad.ARRENDAMIENTO && inmueble.getTipo() != TipoPropiedad.ARRENDAMIENTO)) {
            return false;
        }

        return daoI.editarInmueble(inmueble);
    }

    public ArrayList<Inmueble> getInmuebles() {
        return daoI.getInmuebles();
    }

    public DefaultTableModel llenarTablaInmueblePorEmpleado() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Dirección", "Ciudad", "Número de Habitaciones", "Número de Baños", "Número de Plantas", "Tipo de Propiedad", "Estado", "Visita", "Descripción", "Precio"});
        ArrayList<Inmueble> lista = filtrarInmueblePorEmpleado(daoI.getInmuebles());

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

    private ArrayList<Inmueble> filtrarInmueblePorEmpleado(ArrayList<Inmueble> inmuebles) {
        ArrayList<Inmueble> salida = new ArrayList();
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i).getEmpleado().getCedula().equals(empleado.getCedula())) {
                salida.add(inmuebles.get(i));
            }
        }
        return salida;
    }

}
