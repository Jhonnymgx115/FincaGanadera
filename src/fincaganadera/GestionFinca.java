/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fincaganadera;

/**
 *
 * @author jabar
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class GestionFinca {
     
    static String pth ="C:\\Users\\jabar\\Documents\\Trabajos jb\\java\\Matrices\\vectort1\\FincaGanadera\\datos_vacas.csv";
    
    public static void main(String args[]){
      
        try{
        File archivo = new File(pth);
        FileReader path = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(path);                                                                                                                                                                                                                                                                                                                                                    
        
        String linea;
        
        while((linea = bf.readLine()) != null){
            System.out.println(linea);
            }
        }
        
        catch(IOException e){
            System.out.println("Error en el archivo");
        }
     }

    
    
}
