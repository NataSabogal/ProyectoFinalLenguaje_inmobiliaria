/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class IdInmuebleNoEncontradoException extends Exception{

    public IdInmuebleNoEncontradoException() {
        super("No se encontró el ID del inmueble");
    }
    
}
