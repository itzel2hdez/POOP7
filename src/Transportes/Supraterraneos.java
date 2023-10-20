/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *   
 */
package Transportes;

/**
 ** Clase que representa vehículos supraterrestres que heredan propiedades de vehículos terrestres.
 * Contiene información adicional como anuncio sonoro, estado de limpieza y tarifa.
 * @author lilian
 */
public class Supraterraneos extends Terrestres {
    private String anuncioSonoro, estadoLimpieza;
    private Double tarifa; 
    /**
     * Constructor predeterminado sin parámetros.
     */

    public Supraterraneos() {
    }
     /**
     * Constructor que inicializa las propiedades de Supraterraneos y hereda propiedades de Terrestres.
     *
     * @param anuncioSonoro   Descripción del anuncio sonoro del vehículo.
     * @param estadoLimpieza  Estado de limpieza del vehículo.
     * @param tarifa          Tarifa asociada al vehículo.
     * @param numeroLlantas   Número de llantas del vehículo terrestre.
     * @param numeroVentanas  Número de ventanas del vehículo terrestre.
     * @param kilometraje     Kilometraje recorrido por el vehículo terrestre.
     * @param color           Color del vehículo terrestre.
     * @param longitud        Longitud del vehículo terrestre.
     * @param cantidadPasajeros Número de pasajeros que puede transportar el vehículo terrestre.
     */

    public Supraterraneos(String anuncioSonoro, String estadoLimpieza, Double tarifa, int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.anuncioSonoro = anuncioSonoro;
        this.estadoLimpieza = estadoLimpieza;
        this.tarifa = tarifa;
    }
    /**
     * Obtiene el anuncio sonoro del vehículo.
     *
     * @return Anuncio sonoro del vehículo.
     */

    public String getAnuncioSonoro() {
        return anuncioSonoro;
    }
    /**
     * Establece el anuncio sonoro del vehículo.
     *
     * @param anuncioSonoro Descripción del anuncio sonoro.
     */

    public void setAnuncioSonoro(String anuncioSonoro) {
        this.anuncioSonoro = anuncioSonoro;
    }
    /**
     * Obtiene el estado de limpieza del vehículo.
     *
     * @return Estado de limpieza del vehículo.
     */

    public String getEstadoLimpieza() {
        return estadoLimpieza;
    }
    /**
     * Establece el estado de limpieza del vehículo.
     *
     * @param estadoLimpieza Estado de limpieza del vehículo.
     */

    public void setEstadoLimpieza(String estadoLimpieza) {
        this.estadoLimpieza = estadoLimpieza;
    }

    /**
     * Obtiene la tarifa asociada al vehículo.
     *
     * @return Tarifa asociada al vehículo.
     */

    public Double getTarifa() {
        return tarifa;
    }
    /**
     * Establece la tarifa asociada al vehículo.
     *
     * @param tarifa Tarifa asociada al vehículo.
     */


    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
    /**
     * Inicia el servicio del vehículo imprimiendo un mensaje.
     */
    public void iniciarSerivicio (){
        System.out.println("Se inicia el servicio ");
    }
     /**
     * Finaliza el servicio del vehículo imprimiendo un mensaje.
     */
    public void finalizarServicio () {
        System.out.println("Se finaliza el servicio ");
    }
    /**
     * Anuncia la parada del vehículo imprimiendo un mensaje.
     */
    public void anuciarParada(){
        System.out.println("Se anuncia la parada ");
    }
    /**
     * Sobrescribe el método toString para obtener una representación de cadena de Supraterraneos
     * que incluye los atributos heredados y los específicos de esta clase.
     *
     * @return Representación de cadena de Supraterraneos.
     */

    @Override
    public String toString() {
        return "Supraterraneos{" + "anuncioSonoro=" + anuncioSonoro + ", estadoLimpieza=" + estadoLimpieza + ", tarifa=" + tarifa + "," + super.toString() + '}';
    }
}
