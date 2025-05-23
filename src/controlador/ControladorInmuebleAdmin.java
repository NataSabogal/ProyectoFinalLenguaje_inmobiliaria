/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import dao.DAOUsuario;
import java.util.ArrayList;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorInmuebleAdmin {

    DAOInmueble daoI;
    DAOUsuario daoU;

    public ControladorInmuebleAdmin() {
        daoI = new DAOInmueble();
        daoU = new DAOUsuario();
    }

    public ArrayList<Inmueble> getInmuebles() {
        return daoI.getInmuebles();
    }

    public boolean editarInmuebleConEmpleado (Inmueble inmueble) {
        Inmueble aux = daoI.buscarInmueble(inmueble.getId());
        if (aux != null && inmueble.getEmpleado().getCedula().equals(aux.getEmpleado().getCedula())) {
            return daoI.editarInmueble(inmueble);
        }
        return false;
    }

}
