/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 * La clase Suburbano extiende la clase Subterraneo, heredando sus atributos y métodos.
 * Representa un tipo de transporte suburbano con características específicas.
 *
 * @author lilian
 */
public class Suburbano extends Subterraneo {
    private String materialVagones, conductorAsignado;
    private Boolean publicidadInterna; 
    
    /**
     * Constructor predeterminado de la clase Suburbano.
     */


    public Suburbano() {
    }
    /**
     * Constructor que inicializa los atributos de la clase Suburbano y llama al
     * constructor de la clase base (Subterraneo) mediante 'super'.
     *
     * @param materialVagones    Material de los vagones del suburbano.
     * @param conductorAsignado Nombre del conductor asignado al suburbano.
     * @param publicidadInterna  Indica si hay publicidad interna en el suburbano.
     * @param tipoLlantas        Tipo de llantas del transporte.
     * @param velocidadMax       Velocidad máxima del transporte.
     * @param numeroLlantas      Número de llantas del transporte.
     * @param numeroVentanas     Número de ventanas en el transporte.
     * @param kilometraje        Kilometraje del transporte.
     * @param color              Color del transporte.
     * @param longitud           Longitud del transporte.
     * @param cantidadPasajeros  Cantidad máxima de pasajeros en el transporte.
     */

    public Suburbano(String materialVagones, String conductorAsignado, Boolean publicidadInterna, String tipoLlantas, Double velocidadMax, int numeroLlantas, int numeroVentanas, Double kilometraje, String color, double longitud, double cantidadPasajeros) {
        super(tipoLlantas, velocidadMax, numeroLlantas, numeroVentanas, kilometraje, color, longitud, cantidadPasajeros);
        this.materialVagones = materialVagones;
        this.conductorAsignado = conductorAsignado;
        this.publicidadInterna = publicidadInterna;
    }

    /**
     * Obtiene el material de los vagones del suburbano.
     *
     * @return Material de los vagones.
     */
    public String getMaterialVagones() {
        return materialVagones;
    }

    /**
     * Establece el material de los vagones del suburbano.
     *
     * @param materialVagones Material de los vagones.
     */
    public void setMaterialVagones(String materialVagones) {
        this.materialVagones = materialVagones;
    }
    /**
     * Obtiene el nombre del conductor asignado al suburbano.
     *
     * @return Nombre del conductor asignado.
     */

    public String getConductorAsignado() {
        return conductorAsignado;
    }
    /**
     * Establece el nombre del conductor asignado al suburbano.
     *
     * @param conductorAsignado Nombre del conductor asignado.
     */

    public void setConductorAsignado(String conductorAsignado) {
        this.conductorAsignado = conductorAsignado;
    }
    /**
     * Verifica si hay publicidad interna en el suburbano.
     *
     * @return true si hay publicidad interna, false en caso contrario.
     */

    public Boolean getPublicidadInterna() {
        return publicidadInterna;
    }
     /**
     * Establece la presencia de publicidad interna en el suburbano.
     *
     * @param publicidadInterna true si hay publicidad interna, false en caso contrario.
     */

    public void setPublicidadInterna(Boolean publicidadInterna) {
        this.publicidadInterna = publicidadInterna;
    }
    /**
     * Método que simula el proceso de abordaje en el suburbano.
     */
    public void abordar (){
        System.out.println("Se esta abordando la unidad ");
    }
    /**
     * Método que simula el proceso de descenso de pasajeros en el suburbano.
     */
    public void bajar (){
        System.out.println("Se desciende de la unidad ");
    }
    /**
     * Método que simula el recorrido de la ruta por parte del suburbano.
     */

    public void recorrer (){
        System.out.println("Se recorre dicha ruta ");
    }
     /**
     * Devuelve una representación en cadena del objeto Suburbano,
     * incluyendo sus atributos específicos y los heredados de Subterraneo.
     *
     * @return Representación en cadena del objeto Suburbano.
     */

    @Override
    public String toString() {
        return "Suburbano{" + "materialVagones=" + materialVagones + ", conductorAsignado=" + conductorAsignado + ", publicidadInterna=" + publicidadInterna + "," + super.toString() + '}';
    }
}
