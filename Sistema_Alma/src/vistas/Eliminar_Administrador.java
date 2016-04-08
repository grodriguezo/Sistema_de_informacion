/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import DAO.DAOAdministrador;
import DAO.MysqlDAOAdministrador;
import Modelo.Administrador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Rodriguez
 */
public class Eliminar_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_Administrador
     */
    public Eliminar_Administrador() throws SQLException {
        this.MDA = new MysqlDAOAdministrador();
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
        jLabel1 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t_cc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_usuario = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t_buscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.jpg"))); // NOI18N
        panel1.setName("Agregar Administrador"); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar:");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        t_nombre.setEditable(false);
        panel1.add(t_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 411, -1));

        jLabel2.setText("CC:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        t_cc.setEditable(false);
        t_cc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ccKeyTyped(evt);
            }
        });
        panel1.add(t_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 411, -1));

        jLabel3.setText("Usuario:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        t_usuario.setEditable(false);
        panel1.add(t_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 411, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        jLabel7.setText("Nombre:");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));
        panel1.add(t_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 450, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
MysqlDAOAdministrador MDA;
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        try {
            Modelo.Administrador admin = new Modelo.Administrador();
            admin.SetCC(Integer.parseInt(t_cc.getText()));
            admin.SetNombre(t_nombre.getText());
            admin.SetUsuario(t_usuario.getText());

            if (MDA.eliminarAdministrador(admin)) {
                JOptionPane.showMessageDialog(rootPane, "Elimino Satisfactoriamente");
                Principal_administrador PA = new Principal_administrador();
                PA.setVisible(true);
                dispose();
            }

        } catch (Exception e) {
        }

        /*  
         */

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Principal_administrador PA = new Principal_administrador();
        PA.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void t_ccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ccKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_t_ccKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            Administrador admin = new Administrador();
            MysqlDAOAdministrador DaoMysql = new MysqlDAOAdministrador();
            admin = DaoMysql.BuscarAdministrador(t_buscar.getText());
            t_nombre.setText(admin.getNombre());
            t_cc.setText(admin.getCC() + "");
            t_usuario.setText(admin.getUsuario());

        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Eliminar_Administrador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Eliminar_Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTextField t_buscar;
    private javax.swing.JTextField t_cc;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
