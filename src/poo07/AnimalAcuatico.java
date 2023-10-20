/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *Clase que representa un Animal Acuático, hereda de la clase Animal.
 * Esta clase añade características específicas para animales acuáticos.
 * @author poo08alu12
 */
public class AnimalAcuatico extends Animal {
    /**
     * Número de aletas del animal acuático.
     */
    private int numeroAletas; 
    /**
     * Constructor por defecto de AnimalAcuatico.
     */
    
    public AnimalAcuatico(){
    }
    /**
     * Constructor de AnimalAcuatico que permite inicializar las propiedades.
     * @param numeroAletas Número de aletas del animal acuático.
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     */

    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color); //super hace referencia al constructor, se llama al constructor de animal 
        this.numeroAletas = numeroAletas;
    }

    /**
     * Obtiene el número de aletas del animal acuático.
     * @return Número de aletas.
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * Establece el número de aletas del animal acuático.
     * @param numeroAletas Número de aletas a establecer.
     */

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
     
    /**
     * Método que representa la acción de nadar por parte del animal acuático.
     */
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    
    /**
     * Método sobreescrito que representa la acción de comer para un animal acuático.
     * Muestra un mensaje específico para esta subclase.
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo un pez");
    }
    //sobreescrito desde la clase object
    /**
     * Método sobreescrito de la clase Object que proporciona una representación
     * en cadena del objeto AnimalAcuatico.
     * @return Representación en cadena del objeto.
     */
    @Override
    public String toString() { // llamas atributos de animal acuatico 
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas + " , " + super.toString() + '}';
    }
}   
    
