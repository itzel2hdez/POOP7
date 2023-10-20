/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * Indicamos que esta clase pertenece al paquete "Transportes"
 */
package Transportes;

/**
 *La clase Avion representa un tipo específico de vehículo aéreo.
 * Extiende la clase Areos y agrega propiedades y métodos específicos para un avión.
 * 
 * @author lilian
 */
public class Avion extends Areos{
    private String modelo, diseñoInterior;
    private int añoFabricacion;
    /**
     * Constructor por defecto de la clase Avion.
     */

    public Avion() {
    }
    
    /**
     * Constructor parametrizado que inicializa las propiedades de la clase Avion.
     * 
     * @param modelo           El modelo del avión.
     * @param diseñoInterior   El diseño interior del avión.
     * @param añoFabricacion   El año de fabricación del avión.
     * @param alcance          El alcance del avión.
     * @param cantidadMotores  La cantidad de motores del avión.
     * @param tipoAeronave     El tipo de aeronave.
     * @param color            El color del avión.
     * @param longitud         La longitud del avión.
     * @param cantidadPasajeros La cantidad de pasajeros que puede transportar el avión.
     */

    public Avion(String modelo, String diseñoInterior, int añoFabricacion, Double alcance, int cantidadMotores, String tipoAeronave, String color, double longitud, double cantidadPasajeros) {
        super(alcance, cantidadMotores, tipoAeronave, color, longitud, cantidadPasajeros);
        this.modelo = modelo;
        this.diseñoInterior = diseñoInterior;
        this.añoFabricacion = añoFabricacion;
    }
    /**
     * Método getter para obtener el modelo del avión.
     * @return 
     */

    public String getModelo() {
        return modelo;
    }
    /**
     * Método setter para establecer el modelo del avión.
     * @param modelo 
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Método getter para obtener el diseño interior del avión.
     * @return 
     */

    public String getDiseñoInterior() {
        return diseñoInterior;
    }
    /**
     * Método setter para establecer el diseño interior del avión.
     * @param diseñoInterior 
     */

    public void setDiseñoInterior(String diseñoInterior) {
        this.diseñoInterior = diseñoInterior;
    }
    /**
     * Método getter para obtener el año de fabricación del avión.
     * @return 
     */

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    /**
     * Método setter para establecer el año de fabricación del avión.
     * @param añoFabricacion 
     */

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    /**
     * Método override para indicar que el avión está por despegar.
     */
    
    @Override
    public void despegar (){
        System.out.println("El avion esta por despegar ");
    }
    /**
     * Método override para indicar que el avión está por aterrizar.
     */
    @Override
    public void aterrizar (){
        System.out.println("El avion esta por aterrizar ");
    }
    /**
     * Método específico de la clase Avion para indicar que el avión está girando.
     */
    public void girar () {
        System.out.println("El avion esta girando ");
    }
    /**
     * Método override para obtener una representación en cadena de la instancia de la clase Avion.
     * @return 
     */

    @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", diseñoInterior=" + diseñoInterior + ", añoFabricacion=" + añoFabricacion + '}';
    }
    
}
