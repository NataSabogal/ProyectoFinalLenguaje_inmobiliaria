/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Empleado;
import modelo.Inmueble;
import serializadora.SerializadoraInmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOInmueble {

    private ArrayList<Inmueble> inmuebles;

    public DAOInmueble() {
        this.inmuebles = SerializadoraInmueble.getInstancia().getInmueble();
    }

    public Inmueble buscarInmueble(String id) {
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i) != null && inmuebles.get(i).getId().equals(id)) {
                return inmuebles.get(i);
            }
        }
        return null;
    }

    public void guardarInmueble(Inmueble inmueble) {
        Inmueble aux = buscarInmueble(inmueble.getId());
        if (aux == null) {
            inmuebles.add(inmueble);
            SerializadoraInmueble.getInstancia().escribirInmueble();
        }
    }

    public boolean eliminarPropiedad(String id) {
        Inmueble aux = buscarInmueble(id);
        if (aux != null) {
            inmuebles.remove(aux);
            SerializadoraInmueble.getInstancia().escribirInmueble();
            return true;
        }
        return false;
    }

    public boolean editarInmueble(Inmueble inmueble) {
        Inmueble aux = buscarInmueble(inmueble.getId());
        if (aux != null) {
            aux.setDescripcion(inmueble.getDescripcion());
            aux.setEstado(inmueble.getEstado());
            aux.setPrecio(inmueble.getPrecio());
            aux.getPropiedad().setCiudad(inmueble.getPropiedad().getCiudad());
            aux.getPropiedad().setDireccion(inmueble.getPropiedad().getDireccion());
            aux.getPropiedad().setNumHabitaciones(inmueble.getPropiedad().getNumHabitaciones());
            aux.getPropiedad().setNumPlantas(inmueble.getPropiedad().getNumPlantas());
            aux.getPropiedad().setNunBanios(inmueble.getPropiedad().getNunBanios());
            aux.setVisita(inmueble.isVisita());
            SerializadoraInmueble.getInstancia().escribirInmueble();
            return true;
        }
        return false;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public int InmueblesActivosPorEmpleado(Empleado empleado) {
        int cont = 0;
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i).getEmpleado().equals(empleado) && inmuebles.get(i).isActivo()) {
                cont++;
            }
        }
        return cont;
    }

}
