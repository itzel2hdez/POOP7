/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *Clase Combi que hereda de la clase Supraterraneos y representa un tipo de transporte terrestre.
 * Contiene información específica de una combi, como la ruta, número de pasajeros y destino.
 *
*/
package Transportes;

/**
 *La clase Combi representa un tipo de transporte terrestre, heredando características de la clase Supraterraneos.
 *Contiene información específica de una combi, como la ruta, número de pasajeros y destino.
 *
 * @author lilian
 */
public class Combi extends Supraterraneos {
    private int ruta, numeroPsajeros;
    private String destino; 
    
    /**
     * Constructor vacío de la clase Combi.
     */

    public Combi() {
    }
    /**
     * Constructor que inicializa los atributos de la clase Combi con valores proporcionados.
     *
     * @param ruta              Número de la ruta de la combi.
     * @param numeroPsajeros   Número de pasajeros permitidos en la combi.
     * @param destino           Destino al que se dirige la combi.
     * @param anuncioSonoro     Anuncio sonoro del transporte.
     * @param estadoLimpieza    Estado de limpieza del transporte.
     * @param tarifa            Tarifa del transporte.
     * @param numeroLlantas     Número de llantas del transporte.
     * @param numeroVentanas    Número de ventanas del transporte.
     * @param kilometraje       Kilometraje recorrido por el transporte.
     * @param color             Color del transporte.
     * @param longitud          Longitud del transporte.
     * @param cantidadPasajeros Cantidad total de pasajeros que puede transportar.
     */

    public Combi(int ruta, int numeroPsajeros, String destino, String anuncioSonoro, String estadoLimpieza, Double tarifa, int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(anuncioSonoro, estadoLimpieza, tarifa, numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.ruta = ruta;
        this.numeroPsajeros = numeroPsajeros;
        this.destino = destino;
    }
     /**
     * Obtiene el número de la ruta de la combi.
     *
     * @return Número de la ruta.
     */

    public int getRuta() {
        return ruta;
    }
    
    /**
     * Establece el número de la ruta de la combi.
     *
     * @param ruta Número de la ruta.
     */

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
     /**
     * Obtiene el número de pasajeros permitidos en la combi.
     *
     * @return Número de pasajeros.
     */

    public int getNumeroPsajeros() {
        return numeroPsajeros;
    }
    /**
     * Establece el número de pasajeros permitidos en la combi.
     *
     * @param numeroPsajeros Número de pasajeros.
     */

    public void setNumeroPsajeros(int numeroPsajeros) {
        this.numeroPsajeros = numeroPsajeros;
    }
    /**
     * Obtiene el destino al que se dirige la combi.
     *
     * @return Destino de la combi.
     */

    public String getDestino() {
        return destino;
    }
    /**
     * Establece el destino al que se dirige la combi.
     *
     * @param destino Destino de la combi.
     */

    public void setDestino(String destino) {
        this.destino = destino;
    }
    /**
     * Implementación del método acelerar de la clase padre. Imprime un mensaje indicando que la combi va a acelerar.
     */
    @Override
    public void acelerar(){
        System.out.println("Voy a acelerar ");
    }
    /**
     * Implementación del método frenar de la clase padre. Imprime un mensaje indicando que la combi va a frenar.
     */
    @Override
    public void frenar(){
        System.out.println("Voy a frenar ");
    }
     /**
     * Método específico de la clase Combi. Imprime un mensaje indicando que hubo un accidente.
     */
    public void chocar (){
        System.out.println("Hubo un accidente ");
    }
    /**
     * Implementación del método toString que devuelve una representación en cadena de la instancia de la clase Combi.
     *
     * @return Cadena que representa la información de la combi.
     */

    @Override
    public String toString() {
        return "Combi{" + "ruta=" + ruta + ", numeroPsajeros=" + numeroPsajeros + ", destino=" + destino + super.toString() + '}';
    }
}
