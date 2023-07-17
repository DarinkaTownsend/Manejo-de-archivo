/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author darin
 */
public class Cuadrado implements Figura,Dibujable {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }
    
    
    
    @Override
    public void calcularArea(){
        
    }
    
    public void dibujar(){
        System.out.println("Estoy dibujando un cuadrado");
    }
    
    
}
