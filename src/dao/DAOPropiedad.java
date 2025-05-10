/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Propiedad;

/**
 *
 * @author nataliasabogalrada
 */
public class DAOPropiedad {

    ArrayList<Propiedad> propiedades;

    public DAOPropiedad() {
        propiedades = new ArrayList<>();
    }

    public Propiedad buscarPropiedad(String id) {
        for (int i = 0; i < propiedades.size(); i++) {
            if (propiedades.get(i) != null && propiedades.get(i).getId().equals(id)) {
                return propiedades.get(i);
            }
        }
        return null;
    }

    public boolean guardarPropiedad(Propiedad propiedad) {
        Propiedad aux = buscarPropiedad(propiedad.getId());
        if (aux == null) {
            propiedades.add(propiedad);
            return true;
        }
        return false;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }
    
    

}
