/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author nataliasabogalrada
 */
public class CantidadDePropiedadesNoCoincidenException extends Exception {

    public CantidadDePropiedadesNoCoincidenException() {
        super("La cantidad de propiedades que puede gestionar llego a su limité");
    }
    
}
