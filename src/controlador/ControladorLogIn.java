/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.RolDeUsuarios.Rol;
import modelo.Usuario;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorLogIn {

    Usuario admin = new Usuario("Natalia Sabogal", "123", 19, "17/11/2005", "320511", "123", Rol.ADMINISTRADOR);
    ArrayList<Usuario> usuarios;

    public ControladorLogIn() {
        usuarios = new ArrayList<>();
    }

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

}
