/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOUsuario {

    ArrayList<Usuario> listaUsuarios;

    public DAOUsuario() {
        listaUsuarios = new ArrayList<>();
    }

    public Usuario buscarUsuario(String cedula) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i) != null && listaUsuarios.get(i).getCedula().equals(cedula)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public boolean guardarUsuario(Usuario usuario) {
        Usuario aux = buscarUsuario(usuario.getCedula());
        if (aux == null) {
            listaUsuarios.add(usuario);
            return true;
        }
        return false;
    }
}
