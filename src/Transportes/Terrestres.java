/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *La clase Terrestres representa medios de transporte terrestres y hereda
 * atributos y métodos de la clase abstracta MediosDeTransporte.
 * @author lilian
 */
public class Terrestres extends MediosDeTransporte {
    private int numeroLlantas, numeroVentanas;
    private Double kilometraje;

    /**
     * Constructor por defecto de la clase Terrestres.
     */
    public Terrestres() {
    }

    /**
     * Constructor que inicializa los atributos específicos de medios de transporte
     * terrestres, así como los atributos heredados de la clase base.
     * 
     * @param numeroLlantas    Número de llantas del medio de transporte.
     * @param numeroVentanas   Número de ventanas del medio de transporte.
     * @param kilometraje      Kilometraje recorrido por el medio de transporte.
     * @param color            Color del medio de transporte.
     * @param longitud         Longitud del medio de transporte.
     * @param cantidadPasajeros Cantidad de pasajeros que puede transportar.
     */
    public Terrestres(int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(color, longitud, cantidadPasajeros);
        this.numeroLlantas = numeroLlantas;
        this.numeroVentanas = numeroVentanas;
        this.kilometraje = kilometraje;
    }

    /**
     * Obtiene el número de llantas del medio de transporte.
     * 
     * @return Número de llantas.
     */
    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    /**
     * Establece el número de llantas del medio de transporte.
     * 
     * @param numeroLlantas Número de llantas a establecer.
     */
    
    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }
    /**
     * Obtiene el número de ventanas del medio de transporte.
     * 
     * @return Número de ventanas.
     */

    public int getNumeroVentanas() {
        return numeroVentanas;
    }
    
    /**
     * Establece el número de ventanas del medio de transporte.
     * 
     * @param numeroVentanas Número de ventanas a establecer.
     */

    public void setNumeroVentanas(int numeroVentanas) {
        this.numeroVentanas = numeroVentanas;
    }
     /**
     * Obtiene el kilometraje recorrido por el medio de transporte.
     * 
     * @return Kilometraje recorrido.
     */

    public Double getKilometraje() {
        return kilometraje;
    }
    /**
     * Establece el kilometraje recorrido por el medio de transporte.
     * 
     * @param kilometraje Kilometraje a establecer.
     */

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    /**
     * Simula la acción de frenar del medio de transporte terrestre.
     */

    public void frenar (){
        System.out.println("Se frena ");
    }
    /**
     * Simula la acción de acelerar del medio de transporte terrestre.
     */
    public void acelerar (){
        System.out.println("Se acelera ");
    }
    /**
     * Simula la acción de encender el medio de transporte terrestre.
     */
    public void encender (){
        System.out.println("Se enciende ");
    }

    /**
     * Representación de cadena de la clase Terrestres, incluyendo sus atributos
     * específicos y los heredados de la clase base.
     * 
     * @return Cadena representativa de la instancia de la clase Terrestres.
     */
    @Override
    public String toString() {
        return "Terrestres{" + "numeroLlantas=" + numeroLlantas + ", numeroVentanas=" + numeroVentanas + ", kilometraje=" + kilometraje + "," + super.toString() +'}';
    }
}
