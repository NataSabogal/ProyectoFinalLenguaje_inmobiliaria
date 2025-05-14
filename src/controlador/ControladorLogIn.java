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
public class ControladorLogIn {
    
    private DAOUsuario daoU;

    public ControladorLogIn() {
        daoU = new DAOUsuario();
    }

    public Usuario logIn(String cedula, String password) {
        return daoU.logIn(cedula, password);
    }
    
}
