/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *La clase Animal representa a un animal con nombre, lugar de origen y color.
 * Extiende la clase Object de Java por defecto.
 * @author poo08alu12
 * Es un animal con nombre, lugar de origen y color
 */
public class Animal extends Object {
    
    private String nombre, lugarOrigen, color;
    /**
     * Constructor vacio 
     */
    public Animal() {
    }
    /**
     * Connstructor lleno 
     * @param nombre : nombre del animal 
     * @param lugarOrigen: lugar de origen del animal 
     * @param color : color del animal 
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Metodo que obtiene el nombre 
     * @return regresa el nombre dle animal 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo set 
     * @param nombre : nombre del animal 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get
     *
     * @return lugar de origen del animal  
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Metodo set 
     * @param lugarOrigen: lugar origen del animal 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Metodo get 
     * @return regresa el color 
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo set 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Método que simula el sonido del animal.
     *
     * @param sonido El sonido que hace el animal.
     */
    
    public void hacerSonido (String sonido) {
        System.out.println("sonido: " + sonido  );
        
    }
    
    /**
     * Método que simula la acción de comer por parte del animal.
     */
    public void comer (){
         System.out.println("Estoy comiendo ");
    }
    /**
     * Sobrescribe el método toString para representar la información del animal.
     *
     * @return Una cadena de texto que representa el objeto Animal.
     */

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
