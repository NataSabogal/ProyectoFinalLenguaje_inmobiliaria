/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOEmpleado;
import modelo.Empleado;

/**
 *
 * @author nataliasabogalrada
 */
public class ContoladorEmpleado {

    DAOEmpleado daoE;

    public ContoladorEmpleado() {
        daoE = new DAOEmpleado();
    }

    public Empleado buscarEmpleado(String cedula) {
        return daoE.buscarEmpleado(cedula);
    }

    public boolean guardarEmpleado(Empleado empleado) {
        return daoE.guardarEmpleado(empleado);
    }
    
    
    
}
