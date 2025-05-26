/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class MismoEmpleadoParaInmuebleException extends Exception{

    public MismoEmpleadoParaInmuebleException() {
        super("Debe de ser el mismo empleado quien edite el inmueble");
    }
    
}
