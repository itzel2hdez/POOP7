/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo07;

import Transportes.MediosDeTransporte;

/**
 *
 * @author poo08alu12
 */
public class POO07 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal ("Sparky", "CDMX", "blanco "); 
        
        System.out.println(animal);// otra forma de imprimir 
        System.out.println(animal. toString()); // se imprime porque se llama al toString
        
        AnimalAcuatico animalAcuatico = new AnimalAcuatico ();
        animalAcuatico.setNombre("Max");
        animalAcuatico.setLugarOrigen("CDMX");
        animalAcuatico.setColor("negro");
        animalAcuatico.setNumeroAletas(4);
        
        System.out.println(animalAcuatico); // imprimes atributos del objeto 
        
        Ballena ballena = new Ballena (30, 2 ,"Will", "Artico", "azul");
        System.out.println(ballena);
        
        AnimalTerrestre animalTerrestre = new AnimalTerrestre ();
        animalTerrestre.setNombre("Rocky");
        animalTerrestre.setLugarOrigen("CDMX");
        animalTerrestre.setColor("negro");
        animalTerrestre.setNumeroPatas(4);
       
        System.out.println(animalTerrestre);
        
        Perro perro = new Perro("rojo", 4, "Rocky", "CDMX", "cafe");
        System.out.println(perro);
        
        AnimalAereo animalAereo = new AnimalAereo ();
        animalAereo.setNombre("Max");
        animalAereo.setLugarOrigen("CDMX");
        animalAereo.setColor("negro");
        animalAereo.setNumeroAlas(4);
        
        MediosDeTransporte mediosDeTransporte = new MediosDeTransporte ();
        
                
    }  
}
