/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *Clase que representa un Pájaro, que extiende la clase AnimalAereo.
 * @author lilian
 */
public class Pajaro extends AnimalAereo{
    /**
     * Tipo de pico del pájaro.
     */
    private String tipoPico;

    /**
     * Constructor por defecto de la clase Pajaro.
     */
    public Pajaro() {
    }

    /**
     * Constructor que inicializa las propiedades del Pájaro.
     *
     * @param tipoPico       Tipo de pico del pájaro.
     * @param numeroAlas     Número de alas del pájaro.
     * @param nombre         Nombre del pájaro.
     * @param lugarOrigen    Lugar de origen del pájaro.
     * @param color          Color del pájaro.
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    /**
     * Obtiene el tipo de pico del pájaro.
     *
     * @return Tipo de pico del pájaro.
     */
    public String getTipoPico() {
        return tipoPico;
    }

    
    /**
     * Establece el tipo de pico del pájaro.
     *
     * @param tipoPico Nuevo tipo de pico del pájaro.
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    
    /**
     * Realiza la acción de recolectar ramas.
     */
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }

     /**
     * Representación de cadena del objeto Pájaro.
     *
     * @return Cadena que representa el objeto Pájaro.
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + super.toString() + '}';
    }   
}
