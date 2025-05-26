/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author nataliasabogalrada
 */
public class Mensaje implements Serializable {

    private String id;
    private String contenido;
    private String respuesta;
    private Cliente cliente;

    public Mensaje(String id, String contenido, String respuesta, Cliente cliente) {
        this.id = id;
        this.contenido = contenido;
        this.respuesta = respuesta;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean estaRespondido() {
        return respuesta != null && !respuesta.isEmpty();
    }
}
