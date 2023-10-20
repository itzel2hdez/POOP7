/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo07;

/**
 *La clase Perro representa un animal terrestre que hereda características de la clase AnimalTerrestre.
 * Además de las características heredadas, un perro tiene un color de collar específico y puede realizar
 * trucos. Esta clase proporciona métodos para acceder y modificar el color del collar.
 * @author lilian
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    /**
     * Constructor por defecto de la clase Perro.
     */

    public Perro() {
    }
    
    /**
     * Constructor de la clase Perro que permite establecer todas las características, incluido el color del collar.
     *
     * @param colorCollar Color del collar del perro.
     * @param numeroPatas Número de patas del perro.
     * @param nombre Nombre del perro.
     * @param lugarOrigen Lugar de origen del perro.
     * @param color Color del pelaje del perro.
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    /**
     * Método getter para obtener el color del collar del perro.
     *
     * @return El color del collar del perro.
     */
    public String getColorCollar() {
        return colorCollar;
    }
    
    /**
     * Método setter para establecer el color del collar del perro.
     *
     * @param colorCollar El nuevo color del collar del perro.
     */
    
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Método que representa la acción de hacer trucos. Imprime un mensaje indicando que el perro está realizando trucos.
     */
    public void hacerTrucos(){
        System.out.println("Hago trucos");
    }

    /**
     * Sobrescribe el método toString de la clase padre para incluir información específica del perro.
     *
     * @return Una cadena que representa el objeto Perro.
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + super.toString() + '}';
    }     
}
