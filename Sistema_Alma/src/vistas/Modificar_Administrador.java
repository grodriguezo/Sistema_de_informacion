
package vistas;

import DAO.MysqlDAOAdministrador;
import Modelo.Administrador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Modificar_Administrador extends javax.swing.JFrame {
 private MysqlDAOAdministrador MDA;
    public Modificar_Administrador() throws SQLException {
        MDA = new MysqlDAOAdministrador();
        initComponents();

        setLocationRelativeTo(null);
    }

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
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        t_Password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        t_buscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t_Password_confirmar = new javax.swing.JPasswordField();

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

        jLabel4.setText("Contraseña:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        t_Password.setEditable(false);
        t_Password.setName(""); // NOI18N
        panel1.add(t_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 390, -1));

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

        jLabel5.setText("Confirmar Contraseña:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        t_Password_confirmar.setEditable(false);
        t_Password_confirmar.setName(""); // NOI18N
        panel1.add(t_Password_confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 340, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (t_nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese nombre");
        } else if (t_cc.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Cedula");
        } else if (t_usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Usuario");
        } else if (t_Password.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Contraseña");
        } else if (t_Password_confirmar.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Confirmar Contraseña");

        } else if (!t_Password.getText().equals(t_Password_confirmar.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Las Contraseñas deben ser iguales");

        } else {
            try {
                Modelo.Administrador admin = new Modelo.Administrador();
                admin.SetCC(Integer.parseInt(t_cc.getText()));
                admin.SetNombre(t_nombre.getText());
                admin.SetUsuario(t_usuario.getText());
                admin.SetContraseña(admin.md5(t_Password.getText()));

                if (MDA.modificarAdministrador(admin)) {
                    JOptionPane.showMessageDialog(rootPane, "Modifico Satisfactoriamente");
                    Principal_administrador PA = new Principal_administrador();
                    PA.setVisible(true);
                    dispose();
                }

            } catch (Exception e) {
            }

        }
       

    }//GEN-LAST:event_btnGuardarActionPerformed

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
                t_nombre.setEditable(true);
                t_usuario.setEditable(true);
                t_Password.setEditable(true);
                t_Password_confirmar.setEditable(true);
            } catch (SQLException ex) {

            }
        

    }//GEN-LAST:event_btnBuscarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Modificar_Administrador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Modificar_Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JPasswordField t_Password;
    private javax.swing.JPasswordField t_Password_confirmar;
    private javax.swing.JTextField t_buscar;
    private javax.swing.JTextField t_cc;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
