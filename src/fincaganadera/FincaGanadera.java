/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fincaganadera;

import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author BlackHawk
 */
public class FincaGanadera extends javax.swing.JFrame {

  FondoPanel fondo = new FondoPanel();
    public FincaGanadera() {
        
        setUndecorated(false);
        this.setContentPane(fondo);
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        panelRound1 = new fincaganadera.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelShadow1 = new fincaganadera.PanelShadow();
        btn_agregar = new javax.swing.JButton();
        panelShadow2 = new fincaganadera.PanelShadow();
        btn_mover = new javax.swing.JButton();
        panelShadow4 = new fincaganadera.PanelShadow();
        btn_buscar = new javax.swing.JButton();
        panelShadow5 = new fincaganadera.PanelShadow();
        jButton6 = new javax.swing.JButton();
        panelShadow6 = new fincaganadera.PanelShadow();
        btn_vacunar = new javax.swing.JButton();
        panelShadow7 = new fincaganadera.PanelShadow();
        btn_vender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(60);
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopLeft(60);
        panelRound1.setRoundTopRight(60);

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 216, 91));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Finca Ganadera Santa Elena");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregar.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(74, 216, 91));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar-01.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setToolTipText("Puede agregar una vaca");
        btn_agregar.setAlignmentY(0.0F);
        btn_agregar.setBorder(null);
        btn_agregar.setBorderPainted(false);
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_agregar.setFocusable(false);
        btn_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar-02.png"))); // NOI18N
        btn_agregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelShadow2.setBackground(new java.awt.Color(255, 255, 255));

        btn_mover.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        btn_mover.setForeground(new java.awt.Color(74, 216, 91));
        btn_mover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/mover-01.png"))); // NOI18N
        btn_mover.setText("Mover");
        btn_mover.setToolTipText("Puede mover una vaca a otro potrero");
        btn_mover.setAlignmentY(0.0F);
        btn_mover.setBorder(null);
        btn_mover.setBorderPainted(false);
        btn_mover.setContentAreaFilled(false);
        btn_mover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mover.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_mover.setFocusable(false);
        btn_mover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mover.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_mover.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/mover-02.png"))); // NOI18N
        btn_mover.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_mover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow2Layout = new javax.swing.GroupLayout(panelShadow2);
        panelShadow2.setLayout(panelShadow2Layout);
        panelShadow2Layout.setHorizontalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_mover, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow2Layout.setVerticalGroup(
            panelShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_mover, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelShadow4.setBackground(new java.awt.Color(255, 255, 255));

        btn_buscar.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(74, 216, 91));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-01.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setToolTipText("Puede ver los animales de cada potrero");
        btn_buscar.setAlignmentY(0.0F);
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_buscar.setFocusPainted(false);
        btn_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_buscar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-02.png"))); // NOI18N
        btn_buscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelShadow5.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(74, 216, 91));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-01.png"))); // NOI18N
        jButton6.setText("Historial");
        jButton6.setToolTipText("Registro de movimientos, ventas y nuevas vacas");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-02.png"))); // NOI18N
        jButton6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelShadow5Layout = new javax.swing.GroupLayout(panelShadow5);
        panelShadow5.setLayout(panelShadow5Layout);
        panelShadow5Layout.setHorizontalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow5Layout.setVerticalGroup(
            panelShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelShadow6.setBackground(new java.awt.Color(255, 255, 255));

        btn_vacunar.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        btn_vacunar.setForeground(new java.awt.Color(74, 216, 91));
        btn_vacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-01.png"))); // NOI18N
        btn_vacunar.setText("Vacunacion");
        btn_vacunar.setToolTipText("Jornada de vacunacion: se vacunan 10 vacas");
        btn_vacunar.setAlignmentY(0.0F);
        btn_vacunar.setBorder(null);
        btn_vacunar.setBorderPainted(false);
        btn_vacunar.setContentAreaFilled(false);
        btn_vacunar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vacunar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_vacunar.setFocusPainted(false);
        btn_vacunar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_vacunar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_vacunar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-02.png"))); // NOI18N
        btn_vacunar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_vacunar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_vacunar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vacunarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow6Layout = new javax.swing.GroupLayout(panelShadow6);
        panelShadow6.setLayout(panelShadow6Layout);
        panelShadow6Layout.setHorizontalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vacunar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow6Layout.setVerticalGroup(
            panelShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vacunar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        panelShadow7.setBackground(new java.awt.Color(255, 255, 255));

        btn_vender.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        btn_vender.setForeground(new java.awt.Color(74, 216, 91));
        btn_vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-01.png"))); // NOI18N
        btn_vender.setText("Vender");
        btn_vender.setToolTipText("");
        btn_vender.setAlignmentY(0.0F);
        btn_vender.setBorder(null);
        btn_vender.setBorderPainted(false);
        btn_vender.setContentAreaFilled(false);
        btn_vender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_vender.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btn_vender.setFocusPainted(false);
        btn_vender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_vender.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_vender.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buscar-02.png"))); // NOI18N
        btn_vender.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_vender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow7Layout = new javax.swing.GroupLayout(panelShadow7);
        panelShadow7.setLayout(panelShadow7Layout);
        panelShadow7Layout.setHorizontalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vender, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow7Layout.setVerticalGroup(
            panelShadow7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_vender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound1Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(panelShadow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(548, Short.MAX_VALUE)))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(340, Short.MAX_VALUE)
                    .addComponent(panelShadow7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(308, 308, 308)))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(panelShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(315, Short.MAX_VALUE)
                    .addComponent(panelShadow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)))
            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                    .addContainerGap(314, Short.MAX_VALUE)
                    .addComponent(panelShadow7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 820, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moverActionPerformed
        
        MoverVacas ventanaMV = new MoverVacas();
        ventanaMV.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_moverActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        AgregarVaca ventanaMV = new AgregarVaca();
        ventanaMV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
       BuscarVaca ventanaMV = new BuscarVaca();
        ventanaMV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_vacunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vacunarActionPerformed
        VacunarVaca ventanaMV = new VacunarVaca();
        ventanaMV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_vacunarActionPerformed

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
       VenderVaca ventanaMV = new VenderVaca();
        ventanaMV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_venderActionPerformed

     private void agregarActionPerformed(java.awt.event.ActionEvent evt) {                                      
        AgregarVaca ventanaMV = new AgregarVaca();
        ventanaMV.setVisible(true);
        this.dispose();
        
    }
    
      private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {                                      
        BuscarVaca ventanaMV = new BuscarVaca();
        ventanaMV.setVisible(true);
        this.dispose();
        
    }
      
     private void VenderActionPerformed(java.awt.event.ActionEvent evt) {                                      
        VenderVaca ventanaMV = new VenderVaca();
        ventanaMV.setVisible(true);
        this.dispose();
        
    }
    
     private void VacunarActionPerformed(java.awt.event.ActionEvent evt) {                                      
        VacunarVaca ventanaMV = new VacunarVaca();
        ventanaMV.setVisible(true);
        this.dispose();
        
    }
     
     private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Historial ventanaMV = new Historial();
        ventanaMV.setVisible(true);
        this.dispose();
        
    }
    
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
            java.util.logging.Logger.getLogger(FincaGanadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FincaGanadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FincaGanadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FincaGanadera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FincaGanadera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_mover;
    private javax.swing.JButton btn_vacunar;
    private javax.swing.JButton btn_vender;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private fincaganadera.PanelRound panelRound1;
    private fincaganadera.PanelShadow panelShadow1;
    private fincaganadera.PanelShadow panelShadow2;
    private fincaganadera.PanelShadow panelShadow4;
    private fincaganadera.PanelShadow panelShadow5;
    private fincaganadera.PanelShadow panelShadow6;
    private fincaganadera.PanelShadow panelShadow7;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel{
        private Image img;
        @Override
        public void paint(Graphics g){
            img = new ImageIcon(getClass().getResource("/IMAGENES/leaf-wallpaper-summer-plant-pattern.jpg")).getImage();
            
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    
    }
    
    
    
    
}
