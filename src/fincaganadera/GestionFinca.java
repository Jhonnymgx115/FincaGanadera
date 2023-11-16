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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionFinca {

    private static final String rutacsv = "datos_vacas.csv";
    private static final String[] razas = {"Blanco Orejinegro", "Casanareño", "Chino Santadereano", "Costeño con Cuernos", "Harton del Valle", "Romosinuano"};


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
                if (!linea.isEmpty()) {
                    datos[fila++] = linea.split(",");
                }
            }
            br.close();
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
                for (String[] fila : datos) {
                    bw.write(String.join(",", fila));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error al actualizar el archivo CSV: " + e.getMessage());
            }
        } else {
            System.out.println("Número de fila fuera de rango.");
        }
    }

    public static void CargarCsvTabla(JTable table) {
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

    public static boolean VerificarVaca(String[] vacanueva) {
        int npotrero = Integer.parseInt(vacanueva[2]);
        String raza = vacanueva[1];
        int[][] contador = contarVacasPorPotreroYRaza();
        int inraza = -1;
        for (int i = 0; i < razas.length; i++) {
            if (raza.equals(razas[i])) {
                inraza = i;
                break;
            }
        }
        if (npotrero >= 1 && npotrero <= 8 && inraza != -1) {
            if (contador[npotrero - 1][inraza] < 10) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El número de vacas en el potrero y raza excede el límite.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El número de potrero o la raza no son válidos.");
        }
        return false;
    }

    public static void AgregarVaca(String[] vaca) {
        FileWriter archivo = null;
        PrintWriter pw = null;
        if (VerificarVaca(vaca)) {
            try {
                archivo = new FileWriter(rutacsv, true);
                pw = new PrintWriter(archivo);
                for (int i = 0; i < 6; i++) {
                    if (i != 5) {
                        pw.append(vaca[i] + ", ");
                    } else {
                        pw.append(vaca[i]);
                    }
                }
                pw.append("\n");
                pw.close();
                archivo.close();
            } catch (IOException e) {
                System.out.println("Error en el archivo: " + e.getMessage());
            }
        }
    }

    public static int[][] contarVacasPorPotreroYRaza() {
        String[][] datos = leerCSV();
        int npotreros = 8;
        int[][] contadorVacas = new int[npotreros][razas.length];
        for (int i = 0; i < npotreros; i++) {
            for (int j = 0; j < razas.length; j++) {
                contadorVacas[i][j] = 0;
            }
        }
        for (String[] vaca : datos) {
            int npotrero = Integer.parseInt(vaca[2].replace(" ", ""));
            String raza = vaca[1];
            int inraza = -1;
            for (int i = 0; i < razas.length; i++) {
                if (raza.equals(razas[i])) {
                    inraza = i;
                    break;
                }
            }
            if (npotrero >= 1 && npotrero <= npotreros && inraza != -1) {
                contadorVacas[npotrero - 1][inraza]++;
            }
        }
        return contadorVacas;
    }

    public static void main(String[] args) {
        int[][] cont = contarVacasPorPotreroYRaza();

        if (cont != null) {
            for (int i = 0; i < cont.length; i++) {
                for (int j = 0; j < cont[i].length; j++) {
                    System.out.print(cont[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error: Unable to retrieve data. Check the CSV file or file reading logic.");
        }
    }

}
