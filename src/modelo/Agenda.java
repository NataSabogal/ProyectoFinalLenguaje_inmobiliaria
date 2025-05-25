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
    private LocalDate fecha;
    private Cliente cliente;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private boolean cancelada;
    private int duracionHoras;

    public Agenda(String id, LocalDate fecha, Cliente cliente, LocalTime horaInicio, LocalTime horaFinal, boolean cancelada, int duracionHoras) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.cancelada = cancelada;
        this.duracionHoras = duracionHoras;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

}
