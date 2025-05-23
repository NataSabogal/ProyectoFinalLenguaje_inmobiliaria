/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Empleado;
import modelo.RolUsuario;
import modelo.Usuario;
import serializadora.SerializadoraUsuario;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOUsuario {

    private ArrayList<Usuario> usuarios;

    public DAOUsuario() {
        this.usuarios = SerializadoraUsuario.getInstancia().getUsuarios();
    }

    public Usuario buscarUsuario(String cedula) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) != null && usuarios.get(i).getCedula().equals(cedula)) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public void guardarUsuario(Usuario user) {
        Usuario aux = buscarUsuario(user.getCedula());
        if (aux == null) {
            usuarios.add(user);
            SerializadoraUsuario.getInstancia().escribirUsuario();
        }
    }

    public boolean eliminarUsuario(String cedula) {
        Usuario aux = buscarUsuario(cedula);
        if (aux != null) {
            usuarios.remove(aux);
            SerializadoraUsuario.getInstancia().escribirUsuario();
            return true;
        }
        return false;
    }

    public boolean editarEmpleado(Empleado empleado) {
        Empleado aux = buscarEmpleado(empleado.getCedula());
        if (aux != null) {
            aux.setEdad(empleado.getEdad());
            aux.setFechaNacimiento(empleado.getFechaNacimiento());
            aux.setNombre(empleado.getNombre());
            aux.setPassword(empleado.getPassword());
            aux.setTelefono(empleado.getTelefono());
            aux.setCantidadPropiedades(empleado.getCantidadPropiedades());
            aux.setTipoPropiedad(empleado.getTipoPropiedad());
            SerializadoraUsuario.getInstancia().escribirUsuario();
            return true;
        }
        return false;
    }

    public Empleado buscarEmpleado(String cedula) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario user = usuarios.get(i);
            if (user instanceof Empleado) {
                Empleado aux = (Empleado) user;
                if (aux.getCedula().equals(cedula)) {
                    return aux;
                }
            }
        }
        return null;
    }

    Usuario admin = new Usuario("Natalia Sabogal", "123", 19, "17/11/2005", "320511", "123", RolUsuario.ADMINISTRADOR);

    public Usuario logIn(String cedula, String password) {
        if (cedula.equals(admin.getCedula()) && password.equals(admin.getPassword())) {
            return admin;
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getCedula().equals(cedula) && usuarios.get(i).getPassword().equals(password)) {
                    return usuarios.get(i);
                }
            }
            return null;
        }

    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public int obtenerPropiedadesACtivasEmpleado (Empleado empleado){
        Empleado emp = buscarEmpleado(empleado.getCedula());
        int propiedadesActivas = emp.getCantidadPropiedades();
        return propiedadesActivas;
    }

}
