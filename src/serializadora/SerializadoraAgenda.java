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
import modelo.Agenda;

/**
 *
 * @author nataliasabogalrada
 */
public class SerializadoraAgenda {
    private static final SerializadoraAgenda instance = new SerializadoraAgenda();
    
     private ArrayList<Agenda> agendaVisitas;

    private SerializadoraAgenda() {
        this.agendaVisitas = leerAgenda();
    }
    
    public static SerializadoraAgenda getInstancia(){
        return instance;
    }
    

    public ArrayList<Agenda> getAgenda() {
        return agendaVisitas;
    }
    
    public void escribirAgenda() {
        try {
            FileOutputStream archivo = new FileOutputStream("src/serializadora/agendaVisitas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(agendaVisitas);
            escritor.close();
        } catch (IOException ex) {

        }
    }

    public ArrayList<Agenda> leerAgenda() {

        try {
            FileInputStream archivo = new FileInputStream("src/serializadora/agendaVisitas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<Agenda> lista = (ArrayList<Agenda>) lector.readObject();
            lector.close();
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }
    
}
