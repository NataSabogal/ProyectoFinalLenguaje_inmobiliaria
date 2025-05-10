/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nataliasabogalrada
 */
public class Agenda {

    private String id;
    private Propiedad propiedad;
    private String fecha;
    private Cliente cliente;
    private int horaInicio;
    private int horaFinal;
    private boolean opcionVisita;

    public Agenda(String id, Propiedad propiedad, String fecha, Cliente cliente, int horaInicio, int horaFinal, boolean opcionVisita) {
        this.id = id;
        this.propiedad = propiedad;
        this.fecha = fecha;
        this.cliente = cliente;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.opcionVisita = opcionVisita;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public boolean isOpcionVisita() {
        return opcionVisita;
    }

    public void setOpcionVisita(boolean opcionVisita) {
        this.opcionVisita = opcionVisita;
    }

}
