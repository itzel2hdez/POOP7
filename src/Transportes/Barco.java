/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Este archivo pertenece al paquete "Transportes". 
 * La clase representa un Barco, que es una subclase de la clase Acuaticos.
 *
 */
package Transportes;

/**
 *La clase Barco extiende la clase Acuaticos e implementa funcionalidades específicas para los barcos.
 * Además de heredar propiedades acuáticas, agrega propiedades como nombre, tripulación y color.
 * También incluye métodos para acciones específicas de un barco, como remar, abordar y navegar.
 * La clase proporciona métodos de acceso (getters y setters) para todas sus propiedades.
 *
 * @author lilian
 */
public class Barco extends Acuaticos {
    private String color, nombre;
    private int tripulacion;
    /**
     * Constructor predeterminado de Barco.
     */

    public Barco() {
    }
    
    /**
     * Constructor que inicializa las propiedades del Barco.
     *
     * @param nombre              Nombre del barco.
     * @param tripulacion         Número de tripulantes.
     * @param potencialMotor      Tipo de motor del transporte acuático.
     * @param tipoPropulsion      Tipo de propulsión del transporte acuático.
     * @param materialTransporte  Material del que está hecho el transporte acuático.
     * @param color               Color del barco.
     * @param longitud            Longitud del barco.
     * @param cantidadPasajeros   Capacidad de pasajeros del barco.
     */

    public Barco(String nombre, int tripulacion, String potencialMotor, String tipoPropulsion, String materialTransporte, String color, double longitud, double cantidadPasajeros) {
        super(potencialMotor, tipoPropulsion, materialTransporte, color, longitud, cantidadPasajeros);
        this.color = color;
        this.nombre = nombre;
        this.tripulacion = tripulacion;
    }

    /**
     * Métodos de acceso para la propiedad 'color'
     * @return 
     */
    @Override
    public String getColor() {
        return color;
    }
    /**
     * Asigna el valor del color 
     * @param color 
     */

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Métodos de acceso para la propiedad 'nombre'
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Métodos de acceso para la propiedad tripulacion
     * @return 
     */

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }
    /**
     * Método que simula la acción de remar en el barco.
     */
    public void remar (){
        System.out.println("Estoy remando ");
    }
    /**
     * Método que simula la acción de abordar el barco por parte de los pasajeros.
     */
    public void abordar (){
        System.out.println("Los pasajeros abordan ");
    }
    /**
     * Método que simula la acción de navegar con el barco.
     */
    public void navegar () {
        System.out.println("Estoy navegando ");
    }
    /**
     * Representación en cadena del objeto Barco.
     *
     * @return Cadena que describe el estado actual del objeto Barco.
     */

    @Override
    public String toString() {
        return "Barco{" + "color=" + color + ", nombre=" + nombre + ", tripulacion=" + tripulacion + super.toString() + '}';
    }  
}
