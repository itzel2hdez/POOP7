/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *La clase Helicoptero representa un tipo específico de aeronave aérea.
 * Extiende la clase Areos para heredar sus atributos y comportamientos.
 *
 * @author lilian
 */
public class Helicoptero extends Areos {
    private String modelo;
    private int pasajeros,asientos; 
    /**
     * Constructor por defecto de la clase Helicoptero.
     */

    public Helicoptero() {
    }
    /**
     * Constructor que inicializa los atributos de la clase Helicoptero.
     *
     * @param modelo           El modelo del helicóptero.
     * @param pasajeros        El número de pasajeros del helicóptero.
     * @param asientos         El número de asientos disponibles en el helicóptero.
     * @param alcance          El alcance de la aeronave.
     * @param cantidadMotores  La cantidad de motores del helicóptero.
     * @param tipoAeronave     El tipo de aeronave.
     * @param color            El color del helicóptero.
     * @param longitud         La longitud de la aeronave.
     * @param cantidadPasajeros La cantidad total de pasajeros que puede transportar la aeronave.
     */

    public Helicoptero(String modelo, int pasajeros, int asientos, Double alcance, int cantidadMotores, String tipoAeronave, String color, double longitud, double cantidadPasajeros) {
        super(alcance, cantidadMotores, tipoAeronave, color, longitud, cantidadPasajeros);
        this.modelo = modelo;
        this.pasajeros = pasajeros;
        this.asientos = asientos;
    }
    /**
     * Método getter para obtener el modelo del helicóptero.
     *
     * @return El modelo del helicóptero.
     */

    public String getModelo() {
        return modelo;
    }
    /**
     * Método setter para establecer el modelo del helicóptero.
     *
     * @param modelo El nuevo modelo del helicóptero.
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Método getter para obtener el número de pasajeros del helicóptero.
     *
     * @return El número de pasajeros del helicóptero.
     */

    public int getPasajeros() {
        return pasajeros;
    }
    /**
     * Método setter para establecer el número de pasajeros del helicóptero.
     *
     * @param pasajeros El nuevo número de pasajeros del helicóptero.
     */

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
     /**
     * Método getter para obtener el número de asientos disponibles en el helicóptero.
     *
     * @return El número de asientos disponibles en el helicóptero.
     */

    public int getAsientos() {
        return asientos;
    }
    /**
     * Método setter para establecer el número de asientos disponibles en el helicóptero.
     *
     * @param asientos El nuevo número de asientos disponibles en el helicóptero.
     */

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    
    /**
     * Implementación del método despegar de la clase base.
     * Imprime un mensaje indicando que el helicóptero está por despegar.
     */
    @Override
    public void despegar (){
        System.out.println("El helicoptero esta pro despegar ");
    }
    /**
     * Implementación del método aterrizar de la clase base.
     * Imprime un mensaje indicando que el helicóptero está aterrizando.
     */
    @Override
    public void aterrizar (){
        System.out.println("El helicoptero esta aterrizando ");
    }
     /**
     * Método específico de Helicoptero que imprime un mensaje indicando que el helicóptero está acelerando.
     */
    public void acelerar (){
        System.out.println("El helicoptero esta acelerando ");
    }
    /**
     * Implementación del método toString para obtener una representación en cadena del objeto Helicoptero.
     *
     * @return Una cadena que representa el objeto Helicoptero.
     */

    @Override
    public String toString() {
        return "Helicoptero{" + "modelo=" + modelo + ", pasajeros=" + pasajeros + ", asientos=" + asientos + '}';
    } 
}
