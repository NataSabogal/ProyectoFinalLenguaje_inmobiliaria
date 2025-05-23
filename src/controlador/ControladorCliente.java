/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOUsuario;
import exceptions.CedulaEnUsoException;
import exceptions.PasswordRepetidaException;
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

    public void guardarCliente(Cliente cliente) throws CedulaEnUsoException, PasswordRepetidaException{
        Usuario user = buscarUsuario(cliente.getCedula());
        if (user != null) {
            throw new CedulaEnUsoException();
        }
        Usuario aux = buscarUsuario(cliente.getPassword());
        if (aux != null) {
            throw new PasswordRepetidaException();
        }
        daoU.guardarUsuario(cliente);
    }

    public boolean eliminarCliente(String cedula) {
        return daoU.eliminarUsuario(cedula);
    }

    public ArrayList<Usuario> getUsuarios() {
        return daoU.getUsuarios();
    }
    
    
    
}
