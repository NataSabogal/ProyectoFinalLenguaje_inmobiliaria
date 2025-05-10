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
public class ControladorInmueble {
    
    DAOInmueble daoI;

    public ControladorInmueble() {
        daoI = new DAOInmueble();
    }

    public Inmueble buscarInmueble(String id) {
        return daoI.buscarInmueble(id);
    }

    public boolean guardarInmueble(Inmueble inmueble) {
        return daoI.guardarInmueble(inmueble);
    }

    public ArrayList<Inmueble> getInmuebles() {
        return daoI.getInmuebles();
    }
    
//    public DefaultTableModel llenarTabla() {
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(new String[]{"Nombre Responsable", "TelefonoResponsable", "ID", "Dirección", "Ciudad", "Disponible", "Precio", "Tipo de Propiedad", "Visita", "Descripción"});
//        ArrayList<Inmueble> lista = daoI.getInmuebles();
//        for (int i = 0; i < lista.size(); i++) {
//            model.addRow(new Object[]{
//                lista.get(i).getNombreResponsable(),
//                lista.get(i).getTelefonoResponsable(),
//                lista.get(i).getId(),
//                lista.get(i).getDireccion(),
//                lista.get(i).getCiudad(),
//                lista.get(i).isDisponible(),
//                lista.get(i).getPrecio(),
//                lista.get(i).getTipoP(),
//                lista.get(i).isVisita(),
//                lista.get(i).getDescripcion()
//
//            });
//
//        }
//        return model;
//    }
    
    
}
