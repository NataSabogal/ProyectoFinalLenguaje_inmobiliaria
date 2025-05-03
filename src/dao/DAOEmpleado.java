/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOEmpleado {

    ArrayList<Empleado> empleados;

    public DAOEmpleado() {
        empleados = new ArrayList<>();
    }

    public Empleado buscarEmpleado(String cedula) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i) != null && empleados.get(i).getCedula().equals(cedula)) {
                return empleados.get(i);
            }
        }
        return null;
    }

    public boolean guardarEmpleado(Empleado empleado) {
        Empleado aux = buscarEmpleado(empleado.getCedula());
        if (aux == null) {
            empleados.add(empleado);
            return true;
        }
        return false;
    }
}
