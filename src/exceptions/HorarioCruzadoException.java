/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class HorarioCruzadoException extends Exception{

    public HorarioCruzadoException() {
        super("El horario se cruza con otra agenda del mismo inmueble");
    }
    
}
