/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Agenda;
import serializadora.SerializadoraAgenda;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOAgenda {

    private ArrayList<Agenda> agendaDeVisitas;
   

    public DAOAgenda() {
        this.agendaDeVisitas = SerializadoraAgenda.getInstancia().getAgenda();

    }

    public Agenda buscarAgenda(String id) {
        for (int i = 0; i < agendaDeVisitas.size(); i++) {
            if (agendaDeVisitas.get(i) != null && agendaDeVisitas.get(i).getId().equals(id)) {
                return agendaDeVisitas.get(i);
            }
        }
        return null;
    }

    public boolean guardarAgenda(Agenda agenda) {
        Agenda aux = buscarAgenda(agenda.getId());
        if (aux == null) {
            agendaDeVisitas.add(agenda);
            SerializadoraAgenda.getInstancia().escribirAgenda();
            return true;

        }
        return false;
    }

    
}
