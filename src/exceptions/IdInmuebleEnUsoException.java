/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class IdInmuebleEnUsoException extends Exception{

    public IdInmuebleEnUsoException() {
        super("El ID del inmueble ya esta en uso");
    }
    
}
