/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class UsuarioNoEncontradoException extends Exception {

    public UsuarioNoEncontradoException() {
        super("No se encontró un usuario con esa cédula");
    }
    
}
