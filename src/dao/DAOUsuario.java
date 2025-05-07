/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Empleado;
import modelo.RolUsuario;
import modelo.Usuario;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOUsuario {

    ArrayList<Usuario> usuarios;

    public DAOUsuario() {
        usuarios = new ArrayList<>();
    }

    public Usuario buscarUsuario(String cedula) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i) != null && usuarios.get(i).getCedula().equals(cedula)) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public boolean guardarUsuario(Usuario user) {
        Usuario aux = buscarUsuario(user.getCedula());
        if (aux == null) {
            usuarios.add(user);
            return true;
        }
        return false;
    }

    public boolean eliminarUsuario(String cedula) {
        Usuario aux = buscarUsuario(cedula);
        if (aux != null) {
            usuarios.remove(aux);
            return true;
        }
        return false;
    }

    public boolean editarUsuario(Usuario user) {
        Usuario aux = buscarUsuario(user.getCedula());
        if (aux != null) {
            aux.setEdad(user.getEdad());
            aux.setFechaNacimiento(user.getFechaNacimiento());
            aux.setNombre(user.getNombre());
            aux.setPassword(user.getPassword());
            aux.setTelefono(user.getTelefono());
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
    
    
}
