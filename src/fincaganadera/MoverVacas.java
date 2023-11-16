/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fincaganadera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BlackHawk
 */
public class MoverVacas extends javax.swing.JFrame {
    
    public MoverVacas() {
        
         initComponents();
        GestionFinca gf = new GestionFinca();
        gf.CargarCsvTabla(TablaVacas);
         
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seleccionar_Potrero = new javax.swing.JLabel();
        PotreroOrigen = new javax.swing.JComboBox<>();
        PotreroDestino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Mover = new javax.swing.JButton();
        btn_atrasM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVacas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Seleccionar_Potrero.setText("Seleccione el potrero");

        PotreroOrigen.setMaximumRowCount(10);
        PotreroOrigen.setSelectedItem(null);
        PotreroOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotreroOrigenActionPerformed(evt);
            }
        });

        PotreroDestino.setMaximumRowCount(10);

        jLabel3.setText("Potrero de destino");

        Mover.setText("Mover");
        Mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoverActionPerformed(evt);
            }
        });

        btn_atrasM.setText("Atras");
        btn_atrasM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasMActionPerformed(evt);
            }
        });

        TablaVacas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RAZA", "Potrero ", "Vacunacion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaVacas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_atrasM))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mover)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Seleccionar_Potrero)
                                    .addGap(18, 18, 18)
                                    .addComponent(PotreroOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(217, 217, 217)
                                    .addComponent(jLabel3)
                                    .addGap(26, 26, 26)
                                    .addComponent(PotreroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btn_atrasM)
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seleccionar_Potrero)
                    .addComponent(PotreroOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PotreroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addComponent(Mover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void PotreroOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotreroOrigenActionPerformed
    
    }//GEN-LAST:event_PotreroOrigenActionPerformed

    private void btn_atrasMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasMActionPerformed
       FincaGanadera ventanaPrincipal = new FincaGanadera();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_atrasMActionPerformed

    private void MoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoverActionPerformed

    }//GEN-LAST:event_MoverActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mover;
    private javax.swing.JComboBox<String> PotreroDestino;
    private javax.swing.JComboBox<String> PotreroOrigen;
    private javax.swing.JLabel Seleccionar_Potrero;
    private javax.swing.JTable TablaVacas;
    private javax.swing.JButton btn_atrasM;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
