/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOUsuario;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorCliente {
    
    private DAOUsuario daoU;

    public ControladorCliente() {
        daoU = new DAOUsuario();
    }

    public Usuario buscarUsuario(String cedula) {
        return daoU.buscarUsuario(cedula);
    }

    public boolean guardarCliente(Cliente cliente) {
        return daoU.guardarUsuario(cliente);
    }

    public boolean eliminarCliente(String cedula) {
        return daoU.eliminarUsuario(cedula);
    }

    public ArrayList<Usuario> getUsuarios() {
        return daoU.getUsuarios();
    }
    
    
    
}
