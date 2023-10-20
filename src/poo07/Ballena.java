/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *La clase Ballena representa a una ballena, que es un tipo de Animal Acuático.
 * Extiende la clase AnimalAcuatico y agrega atributos específicos de una ballena, como el largo.
 * @author poo08alu12
 */
public class Ballena extends AnimalAcuatico {
    
    /** 
     * Atributo que representa el largo de la ballena.
     */
    private int largo; 
    /**
     * Constructor predeterminado de Ballena.
     */

    public Ballena() {
    }

    
    /**
     * Constructor parametrizado de Ballena.
     * @param largo Longitud de la ballena.
     * @param numeroAletas Número de aletas de la ballena.
     * @param nombre Nombre de la ballena.
     * @param lugarOrigen Lugar de origen de la ballena.
     * @param color Color de la ballena.
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    /**
     * Método getter para obtener el largo de la ballena.
     * @return El largo de la ballena.
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Método setter para establecer el largo de la ballena.
     * @param largo El nuevo largo de la ballena.
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Método que representa la acción de una ballena al pelear con Pinocho.
     */
    public void peleaConPinocho(){
        System.out.println("estoy peleando ");
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación de cadena de la Ballena.
     * @return Representación de cadena que incluye los atributos de la Ballena y de la clase base.
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + super.toString() +'}';
    }
    
}