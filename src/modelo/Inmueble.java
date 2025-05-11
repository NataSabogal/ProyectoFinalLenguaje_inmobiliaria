/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nataliasabogalrada
 */
public class Inmueble {
    
    private String id;
    private Propiedad propiedad;
    private double precio;
    private TipoPropiedad tipo;
    private boolean visita;
    private boolean disponible;
    private Empleado empleado;
    private String descripcion;
    private String nombreResponsable;
    private String telResponsable;

    public Inmueble(String id, Propiedad propiedad, double precio, TipoPropiedad tipo, boolean visita, boolean disponible, Empleado empleado, String descripcion, String nombreResponsable, String telResponsable) {
        this.id = id;
        this.propiedad = propiedad;
        this.precio = precio;
        this.tipo = tipo;
        this.visita = visita;
        this.disponible = disponible;
        this.empleado = empleado;
        this.descripcion = descripcion;
        this.nombreResponsable = nombreResponsable;
        this.telResponsable = telResponsable;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPropiedad getTipo() {
        return tipo;
    }

    public void setTipo(TipoPropiedad tipo) {
        this.tipo = tipo;
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

    public String getTelResponsable() {
        return telResponsable;
    }

    public void setTelResponsable(String telResponsable) {
        this.telResponsable = telResponsable;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
