/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 *
 * @author javierluna
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a,b;
    private float base, altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    
     public double area(){
        return(base*altura);
    }
    public double perimetro(){
        return a*b*2;
    }
    
    @Override
    public String toString() {
        return "Cuadrilatero";
    }
    
    

    
    
}
