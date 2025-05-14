/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializadora;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Inmueble;

/**
 *
 * @author nataliasabogalrada
 */
public class SerializadoraInmueble {
    private ArrayList<Inmueble> inmuebles;

    public SerializadoraInmueble() {
        this.inmuebles = leerInmueble();
    }

    public ArrayList<Inmueble> getInmueble() {
        return inmuebles;
    }
    
    public void escribirInmueble() {
        try {
            FileOutputStream archivo = new FileOutputStream("src/serializadora/inmuebles.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(inmuebles);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<Inmueble> leerInmueble() {

        try {
            FileInputStream archivo = new FileInputStream("src/serializadora/inmuebles.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<Inmueble> lista = (ArrayList<Inmueble>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
