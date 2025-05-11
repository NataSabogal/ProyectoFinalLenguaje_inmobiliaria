/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nataliasabogalrada
 */
public class Propiedad {

    private String id;
    private String direccion;
    private String ciudad;
    private boolean disponible;
    private double precio;
    private TipoPropiedad tipoP;
    private boolean visita;
    private Empleado empleado;
    private String descripcion;
    private String nombreResponsable;
    private String telefonoResponsable;

    public Propiedad(String id, String direccion, String ciudad, boolean disponible, double precio, TipoPropiedad tipoP, boolean visita, String descripcion, String nombreResponsable, String telefonoResponsable) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.disponible = disponible;
        this.precio = precio;
        this.tipoP = tipoP;
        this.visita = visita;
       // this.empleado = empleado;
        this.descripcion = descripcion;
        this.nombreResponsable = nombreResponsable;
        this.telefonoResponsable = telefonoResponsable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPropiedad getTipoP() {
        return tipoP;
    }

    public void setTipoP(TipoPropiedad tipoP) {
        this.tipoP = tipoP;
    }

    public boolean isVisita() {
        return visita;
    }

    public void setVisita(boolean visita) {
        this.visita = visita;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getTelefonoResponsable() {
        return telefonoResponsable;
    }

    public void setTelefonoResponsable(String telefonoResponsable) {
        this.telefonoResponsable = telefonoResponsable;
    }

}
