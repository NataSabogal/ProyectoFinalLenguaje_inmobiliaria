/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOPropiedad;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Propiedad;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorPropiedad {

    DAOPropiedad daoP;

    public ControladorPropiedad() {
        daoP = new DAOPropiedad();
    }

    public Propiedad buscarPropiedad(String id) {
        return daoP.buscarPropiedad(id);
    }

    public boolean guardarPropiedad(Propiedad propiedad) {
        return daoP.guardarPropiedad(propiedad);
    }

    public DefaultTableModel llenarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Nombre Responsable", "TelefonoResponsable", "ID", "Dirección", "Ciudad", "Disponible", "Precio", "Tipo de Propiedad", "Visita", "Descripción"});
        ArrayList<Propiedad> lista = daoP.getPropiedades();
        for (int i = 0; i < lista.size(); i++) {
            model.addRow(new Object[]{
                lista.get(i).getNombreResponsable(),
                lista.get(i).getTelefonoResponsable(),
                lista.get(i).getId(),
                lista.get(i).getDireccion(),
                lista.get(i).getCiudad(),
                lista.get(i).isDisponible(),
                lista.get(i).getPrecio(),
                lista.get(i).getTipoP(),
                lista.get(i).isVisita(),
                lista.get(i).getDescripcion()

            });

        }
        return model;
    }

}
