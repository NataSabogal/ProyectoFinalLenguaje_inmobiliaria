/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nataliasabogalrada
 */
public class Inmueble implements Serializable {

    private String id;
    private Propiedad propiedad;
    private double precio;
    private TipoPropiedad tipo;
    private boolean visita;
    private Estado estado;
    private Empleado empleado;
    private String descripcion;
    private ArrayList<Agenda> agendas;
    private ArrayList<Mensaje> mensajes;

    public Inmueble(String id, Propiedad propiedad, double precio, TipoPropiedad tipo, boolean visita, Estado estado, Empleado empleado, String descripcion) {
        this.id = id;
        this.propiedad = propiedad;
        this.precio = precio;
        this.tipo = tipo;
        this.visita = visita;
        this.estado = estado;
        this.empleado = empleado;
        this.descripcion = descripcion;
        this.agendas = new ArrayList<>();
        this.mensajes = new ArrayList<>();
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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

    public ArrayList<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(ArrayList<Agenda> agendas) {
        this.agendas = agendas;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public boolean isActivo() {
        return this.estado == Estado.DISPONIBLE;
    }

    public boolean PropiedadesCerradas() {
        return this.estado == Estado.ARRENDADO || this.estado == Estado.VENDIDO;
    }

    public void cambiarEstado(TipoPropiedad tipoPropiedad) {
        if (tipoPropiedad == TipoPropiedad.VENTA) {
            this.estado = Estado.VENDIDO;
        } else if (tipoPropiedad == TipoPropiedad.ARRENDAMIENTO) {
            this.estado = Estado.ARRENDADO;
        }
    }

    @Override
    public String toString() {
        return "ID inmueble: " + id + " Dirección: " + propiedad.getDireccion();
    }
}
