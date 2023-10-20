/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *La clase Trajinera representa un tipo específico de vehículo acuático.
 * Hereda de la clase Acuaticos y agrega atributos y comportamientos específicos.
 * @author lilian
 */
public class Trajinera extends Acuaticos{
        /**
     * Nombre único de la trajinera.
     */
    private String nombre, color;
    /**
     * Capacidad máxima de pasajeros que puede transportar la trajinera.
     */
    private int capicidad;
    /**
     * Constructor por defecto de la clase Trajinera.
     */
    public Trajinera() {
    }

    /**
     * Constructor que inicializa los atributos de la trajinera.
     * 
     * @param nombre            Nombre único de la trajinera.
     * @param capicidad         Capacidad máxima de pasajeros.
     * @param potencialMotor    Tipo de motor de la trajinera.
     * @param tipoPropulsion    Tipo de propulsión de la trajinera.
     * @param materialTransporte Material de construcción del transporte acuático.
     * @param color             Color de la trajinera.
     * @param longitud          Longitud de la trajinera.
     * @param cantidadPasajeros Cantidad máxima de pasajeros permitidos.
     */
    public Trajinera(String nombre,  int capicidad, String potencialMotor, String tipoPropulsion, String materialTransporte, String color, double longitud, double cantidadPasajeros) {
        super(potencialMotor, tipoPropulsion, materialTransporte, color, longitud, cantidadPasajeros);
        this.nombre = nombre;
        this.color = color;
        this.capicidad = capicidad;
    }

     /**
     * Obtiene el nombre de la trajinera.
     * 
     * @return El nombre de la trajinera.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Establece el nombre de la trajinera.
     * 
     * @param nombre El nuevo nombre de la trajinera.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el color de la trajinera.
     * 
     * @return El color de la trajinera.
     */
    @Override
    public String getColor() {
        return color;
    }
    /**
     * Establece el color de la trajinera.
     * 
     * @param color El nuevo color de la trajinera.
     */

    @Override
    public void setColor(String color) {
        this.color = color;
    }
     /**
     * Obtiene la capacidad máxima de pasajeros de la trajinera.
     * 
     * @return La capacidad máxima de pasajeros.
     */

    public int getCapicidad() {
        return capicidad;
    }
     /**
     * Establece la capacidad máxima de pasajeros de la trajinera.
     * 
     * @param capicidad La nueva capacidad máxima de pasajeros.
     */

    public void setCapicidad(int capicidad) {
        this.capicidad = capicidad;
    }
    /**
     * Método que simula la acción de remar en la trajinera.
     */
    public void remar (){
        System.out.println("Hay que remar ");
    }
    /**
     * Método que simula la acción de abordar la trajinera por parte de los pasajeros.
     */
    public void abordar (){
        System.out.println("Abordan los pasajeros");
    }
    /**
     * Método que simula la acción de navegar con la trajinera.
     */
    public void navegar (){
        System.out.println("Hay que navegar ");
    }
     /**
     * Retorna una representación en cadena de la trajinera, incluyendo sus atributos heredados.
     * 
     * @return Una cadena que representa la trajinera.
     */

    @Override
    public String toString() {
        return "Trajinera{" + "nombre=" + nombre + ", color=" + color + ", capicidad=" + capicidad + super.toString() +'}';
    }
    
}
