/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fincaganadera;

import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author
 */
public class Grafica extends javax.swing.JFrame {

    public Grafica() {
        initComponents();
        PintarRazas();
    }

    public final void PintarVacunas() {
        DefaultPieDataset datosrazas = new DefaultPieDataset();

        String[][] vacas = GestionFinca.leerCSV();

        if (vacas != null) {
            int vacunadas = Contarvacunadas(vacas);
            int novacunadas = vacas.length - vacunadas;

            datosrazas.setValue("Vacunadas", vacunadas);
            datosrazas.setValue("No Vacunadas", novacunadas);
        }

        JFreeChart grafica = ChartFactory.createPieChart(
                "Vacas Vacunadas",
                datosrazas,
                true,
                true,
                false);
        ChartPanel panel = new ChartPanel(grafica);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(800, 480));
        jPanel1.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
    }

    private int Contarvacunadas(String[][] vacas) {
        int contador = 0;
        for (int i = 0; i < vacas.length; i++) {
            if ("V".equals(vacas[i][4])) {
                contador++;
            }
        }
        return contador;
    }

    private final void PintarRazas() {
        DefaultPieDataset datosrazas = new DefaultPieDataset();
        String[] razas = {"Blanco Orejinegro", "Casanareño", "Chino Santadereano", "Costeño con Cuernos", "Harton del Valle", "Romosinuano"};
        int[][] vacas = GestionFinca.contarVacasPorPotreroYRaza();
        String[][] datos = new String[2][razas.length];
        for (int i = 0; i < razas.length; i++) {
            datos[0][i] = razas[i];
            int cont = 0;
            for (int j = 0; j < razas.length; j++) {
                cont += vacas[j][i];
            }
            datos[1][i] = String.valueOf(cont);
            datosrazas.setValue(razas[i], cont);
        }

        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        
        JFreeChart grafica = ChartFactory.createPieChart(
                "Razas de vacas",
                datosrazas,
                true,
                true,
                false);
        ChartPanel panel = new ChartPanel(grafica);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(800, 480));
        jPanel1.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Grafica().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}