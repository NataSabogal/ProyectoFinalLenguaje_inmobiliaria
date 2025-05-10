/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOInmueble {
    
    ArrayList<Inmueble> inmuebles;

    public DAOInmueble() {
        inmuebles = new ArrayList<>();
    }
    
    public Inmueble buscarInmueble(String id){
        for (int i = 0; i < inmuebles.size(); i++) {
            if (inmuebles.get(i)!= null && inmuebles.get(i).getId().equals(id)) {
                return inmuebles.get(i);
            }
        }
        return null;
    }
    
    public boolean guardarInmueble(Inmueble inmueble) {
        Inmueble aux = buscarInmueble(inmueble.getId());
        if (aux == null) {
            inmuebles.add(inmueble);
            return true;
        }
        return false;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }
    
    
}
