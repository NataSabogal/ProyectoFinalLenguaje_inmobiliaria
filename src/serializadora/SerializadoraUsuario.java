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
import modelo.Usuario;

/**
 *
 * @author nataliasabogalrada
 */
public class SerializadoraUsuario {
    
    private static final  SerializadoraUsuario instance = new SerializadoraUsuario();

    private ArrayList<Usuario> usuarios;

    private SerializadoraUsuario() {
        this.usuarios = leerUsuarios();
    }
    public static SerializadoraUsuario getInstancia(){
        return instance;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void escribirUsuario() {
        try {
            FileOutputStream archivo = new FileOutputStream("src/serializadora/usuarios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(usuarios);
            System.out.println("escribe");
            escritor.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Usuario> leerUsuarios() {

        try {
            FileInputStream archivo = new FileInputStream("src/serializadora/usuarios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            ArrayList<Usuario> lista = (ArrayList<Usuario>) lector.readObject();
            lector.close();
            System.out.println("leer");
            return lista;
        } catch (IOException | ClassNotFoundException ex) {
            //ex.printStackTrace();
            return new ArrayList<>();
        }
    }

}
