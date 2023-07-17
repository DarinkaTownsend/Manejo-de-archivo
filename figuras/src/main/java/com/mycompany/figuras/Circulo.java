/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author darin
 */
public class Circulo extends Figura{
   private double radio;
   private String nombre;
   private int cantidad;

    public Circulo(double radio, String nombre, int cantidad) {
        this.radio = radio;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
   @Override
    public String toString(){
        return "Nombre: "+ this.nombre+ ",Radio: "+ this.radio+ ",Cantidad: " + this.cantidad;
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
   
   @Override
    public void calcularArea(){
        
    }
    
    
}
