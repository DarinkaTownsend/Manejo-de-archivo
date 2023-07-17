/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

import java.util.ArrayList;

/**
 *
 * @author darin
 */
public class Figuras {

    public static void main(String[] args) {
        ArrayList<Circulo> circulos=Archivos.lecturaArchivo("info.txt");
        for(Circulo c: circulos){
            System.out.println(c);
        }
        
        Archivos.escribirArchivo(circulos, "cirulos.txt");
    }
}
