/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class MismoTipoParaEditarException extends Exception{

    public MismoTipoParaEditarException() {
        super("Para editarlo asegurese de que sea el mismo tipo de quien se asignó");
    }
    
}
