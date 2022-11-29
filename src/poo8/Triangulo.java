/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo8;

/**
 *
 * @author javierluna
 */
public class Triangulo extends Poligono{
    private int alpha,beta,gamma;
    private float a,b,c;
    private float base, altura;

    public Triangulo() {
    }

    public Triangulo(int alpha, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    
    public double area(){
        return(base*altura);
    }
    public double perimetro(){
        return a*b*c;
    }
    
    @Override
    public String toString() {
        return "Triangulo";
    }

    
    
}
