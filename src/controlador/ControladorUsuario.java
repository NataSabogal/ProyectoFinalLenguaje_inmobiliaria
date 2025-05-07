/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;
import modelo.Usuario;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorUsuario {

    DAOUsuario daoU;

    public ControladorUsuario() {
        daoU = new DAOUsuario();
    }

    public Usuario buscarUsuario(String cedula) {
        return daoU.buscarUsuario(cedula);
    }

    public boolean guardarUsuario(Usuario user) {
        return daoU.guardarUsuario(user);
    }

    public boolean eliminarUsuario(String cedula) {
        return daoU.eliminarUsuario(cedula);
    }

    public boolean editarUsuario(Usuario user) {
        return daoU.editarUsuario(user);
    }

    public Empleado buscarEmpleado(String cedula) {
        return daoU.buscarEmpleado(cedula);
    }

    public Usuario logIn(String cedula, String password) {
        return daoU.logIn(cedula, password);
    }

    public DefaultTableModel llenarTablaEmpleado() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nombre", "Cédula", "Constraseña", "Fecha de Nacimineto", "Telefono", "Edad", "Cantidad de Propiedaades", "Tipo Propiedad"});
        ArrayList<Usuario> listaUsuario = daoU.getUsuarios();
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (listaUsuario.get(i) instanceof Empleado) {
                Empleado emp = (Empleado) listaUsuario.get(i);
                model.addRow(new Object[]{
                    emp.getNombre(),
                    emp.getCedula(),
                    emp.getPassword(),
                    emp.getFechaNacimiento(),
                    emp.getTelefono(),
                    emp.getEdad(),
                    emp.getCantidadPropiedades(),
                    emp.getTipoPropiedad()
                });
            }
        }
        return model;
    }
}
