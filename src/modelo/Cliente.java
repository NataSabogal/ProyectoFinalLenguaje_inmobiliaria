/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nataliasabogalrada
 */
public class Cliente extends Usuario{
    
    private String direccionResidencia;
    private String ciudad;
    private String ocupacion;

    public Cliente(String direccionResidencia, String ciudad, String ocupacion, String nombre, String cedula, int edad, String fechaNacimiento, String telefono, String password, RolUsuario rol) {
        super(nombre, cedula, edad, fechaNacimiento, telefono, password, rol);
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        this.ocupacion = ocupacion;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
      
}
