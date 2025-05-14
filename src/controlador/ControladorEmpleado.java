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
public class ControladorEmpleado {
    
    private DAOUsuario daoU;

    public ControladorEmpleado() {
        daoU = new DAOUsuario();
    }

    public boolean guardarEmpleado (Empleado empleado) {
        return daoU.guardarUsuario(empleado);
    }

    public boolean eliminarEmpleado(String cedula) {
        return daoU.eliminarUsuario(cedula);
    }

    public boolean editarEmpleado(Empleado empleado) {
        return daoU.editarEmpleado(empleado);
    }

    public Empleado buscarEmpleado(String cedula) {
        return daoU.buscarEmpleado(cedula);
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
