/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author darin
 */
public class Archivos {
    
    public static ArrayList<Circulo> lecturaArchivo(String nombreArchivo){
        ArrayList<Circulo> circulos= new ArrayList<>();
        try{
            FileReader archivo= new FileReader(nombreArchivo);
            BufferedReader br= new BufferedReader(archivo);
            String linea;
            while((linea= br.readLine())!= null){
                if(!linea.equals("Figura,cantidad,dimension")){
                    String[] datos= linea.split(",");
                    String nombre= datos[0];
                    int cantidad= Integer.parseInt(datos[1]);
                    double radio= Double.parseDouble(datos[2]);
                    Circulo c= new Circulo(radio,nombre,cantidad); 
                    circulos.add(c);
                
            }
            }
            archivo.close();
            br.close();
            
            
            
        }catch(IOException e){
            System.out.println("No se puede leer el archivo "+ e);
        }
        System.out.println("SE leyo correctamente el archivo");
        return circulos;
    }
    
    public static void escribirArchivo(ArrayList<Circulo> circulos, String nombreArch){
        
        try{
            FileWriter archivo= new FileWriter(nombreArch, true);
            BufferedWriter bw= new BufferedWriter(archivo);
            PrintWriter pw= new PrintWriter(bw);
            
            for(Circulo c: circulos){
                if(c.getCantidad()>= 5){
                    pw.println(c.toString());
                    pw.flush();
                }
            }
          
        archivo.close();
        bw.close();
        
            System.out.println("Se escribio correctamente");
        
        }catch(IOException e){
            System.out.println("Error "+ e);
        }
        
        
    }
}
