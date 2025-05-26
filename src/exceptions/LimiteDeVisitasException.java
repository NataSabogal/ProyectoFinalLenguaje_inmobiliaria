/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class LimiteDeVisitasException extends Exception{

    public LimiteDeVisitasException() {
        super("El cliente solo podra tener como maximo 2 visitas activas");
    }
    
}
