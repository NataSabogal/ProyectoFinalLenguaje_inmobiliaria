/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nataliasabogalrada
 */
public class Empleado extends Usuario{
    
    private int cantidadPropiedades;
    private TipoPropiedad tipoPropiedad;

    public Empleado(int cantidadPropiedades, TipoPropiedad tipoPropiedad, String nombre, String cedula, int edad, String fechaNacimiento, String telefono, String password, RolUsuario rol) {
        super(nombre, cedula, edad, fechaNacimiento, telefono, password, rol);
        this.cantidadPropiedades = cantidadPropiedades;
        this.tipoPropiedad = tipoPropiedad;
    }

    public int getCantidadPropiedades() {
        return cantidadPropiedades;
    }

    public void setCantidadPropiedades(int cantidadPropiedades) {
        this.cantidadPropiedades = cantidadPropiedades;
    }

    public TipoPropiedad getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(TipoPropiedad tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }
    
}
