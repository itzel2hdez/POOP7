/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportes;

/**
 *La clase Acuaticos representa medios de transporte acuáticos y hereda de la clase abstracta MediosDeTransporte.
 *
 * @author lilian
 */
public class Acuaticos extends MediosDeTransporte{
    /**
     * Atributos específicos de la clase Acuaticos
     */
    private String potencialMotor, tipoPropulsion, materialTransporte;
    /**
     * Constructor por defecto de la clase Acuaticos.
     */

    public Acuaticos() {
    }
     /**
     * Constructor parametrizado de la clase Acuaticos.
     *
     * @param potencialMotor      El potencial del motor del medio de transporte acuático.
     * @param tipoPropulsion      El tipo de propulsión del medio de transporte acuático.
     * @param materialTransporte  El material del que está hecho el transporte acuático.
     * @param color               El color del medio de transporte.
     * @param longitud            La longitud del medio de transporte acuático.
     * @param cantidadPasajeros   La cantidad de pasajeros que puede transportar el medio de transporte acuático.
     */

    public Acuaticos(String potencialMotor, String tipoPropulsion, String materialTransporte, String color, double longitud, double cantidadPasajeros) {
        super(color, longitud, cantidadPasajeros);
        this.potencialMotor = potencialMotor;
        this.tipoPropulsion = tipoPropulsion;
        this.materialTransporte = materialTransporte;
    }
    /**
     * Obtiene el potencial del motor del medio de transporte acuático.
     *
     * @return El potencial del motor.
     */
    public String getPotencialMotor() {
        return potencialMotor;
    }
    /**
     * Establece el potencial del motor del medio de transporte acuático.
     *
     * @param potencialMotor El potencial del motor a establecer.
     */

    public void setPotencialMotor(String potencialMotor) {
        this.potencialMotor = potencialMotor;
    }
    /**
     * Obtiene el tipo de propulsión del medio de transporte acuático.
     *
     * @return El tipo de propulsión.
     */

    public String getTipoPropulsion() {
        return tipoPropulsion;
    }
    /**
     * Establece el tipo de propulsión del medio de transporte acuático.
     *
     * @param tipoPropulsion El tipo de propulsión a establecer.
     */

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }
     /**
     * Obtiene el material del que está hecho el medio de transporte acuático.
     *
     * @return El material del transporte acuático.
     */

    public String getMaterialTransporte() {
        return materialTransporte;
    }
    /**
     * Establece el material del que está hecho el medio de transporte acuático.
     *
     * @param materialTransporte El material a establecer.
     */

    public void setMaterialTransporte(String materialTransporte) {
        this.materialTransporte = materialTransporte;
    }
    /**
     * Enciende el motor del medio de transporte acuático e imprime un mensaje.
     */
    
    public void encenderMotor (){
        System.out.println("Se enciende el motor ");
    }
    /**
     * Combustible al medio de transporte acuático e imprime un mensaje con la cantidad de litros recargados.
     *
     * @param litros La cantidad de litros a recargar.
     */

    public void abastecerCombustible(int litros){
        System.out.println("Se recarga " + litros + " de combustible");
    }
    /**
     * Modifica la ruta del medio de transporte acuático e imprime un mensaje con la nueva ruta.
     *
     * @param ruta La nueva ruta a establecer.
     */
    public void modificarRuta (int ruta){
        System.out.println("Se cambia la ruta  " + ruta );
    }
    /**
     * Sobrescribe el método toString para representar la información de la clase Acuaticos.
     *
     * @return Representación en cadena de la instancia de la clase Acuaticos.
     */
    @Override
    public String toString() {
        return "Acuaticos{" + "potencialMotor=" + potencialMotor + ", tipoPropulsion=" + tipoPropulsion + ", materialTransporte=" + materialTransporte + super.toString()+ '}';
    }
    
}