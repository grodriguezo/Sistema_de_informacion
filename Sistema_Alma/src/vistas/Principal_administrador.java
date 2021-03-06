/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Rodriguez
 */
public class Principal_administrador extends javax.swing.JFrame {

    /**
     * Creates new form Principal_administrador
     */
    public Principal_administrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        btnVer = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnOpcionesA = new javax.swing.JButton();
        btnCerrar_Sesion = new javax.swing.JButton();
        btn_agregarAdmin = new javax.swing.JButton();
        btnModificar_Admin = new javax.swing.JButton();
        btnEliminar_Admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.jpg"))); // NOI18N

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Lupa.jpg"))); // NOI18N
        btnVer.setText("Ver Pacientes");
        btnVer.setBorderPainted(false);
        btnVer.setContentAreaFilled(false);
        btnVer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVer.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });

        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/exportar.png"))); // NOI18N
        btnExportar.setText("Exportar ");
        btnExportar.setContentAreaFilled(false);
        btnExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
        });

        btnOpcionesA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/administrar_enfermeras.png"))); // NOI18N
        btnOpcionesA.setText("Opciones Administrador");
        btnOpcionesA.setContentAreaFilled(false);
        btnOpcionesA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpcionesA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOpcionesA.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpcionesA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpcionesAMouseClicked(evt);
            }
        });

        btnCerrar_Sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/cerrar sesion_1.jpg"))); // NOI18N
        btnCerrar_Sesion.setText("Cerrar Sesion");
        btnCerrar_Sesion.setBorderPainted(false);
        btnCerrar_Sesion.setContentAreaFilled(false);
        btnCerrar_Sesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar_Sesion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar_Sesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar_Sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrar_SesionMouseClicked(evt);
            }
        });

        btn_agregarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar_admin.png"))); // NOI18N
        btn_agregarAdmin.setContentAreaFilled(false);
        btn_agregarAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_agregarAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_agregarAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_agregarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarAdminActionPerformed(evt);
            }
        });

        btnModificar_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/modificar_admin.png"))); // NOI18N
        btnModificar_Admin.setContentAreaFilled(false);
        btnModificar_Admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar_Admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificar_Admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_AdminActionPerformed(evt);
            }
        });

        btnEliminar_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar_admin.png"))); // NOI18N
        btnEliminar_Admin.setBorderPainted(false);
        btnEliminar_Admin.setContentAreaFilled(false);
        btnEliminar_Admin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar_Admin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar_Admin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnOpcionesA)
                        .addGap(28, 28, 28)
                        .addComponent(btn_agregarAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                        .addComponent(btnCerrar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnVer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarAdmin)
                    .addComponent(btnOpcionesA)
                    .addComponent(btnEliminar_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar_SesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar_SesionMouseClicked
     Inicio in=new Inicio();
     in.setVisible(true);
     dispose();
    }//GEN-LAST:event_btnCerrar_SesionMouseClicked

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
    Consultar_paciente Cp=new Consultar_paciente();
    Cp.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnVerMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
       Exportar Ex=new Exportar();
       Ex.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExportarMouseClicked

    private void btnOpcionesAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcionesAMouseClicked
        // TODO add your handling code here:
        Opciones_administrador OA= new Opciones_administrador();
        OA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOpcionesAMouseClicked

    private void btn_agregarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarAdminActionPerformed
        try {
            // TODO add your handling code here:
            Agregar_Administrador AA= new Agregar_Administrador();
            AA.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Principal_administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
    }//GEN-LAST:event_btn_agregarAdminActionPerformed

    private void btnModificar_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_AdminActionPerformed
        // TODO add your handling code here:
        try {
            Modificar_Administrador MA = new Modificar_Administrador();
            MA.setVisible(true);
            dispose();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_btnModificar_AdminActionPerformed

    private void btnEliminar_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_AdminActionPerformed
        // TODO add your handling code here:
      
        try {
        Eliminar_Administrador EA = new Eliminar_Administrador();
        EA.setVisible(true);
        dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Principal_administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btnEliminar_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar_Sesion;
    private javax.swing.JButton btnEliminar_Admin;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnModificar_Admin;
    private javax.swing.JButton btnOpcionesA;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btn_agregarAdmin;
    private org.edisoncor.gui.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
