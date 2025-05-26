/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class MensajePendienteException extends Exception {

    public MensajePendienteException() {
        super("El encargado debe de dar respuesta antes de volver a enviar un nuevo mensaje");
    }
    
}
