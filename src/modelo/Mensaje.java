/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nataliasabogalrada
 */
public class Mensaje implements Serializable{
    
    private String id;
    private Cliente cliente; 
    private String contenido;
    private Date fechaEnvio;
    private boolean respondido;

    public Mensaje(String id, Cliente cliente, String contenido, Date fechaEnvio, boolean respondido) {
        this.id = id;
        this.cliente = cliente;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
        this.respondido = respondido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public boolean isRespondido() {
        return respondido;
    }

    public void setRespondido(boolean respondido) {
        this.respondido = respondido;
    }
}
