/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *Este archivo pertenece al paquete poo07.
 * La clase AnimalAereo extiende la clase Animal y representa a un animal aéreo.
 * @author lilian
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;
     /**
     * Constructor por defecto de la clase AnimalAereo.
     */
    
    public AnimalAereo (){
    }
    
    /**
     * Constructor que inicializa los atributos de la clase AnimalAereo.
     *
     * @param numeroAlas   Número de alas del animal aéreo.
     * @param nombre        Nombre del animal.
     * @param lugarOrigen   Lugar de origen del animal.
     * @param color         Color del animal.
     */

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Obtiene el número de alas del animal aéreo.
     *
     * @return Número de alas del animal aéreo.
     */

    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Establece el número de alas del animal aéreo.
     *
     * @param numeroAlas Nuevo número de alas del animal aéreo.
     */

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Método que representa la acción de volar del animal aéreo.
     */
    public void volar () {
        System.out.println("Estoy volando");
    }
    /**
     * Sobrescribe el método comer de la clase base para representar la acción
     * específica de comer de un animal aéreo.
     */
    @Override
    public void comer () {
        System.out.println("Estoy comiendo un gusano");
    }
    
    /**
     * Genera una cadena de texto que representa el objeto AnimalAereo.
     *
     * @return Cadena de texto que representa el objeto AnimalAereo.
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + "," + super.toString() + '}';
    }
    
}
