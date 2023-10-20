/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 * Clase que representa medios de transporte aéreos.
 * Extiende la clase abstracta MediosDeTransporte.
 * @author lilian
 */
public class Areos extends MediosDeTransporte {
    /**
     * Atributos específicos para medios de transporte aéreos
     */
    private Double alcance;
    private int cantidadMotores;
    private String tipoAeronave; 

    /**
     * Constructor por defecto.
     */
    public Areos() {
    }
     /**
     * Constructor que inicializa los atributos específicos y los heredados de la clase base.
     * 
     * @param alcance La distancia máxima que puede recorrer la aeronave.
     * @param cantidadMotores La cantidad de motores de la aeronave.
     * @param tipoAeronave El tipo de aeronave.
     * @param color El color de la aeronave.
     * @param longitud La longitud de la aeronave.
     * @param cantidadPasajeros La cantidad de pasajeros que puede transportar la aeronave.
     */

    public Areos(Double alcance, int cantidadMotores, String tipoAeronave, String color, double longitud, double cantidadPasajeros) {
        super(color, longitud, cantidadPasajeros);
        this.alcance = alcance;
        this.cantidadMotores = cantidadMotores;
        this.tipoAeronave = tipoAeronave;
    }
    /**
     * Obtiene el alcance de la aeronave.
     * 
     * @return El alcance de la aeronave.
     */

    public Double getAlcance() {
        return alcance;
    }

    /**
     * Establece el alcance de la aeronave.
     * 
     * @param alcance El nuevo alcance de la aeronave.
     */
    public void setAlcance(Double alcance) {
        this.alcance = alcance;
    }

     /**
     * Obtiene la cantidad de motores de la aeronave.
     * 
     * @return La cantidad de motores de la aeronave.
     */
    public int getCantidadMotores() {
        return cantidadMotores;
    }
    /**
     * Establece la cantidad de motores de la aeronave.
     * 
     * @param cantidadMotores La nueva cantidad de motores de la aeronave.
     */

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }
    /**
     * Obtiene el tipo de aeronave.
     * 
     * @return El tipo de aeronave.
     */

    public String getTipoAeronave() {
        return tipoAeronave;
    }
    /**
     * Establece el tipo de aeronave.
     * 
     * @param tipoAeronave El nuevo tipo de aeronave.
     */

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }
    /**
     * Método que simula el aterrizaje de la aeronave.
     */
    public void aterrizar (){
        System.out.println("Aterrizar la aeronave");
    }
    /**
     * Método que simula el despegue de la aeronave.
     */
    
    public void despegar (){
        System.out.println("Despegará la aeronave ");
    }
    /**
     * Método que indica si la aeronave cuenta con piloto automático.
     */
    public void pilotoAutomatico (){
        System.out.println("Cuenta con piloto automatico ");
    }
     /**
     * Representación en cadena de la instancia Areos, incluyendo sus atributos heredados.
     * 
     * @return Cadena que representa la instancia Areos.
     */

    @Override
    public String toString() {
        return "Areos{" + "alcance=" + alcance + ", cantidadMotores=" + cantidadMotores + ", tipoAeronave=" + tipoAeronave + super.toString() + '}';
    }
    
}
