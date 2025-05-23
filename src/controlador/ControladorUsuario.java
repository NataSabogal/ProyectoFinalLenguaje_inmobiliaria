/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOUsuario;
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

    public void guardarUsuario(Usuario user) {
        daoU.guardarUsuario(user);
    }

    public boolean eliminarUsuario(String cedula) {
        return daoU.eliminarUsuario(cedula);
    }

    public boolean editarEmpleado(Empleado empleado) {
        return daoU.editarEmpleado(empleado);
    }

    public Empleado buscarEmpleado(String cedula) {
        return daoU.buscarEmpleado(cedula);
    }

}
