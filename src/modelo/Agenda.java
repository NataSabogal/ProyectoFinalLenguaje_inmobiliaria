/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author nataliasabogalrada
 */
public class Agenda implements Serializable{

    private String id;
    private Propiedad propiedad;
    private LocalDate fecha;
    private Cliente cliente;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private boolean opcionVisita;
    private String estado;

    public Agenda(String id, Propiedad propiedad, LocalDate fecha, Cliente cliente, LocalTime horaInicio, LocalTime horaFinal, boolean opcionVisita, String estado) {
        this.id = id;
        this.propiedad = propiedad;
        this.fecha = fecha;
        this.cliente = cliente;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.opcionVisita = opcionVisita;
        this.estado = estado;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public boolean isOpcionVisita() {
        return opcionVisita;
    }

    public void setOpcionVisita(boolean opcionVisita) {
        this.opcionVisita = opcionVisita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
