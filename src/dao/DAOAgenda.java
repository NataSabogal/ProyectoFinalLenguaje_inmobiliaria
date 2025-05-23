/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Agenda;
import modelo.Inmueble;
import serializadora.SerializadoraAgenda;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOAgenda {

    public DAOAgenda() {
        SerializadoraAgenda.getInstancia().getAgenda();
    }

    public Agenda buscarAgendaPorId(String id, Inmueble inm) {
        for (int i = 0; i < inm.getAgendas().size(); i++) {
            if (inm.getAgendas().get(i) != null && inm.getAgendas().get(i).getId().equals(id) && inm.isVisita()) {
                return inm.getAgendas().get(i);
            }
        }
        return null;

    }
    
    public void guardarAgenda (Agenda agenda, Inmueble inm){
        Agenda aux = buscarAgendaPorId(agenda.getId(), inm);
        if (aux == null) {
           inm.getAgendas().add(agenda);
           SerializadoraAgenda.getInstancia().escribirAgenda();
        }
    }
}
