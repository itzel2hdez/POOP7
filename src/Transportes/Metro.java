/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *Clase que representa un objeto de tipo Metro, que hereda de la clase Subterraneo.
 * Un Metro tiene características adicionales como la línea a la que pertenece, el número de vagones
 * y el número de estaciones que recorre.
 * @author lilian
 */
public class Metro extends Subterraneo {
    private String linea;
    private int numeroVagones, numeroEstaciones;
    /**
     * Constructor por defecto de la clase Metro.
     */

    public Metro() {
    }

     /**
     * Constructor que permite crear un objeto de tipo Metro con todas sus características.
     * @param linea La línea a la que pertenece el metro.
     * @param numeroVagones El número de vagones del metro.
     * @param numeroEstaciones El número de estaciones que recorre el metro.
     * @param tipoLlantas Tipo de llantas del metro.
     * @param velocidadMax Velocidad máxima del metro.
     * @param numeroLlantas Número de llantas del metro.
     * @param numeroVentanas Número de ventanas del metro.
     * @param kilometraje Kilometraje recorrido por el metro.
     * @param color Color del metro.
     * @param longitud Longitud del metro.
     * @param cantidadPasajeros Cantidad de pasajeros que puede transportar el metro.
     */
    public Metro(String linea, int numeroVagones, int numeroEstaciones, String tipoLlantas, Double velocidadMax, int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(tipoLlantas, velocidadMax, numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.linea = linea;
        this.numeroVagones = numeroVagones;
        this.numeroEstaciones = numeroEstaciones;
    }
    
    /**
     * Obtiene la línea a la que pertenece el metro.
     * @return La línea del metro.
     */

    public String getLinea() {
        return linea;
    }
    /**
     * Establece la línea a la que pertenece el metro.
     * @param linea La línea del metro.
     */

    public void setLinea(String linea) {
        this.linea = linea;
    }
    /**
     * Obtiene el número de vagones del metro.
     * @return El número de vagones.
     */

    public int getNumeroVagones() {
        return numeroVagones;
    }
    /**
     * Establece el número de vagones del metro.
     * @param numeroVagones El número de vagones.
     */

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }
    /**
     * Obtiene el número de estaciones que recorre el metro.
     * @return El número de estaciones.
     */

    public int getNumeroEstaciones() {
        return numeroEstaciones;
    }
     /**
     * Establece el número de estaciones que recorre el metro.
     * @param numeroEstaciones El número de estaciones.
     */

    public void setNumeroEstaciones(int numeroEstaciones) {
        this.numeroEstaciones = numeroEstaciones;
    }
    
    /**
     * Realiza labores de limpieza en el metro.
     */
    
    public void realizarLimpieza (){
        System.out.println("Se relizan labores de limpieza ");
    }
    /**
     * Informa sobre problemas que pueda tener el metro.
     */
    public void infromarProblema (){
        System.out.println("Se informan los problemas ");
    }
    /**
     * Verifica la seguridad del metro.
     */
    public void verificarSeguridad (){
        System.out.println("Se verifica la seguridad");
    }

    /**
     * Override del método toString para proporcionar una representación en cadena del objeto.
     * @return Representación en cadena del objeto Metro.
     */
    @Override
    public String toString() {
        return "Metro{" + "linea=" + linea + ", numeroVagones=" + numeroVagones + ", numeroEstaciones=" + numeroEstaciones + ","+ super.toString() + '}';
    }
}
