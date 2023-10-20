/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *La clase MediosDeTransporte representa objetos que pueden transportar pasajeros.
 * Esta clase hereda de la clase Object de Java.
 * @author lilian
 */
public class MediosDeTransporte extends Object {
    private String color;
    private double longitud, cantidadPasajeros;
      /**
     * Constructor predeterminado de la clase MediosDeTransporte.
     * Inicializa los atributos a sus valores por defecto.
     */

    public MediosDeTransporte() {
    }
    /**
     * Constructor parametrizado de la clase MediosDeTransporte.
     * @param color Color del medio de transporte.
     * @param longitud Longitud del medio de transporte.
     * @param cantidadPasajeros Cantidad máxima de pasajeros que puede transportar.
     */

    public MediosDeTransporte(String color, double longitud, double cantidadPasajeros) {
        this.color = color;
        this.longitud = longitud;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    /**
     * Método para obtener el color del medio de transporte.
     * @return Color del medio de transporte.
     */

    public String getColor() {
        return color;
    }
    
    /**
     * Método para establecer el color del medio de transporte.
     * @param color Nuevo color del medio de transporte.
     */

    public void setColor(String color) {
        this.color = color;
    }
     /**
     * Método para obtener la longitud del medio de transporte.
     * @return Longitud del medio de transporte.
     */

    public double getLongitud() {
        return longitud;
    }
    /**
     * Método para establecer la longitud del medio de transporte.
     * @param longitud Nueva longitud del medio de transporte.
     */

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Método para obtener la cantidad máxima de pasajeros que puede transportar el medio de transporte.
     * @return Cantidad máxima de pasajeros.
     */
    public double getCantidadPasajeros() {
        return cantidadPasajeros;
    }
    /**
     * Método para establecer la cantidad máxima de pasajeros que puede transportar el medio de transporte.
     * @param cantidadPasajeros Nueva cantidad máxima de pasajeros.
     */

    public void setCantidadPasajeros(double cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    /**
     * Método que simula dejar a un número específico de pasajeros.
     * @param pasajeros Número de pasajeros que se dejan.
     */
    
    public void dejarPasajeros(int pasajeros){
        System.out.println("Dejo" + pasajeros );
    }
    /**
     * Método que simula recoger a un número específico de pasajeros.
     * @param pasajeros Número de pasajeros que se recogen.
     */

    public void recogerPasajeros (int pasajeros){
        System.out.println("Recojo "+ pasajeros );
    }
    /**
     * Método que simula recibir mantenimiento.
     */
    public void recibirMantenimeinto (){
        System.out.println("Recibe mantenimeinto ");
    }
    /**
     * Método que proporciona una representación en cadena del objeto MediosDeTransporte.
     * @return Cadena que representa el objeto MediosDeTransporte.
     */

    @Override
    public String toString() {
        return "MediosDeTransporte{" + "color=" + color + ", longitud=" + longitud + ", cantidadPasajeros=" + cantidadPasajeros + '}';
    }
}
