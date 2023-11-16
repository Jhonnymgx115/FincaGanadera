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
<<<<<<< Updated upstream
    private static final String[] razas = {"Blanco Orejinegro", "Casanareño", "Chino Santadereano","Costeño con Cuernos", "Harton del Valle", "Romosinuano"};
=======
    public static final String[] razas = {"Blanco Orejinegro", "Casanareño", "Chino Santadereano",
        "Costeño con Cuernos", "Harton del Valle", "Romosinuano"};
>>>>>>> Stashed changes

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
        // Obtener el número de potrero y la raza de la nueva vaca
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
                // Abre el archivo en modo de adición (true)
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

            } catch (IOException e) {
                System.out.println("Error en el archivo: " + e.getMessage());
            } finally {
                try {
                    if (pw != null) {
                        pw.close();
                    }
                    if (archivo != null) {
                        archivo.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo: " + ex.getMessage());
                }
            }
        }
    }

    public static int[][] contarVacasPorPotreroYRaza() {
        String[][] datos = leerCSV();
        int npotreros = 8;

        // Crear la matriz para contar el número de vacas por potrero y raza
        int[][] contadorVacas = new int[npotreros][razas.length];

        // Inicializar la matriz de contador
        for (int i = 0; i < npotreros; i++) {
            for (int j = 0; j < razas.length; j++) {
                contadorVacas[i][j] = 0;
            }
        }

        // Contar el número de vacas por potrero y raza
        for (String[] vaca : datos) {
            int npotrero = Integer.parseInt(vaca[2].replace(" ", ""));
            String raza = vaca[1];

            // Encontrar el índice de la raza en el arreglo de razas
            int inraza = -1;
            for (int i = 0; i < razas.length; i++) {
                if (raza.equals(razas[i])) {
                    inraza = i;
                    break;
                }
            }

            // Incrementar el contador correspondiente
            if (npotrero >= 1 && npotrero <= npotreros && inraza != -1) {
                contadorVacas[npotrero - 1][inraza]++;
            }
        }
        return contadorVacas;
    }

    public static void main(String[] args) {
        String[] nuevavaca = {"50", "Romosinuano", "4", "620", "V", "En Venta"};
        AgregarVaca(nuevavaca);
    }

}
