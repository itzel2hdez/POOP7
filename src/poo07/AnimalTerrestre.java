/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *La clase AnimalTerrestre extiende la clase base Animal e incluye características específicas
 * para animales terrestres, como el número de patas.
 * @author lilian
 */
public class AnimalTerrestre extends Animal{
    /** 
     * Número de patas del animal terrestre.
     */
    private int numeroPatas;
    
    /**
     * Constructor predeterminado de la clase AnimalTerrestre.
     */

    public AnimalTerrestre() {
    }
    /**
     * Constructor parametrizado de la clase AnimalTerrestre.
     *
     * @param numeroPatas Número de patas del animal terrestre.
     * @param nombre Nombre del animal.
     * @param lugarOrigen Lugar de origen del animal.
     * @param color Color del animal.
     */

    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
        /**
     * Obtiene el número de patas del animal terrestre.
     *
     * @return Número de patas del animal terrestre.
     */
        
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * Establece el número de patas del animal terrestre.
     *
     * @param numeroPatas Número de patas a establecer.
     */

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Método que representa la acción de correr por parte del animal terrestre.
     */
    
    public void correr (){
        System.out.println("Estoy corriendo ");
    }
     /**
     * Sobrescribe el método comer de la clase base (Animal) para proporcionar una
     * implementación específica para los animales terrestres.
     */
    
    @Override
    public void comer (){
        System.out.println("Estoy comiendo una galleta ");
    }
    /**
     * Sobrescribe el método toString para proporcionar una representación de cadena
     * del objeto AnimalTerrestre, incluyendo el número de patas y otras características.
     *
     * @return Representación de cadena del objeto AnimalTerrestre.
     */
    
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + "," + super.toString() + '}';
    } 
}
