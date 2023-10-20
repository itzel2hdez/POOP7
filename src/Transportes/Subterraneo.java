/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *La clase Subterraneo representa un tipo de transporte terrestre subterráneo.
 * Hereda de la clase Terrestres.
 * @author lilian
 */
public class Subterraneo extends Terrestres{
    private String tipoLlantas;
    private int numeroLlantas;
    private Double velocidadMax; 
    /**
     * Constructor por defecto de la clase Subterraneo.
     */

    public Subterraneo() {
    }

    /**
     * Constructor que inicializa los atributos de la clase Subterraneo con valores dados.
     * 
     * @param tipoLlantas     El tipo de llantas del subterráneo.
     * @param velocidadMax    La velocidad máxima del subterráneo.
     * @param numeroLlantas   El número de llantas del subterráneo.
     * @param numeroVentanas  El número de ventanas del subterráneo.
     * @param kilometraje     El kilometraje del subterráneo.
     * @param color           El color del subterráneo.
     * @param longitud        La longitud del subterráneo.
     * @param cantidadPasajeros La cantidad de pasajeros que puede transportar el subterráneo.
     */
    public Subterraneo(String tipoLlantas, Double velocidadMax, int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.tipoLlantas = tipoLlantas;
        this.numeroLlantas = numeroLlantas;
        this.velocidadMax = velocidadMax;
    }

    
    /**
     * Obtiene el tipo de llantas del subterráneo.
     * 
     * @return El tipo de llantas.
     */
    public String getTipoLlantas() {
        return tipoLlantas;
    }

     /**
     * Establece el tipo de llantas del subterráneo.
     * 
     * @param tipoLlantas El nuevo tipo de llantas.
     */
    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
    }
     /**
     * Sobrescribe el método de la clase base para obtener el número de llantas.
     * 
     * @return El número de llantas del subterráneo.
     */

    @Override
    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    /**
     * Sobrescribe el método de la clase base para establecer el número de llantas.
     * 
     * @param numeroLlantas El nuevo número de llantas.
     */
    @Override
    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }
    /**
     * Obtiene la velocidad máxima del subterráneo.
     * 
     * @return La velocidad máxima.
     */

    public Double getVelocidadMax() {
        return velocidadMax;
    }
    /**
     * Establece la velocidad máxima del subterráneo.
     * 
     * @param velocidadMax La nueva velocidad máxima.
     */

    public void setVelocidadMax(Double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
     /**
     * Abre las puertas del subterráneo e imprime un mensaje en la consola.
     */
    
    public void abrirPuertas (){
        System.out.println("Se abren puertas ");
    }
    /**
     * Cierra las puertas del subterráneo e imprime un mensaje en la consola.
     */
    public void cerrarPuertas (){
        System.out.println("Se cierran puertas ");
    }
    /**
     * Informa sobre los problemas del subterráneo e imprime un mensaje en la consola.
     */
    public void informarProblemas (){
        System.out.println("Se informan sobre los problemas ");
    }
    /**
     * Sobrescribe el método toString para proporcionar una representación de cadena
     * de los atributos de la clase Subterraneo.
     * 
     * @return Una cadena que representa el objeto Subterraneo.
     */

    @Override
    public String toString() {
        return "Subterraneo{" + "tipoLlantas=" + tipoLlantas + ", numeroLlantas=" + numeroLlantas + ", velocidadMax=" + velocidadMax + '}';
    }
}
