/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.DAOInmueble;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class ControladorVentanaPrincipalCliente {

    DAOInmueble daoI;

    public ControladorVentanaPrincipalCliente() {
        daoI = new DAOInmueble();
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }

    public DefaultTableModel llenar() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Dirección", "Descripción", "Tipo", "Precio", "Nombre del Responsable", "Telefono del Responsable"});
        ArrayList<Inmueble> inmLista = daoI.getInmuebles();
        for (int i = 0; i < inmLista.size(); i++) {
            if (inmLista.get(i).isActivo()) {
                model.addRow(new Object[]{
                    inmLista.get(i).getId(),
                    inmLista.get(i).getPropiedad().getDireccion(),
                    inmLista.get(i).getDescripcion(),
                    inmLista.get(i).getTipo(),
                    inmLista.get(i).getPrecio(),
                    inmLista.get(i).getEmpleado().getNombre(),
                    inmLista.get(i).getEmpleado().getTelefono()

                });
            }

        }
        return model;
    }

}
