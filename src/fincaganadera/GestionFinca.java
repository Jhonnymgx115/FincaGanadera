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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionFinca {

    public static void LeerCsv(JTable table) {
        try {
            File archivo = new File("datos_vacas.csv");
            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);

            String linea;
            DefaultTableModel modelotabla = (DefaultTableModel) table.getModel();
            modelotabla.setRowCount(0);

            while ((linea = bf.readLine()) != null) {
                String[] vaca = linea.split(",");
                modelotabla.addRow(vaca);
            }
        } catch (IOException e) {
            System.out.println("Error en el archivo");
        }
    }
    
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
            System.out.println("error en el archivo");
        }
    }

}
