/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Agenda;
import modelo.Inmueble;
import serializadora.SerializadoraInmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOAgenda {

    public DAOAgenda() {
        SerializadoraInmueble.getInstancia().getInmueble();
    }

    public Agenda buscarAgendaPorId(String id, Inmueble inm) {
        for (int i = 0; i < inm.getAgendas().size(); i++) {
            if (inm.getAgendas().get(i) != null && inm.getAgendas().get(i).getId().equals(id)) {
                return inm.getAgendas().get(i);
            }
        }
        return null;

    }

    public void guardarAgenda(Agenda agenda, Inmueble inm) {
        Agenda aux = buscarAgendaPorId(agenda.getId(), inm);
        if (aux == null) {
            inm.getAgendas().add(agenda);
            SerializadoraInmueble.getInstancia().escribirInmueble();
        }
    }

    public boolean eliminarAgendaPorId (String id, Inmueble inm) {
        Agenda aux = buscarAgendaPorId(id, inm);
        if (aux != null) {
            inm.getAgendas().remove(aux);
            SerializadoraInmueble.getInstancia().escribirInmueble();
            return true;
        }
        return false;
    }

    public void cancelarTodasLasAgendas(Inmueble inm) {
        inm.getAgendas().clear();
        SerializadoraInmueble.getInstancia().escribirInmueble();
    }

}
