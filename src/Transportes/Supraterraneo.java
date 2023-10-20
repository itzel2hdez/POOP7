/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *Clase que representa un vehículo supraterraneo que hereda de la clase Terrestres.
 * Contiene atributos específicos para vehículos supraterraneos, como anuncio sonoro,
 * estado de limpieza y tarifa.
 * @author lilian
 */
public class Supraterraneo extends Terrestres {
    private String anuncionSonoro, estadoLimpieza;
    private Double tarifa;
     /**
     * Constructor predeterminado de la clase Supraterraneo.
     */

    public Supraterraneo() {
    }
    /**
     * Constructor que inicializa los atributos específicos de Supraterraneo, así como
     * los heredados de la clase Terrestres.
     *
     * @param anuncionSonoro Anuncio sonoro del vehículo.
     * @param estadoLimpieza Estado de limpieza del vehículo.
     * @param tarifa Tarifa del vehículo.
     * @param numeroLlantas Número de llantas del vehículo (heredado).
     * @param numeroVentanas Número de ventanas del vehículo (heredado).
     * @param kilometraje Kilometraje del vehículo (heredado).
     * @param color Color del vehículo (heredado).
     * @param longitud Longitud del vehículo (heredado).
     * @param cantidadPasajeros Cantidad de pasajeros que puede transportar el vehículo (heredado).
     */

    public Supraterraneo(String anuncionSonoro, String estadoLimpieza, Double tarifa, int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.anuncionSonoro = anuncionSonoro;
        this.estadoLimpieza = estadoLimpieza;
        this.tarifa = tarifa;
    }
    /**
     * Método getter para el atributo anuncioSonoro.
     *
     * @return Anuncio sonoro del vehículo.
     */

    public String getAnuncionSonoro() {
        return anuncionSonoro;
    }

    /**
     * Método setter para el atributo anuncioSonoro.
     *
     * @param anuncionSonoro Nuevo valor para el anuncio sonoro del vehículo.
     */

    public void setAnuncionSonoro(String anuncionSonoro) {
        this.anuncionSonoro = anuncionSonoro;
    }

    /**
     * Método getter para el atributo estadoLimpieza.
     *
     * @return Estado de limpieza del vehículo.
     */
    public String getEstadoLimpieza() {
        return estadoLimpieza;
    }

    /**
     * Método setter para el atributo estadoLimpieza.
     *
     * @param estadoLimpieza Nuevo valor para el estado de limpieza del vehículo.
     */
    public void setEstadoLimpieza(String estadoLimpieza) {
        this.estadoLimpieza = estadoLimpieza;
    }
    /**
     * Método getter para el atributo tarifa.
     *
     * @return Tarifa del vehículo.
     */

    public Double getTarifa() {
        return tarifa;
    }
    /**
     * Método setter para el atributo tarifa.
     *
     * @param tarifa Nueva tarifa para el vehículo.
     */

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
    
    /**
     * Implementación del método frenar para la clase Supraterraneo.
     */
    @Override
    public void frenar (){
        System.out.println("Se debe frenar ");
    }
     /**
     * Método específico para la clase Supraterraneo que simula un accidente.
     */
    public void chocar () {
        System.out.println("Se tuvo un accidente");
    }
    /**
     * Implementación del método acelerar para la clase Supraterraneo.
     */
    @Override
    public void acelerar (){
        System.out.println("Se acelera");
    }
    /**
     * Representación en cadena de la clase Supraterraneo.
     *
     * @return Cadena que representa el objeto Supraterraneo.
     */

    @Override
    public String toString() {
        return "Supraterraneo{" + "anuncionSonoro=" + anuncionSonoro + ", estadoLimpieza=" + estadoLimpieza + ", tarifa=" + tarifa + "," + super.toString()+  '}';
    }
}
