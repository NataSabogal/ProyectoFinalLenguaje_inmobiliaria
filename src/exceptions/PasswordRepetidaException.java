/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class PasswordRepetidaException extends Exception{

    public PasswordRepetidaException() {
        super("Ya se encunetra en uso esa contraseña");
    }
    
}
