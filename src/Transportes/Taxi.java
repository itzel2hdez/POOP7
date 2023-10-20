/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *
 * @author lilian
 */
public class Taxi extends Supraterraneo {
    private String color, modelo, placas;
    
    /**
     * Constructor por defecto que no recibe parámetros.
     */

    public Taxi() {
    }

    /**
     * Constructor que inicializa los atributos de la clase y de la clase padre 'Supraterraneo'.
     * 
     * @param color Color del taxi.
     * @param modelo Modelo del taxi.
     * @param placas Número de placas del taxi.
     * @param anuncionSonoro
     * @param estadoLimpieza Estado de limpieza del taxi (heredado de 'Supraterraneo').
     * @param tarifa Tarifa del taxi (heredada de 'Supraterraneo').
     * @param numeroLlantas Número de llantas del taxi (heredado de 'Supraterraneo').
     * @param numeroVentanas Número de ventanas del taxi (heredado de 'Supraterraneo').
     * @param kilometraje Kilometraje del taxi (heredado de 'Supraterraneo').
     * @param longitud Longitud del taxi (heredada de 'Supraterraneo').
     * @param cantidadPasajeros Cantidad de pasajeros del taxi (heredada de 'Supraterraneo').
     */
    public Taxi(String color, String modelo, String placas, String anuncionSonoro, String estadoLimpieza, Double tarifa, int numeroLlantas, int numeroVentanas, Double kilometraje,  double longitud, double cantidadPasajeros) {
        super(anuncionSonoro, estadoLimpieza, tarifa, numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.color = color;
        this.modelo = modelo;
        this.placas = placas;
    }

     /**
     * Obtiene el color del taxi.
     * 
     * @return El color del taxi.
     */
    @Override
    public String getColor() {
        return color;
    }
    /**
     * Establece el color del taxi.
     * 
     * @param color El nuevo color del taxi.
     */

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Obtiene el modelo del taxi.
     * 
     * @return El modelo del taxi.
     */

    public String getModelo() {
        return modelo;
    }
    /**
     * Establece el modelo del taxi.
     * 
     * @param modelo El nuevo modelo del taxi.
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Obtiene el número de placas del taxi.
     * 
     * @return El número de placas del taxi.
     */

    public String getPlacas() {
        return placas;
    }

     /**
     * Establece el número de placas del taxi.
     * 
     * @param placas El nuevo número de placas del taxi.
     */
    public void setPlacas(String placas) {
        this.placas = placas;
    }
    /**
     * Método que imprime un mensaje indicando que el taxi está avanzando.
     */
    public void avanzar (){
        System.out.println("Se esta avanzando  ");
    }
    /**
     * Método heredado de 'Supraterraneo' que imprime un mensaje indicando que el taxi está frenando.
     */
    @Override
    public void frenar () {
        System.out.println("Se esta frenando ");
    }
    /**
     * Método que imprime un mensaje indicando que se están recogiendo un número específico de pasajeros.
     * 
     * @param pasajeros Número de pasajeros que se están recogiendo.
     */
    public void recoger(int pasajeros){
        System.out.println("Se recojen "+ pasajeros + "pasajeros ");
    }
}
