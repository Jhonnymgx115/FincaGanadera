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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionFinca {

    private static final String rutacsv = "datos_vacas.csv";

    public static String[][] leerCSV() {
        String[][] datos = null;

        try {
            File archivo = new File(rutacsv);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            int nfilas = (int) br.lines().count();
            br.close();


            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            datos = new String[nfilas][];
            int fila = 0;
            String linea;
            while ((linea = br.readLine()) != null) {
                // Remove non-printable ASCII characters
                datos[fila++] = linea.split(",");
            }
            br.close(); // Close the BufferedReader after reading the file.
        } catch (IOException e) {
            System.out.println("Error en el archivo: " + e.getMessage());
        }

        return datos;
    }

    public static void actualizarCSV(String[] nuevosDatos, int nfila) {
        String[][] datos = leerCSV();
        if (nfila >= 0 && nfila < datos.length) {
            datos[nfila] = nuevosDatos;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutacsv))) {
                for (int i = 0; i < datos.length; i++) {
                    for (int j = 0; j < datos[i].length; j++) {
                        bw.write(datos[i][j]);
                        if (j < datos[i].length - 1) {
                            bw.write(",");
                        }
                    }
                    bw.write("\n");
                }
                System.out.println("Archivo CSV actualizado correctamente.");
            } catch (IOException e) {
                System.out.println("Error al actualizar el archivo CSV: " + e.getMessage());
            }
        } else {
            System.out.println("Número de fila fuera de rango.");
        }
    }


    public void CargarCsvTabla(JTable table) {
        try {
            File archivo = new File("datos_vacas.csv");
            FileReader fr = new FileReader(archivo);
            BufferedReader bf = new BufferedReader(fr);

            String linea;
            DefaultTableModel modelotabla = (DefaultTableModel) table.getModel();
            modelotabla.setRowCount(0);

            while ((linea = bf.readLine()) != null) {
                String[] temp = linea.split(",");
                String[] vaca = new String[temp.length];

                for (int i = 0; i < temp.length; i++) {
                    vaca[i] = temp[i];
                }

                modelotabla.addRow(vaca);
            }
        } catch (IOException e) {
            System.out.println("Error en el archivo");
        }
    }

    public void AgregarVaca(String[] vaca) {
        FileWriter archivo = null;
        PrintWriter pw = null;

        if (vaca.length != 6) {
            try {
                archivo = new FileWriter(rutacsv);
                pw = new PrintWriter(archivo);
                for (int i = 0; i < 6; i++) {
                    pw.append(vaca[i]);
                    pw.append("\n");
                }

            } catch (IOException e) {
                System.out.println("error en el archivo");
            }
        }
    }
    public static void main(String[] args) {
//        String[][] datos = leerCSV();
//
//        if (datos != null) {
//            for (int i = 0; i < datos.length; i++) {
//                for (int j = 0; j < datos[i].length; j++) {
//                    System.out.print(datos[i][j] + ",");
//                }
//                System.out.println();
//            }
//        }

        String[] nuevosDatos = {"00001", "Blanco Orejinegro", "6", "620", "V", "En Venta"};
        int nfila = 0;
        actualizarCSV(nuevosDatos, nfila);
    }

}
