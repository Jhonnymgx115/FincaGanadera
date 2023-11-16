/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fincaganadera;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NewClass1 {
    public void EscribirCsv(String[] vaca){
        FileWriter archivo = null;
        PrintWriter pw = null;

        try {
            archivo = new FileWriter("datos_vacas.csv");
            pw = new PrintWriter(archivo);
            for (int i = 0; i < vaca.length; i++) {
                pw.append(vaca[i]);
                pw.append("\n");
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (null != archivo) {
                try {
                    archivo.close();
                } catch (IOException e2) {
                }
            }
        }
    }

    
    public static void main(String[] args) {
        NewClass1 newClass = new NewClass1();
        String[] datos = {"00047,Romosinuano,3,810,F"};
        newClass.EscribirCsv(datos);
    }
}
