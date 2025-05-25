/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class HorarioLaboralException extends Exception{

    public HorarioLaboralException() {
        super("El horario elegido está fuera del horario laboral permitido o supera el tiempo máximo permitido dentro de este");
    }
    
}
