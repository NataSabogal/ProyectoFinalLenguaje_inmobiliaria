/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nataliasabogalrada
 */
public class Propiedad {
    
    private String direccion;
    private String ciudad;
    private int numHabitaciones;
    private int nunBanios;
    private int numPlantas;

    public Propiedad(String direccion, String ciudad, int numHabitaciones, int nunBanios, int numPlantas) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.numHabitaciones = numHabitaciones;
        this.nunBanios = nunBanios;
        this.numPlantas = numPlantas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNunBanios() {
        return nunBanios;
    }

    public void setNunBanios(int nunBanios) {
        this.nunBanios = nunBanios;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }
    
    
    
}
