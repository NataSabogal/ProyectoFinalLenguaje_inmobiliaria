/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOUsuario;
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

    public boolean guardarUsuario(Usuario usuario) {
        return daoU.guardarUsuario(usuario);
    }
    
    
    
}
