/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 *
 * @author javierluna
 */
public class Instrumento extends Object implements InstrumentoMusical{
    @Override
    public void tocar (){
        System.out.println("Tocando instrumento del viento");
    }
    @Override
    public void afinar(){
        System.out.println("Afinando instrumento del viento");
    }
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
        
}
