
package vistas;


import DAO.MysqlDAOAdministrador;
import Modelo.Administrador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Agregar_Administrador extends javax.swing.JFrame {
 private MysqlDAOAdministrador MDA;
   
    public Agregar_Administrador() throws SQLException {
        this.MDA = new MysqlDAOAdministrador();
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
        jLabel5 = new javax.swing.JLabel();
        t_Password = new javax.swing.JPasswordField();
        t_password_confirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fondo.jpg"))); // NOI18N
        panel1.setName("Agregar Administrador"); // NOI18N

        jLabel1.setText("Nombre:");

        jLabel2.setText("CC:");

        t_cc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ccKeyTyped(evt);
            }
        });

        jLabel3.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirmar Contraseña:");

        t_Password.setName(""); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnGuardar)
                        .addGap(74, 74, 74)
                        .addComponent(btnCancelar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69)
                                .addComponent(t_nombre))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                    .addComponent(t_cc, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                    .addComponent(t_Password)
                                    .addComponent(t_password_confirmar))))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_password_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        } else if (t_password_confirmar.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Confirmar Contraseña");

        } else if (!t_Password.getText().equals(t_password_confirmar.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Las Contraseñas deben ser iguales");

        } else try {
            if (MDA.consultarAdministrador(t_usuario.getText(),(new Administrador().md5(t_Password.getText()))+"")) {
                JOptionPane.showMessageDialog(rootPane, "Ya Existe el Usuario Debe Digitar uno Distinto");
            }else
            {
                try {
                    Modelo.Administrador admin = new Modelo.Administrador();
                    admin.SetCC(Integer.parseInt(t_cc.getText()));
                    admin.SetNombre(t_nombre.getText());
                    admin.SetUsuario(t_usuario.getText());
                    admin.SetContraseña(admin.md5(t_Password.getText()));
                    
                    if (MDA.insertarAdministrador(admin)) {
                        JOptionPane.showMessageDialog(rootPane, "Inserto Satisfactoriamente");
                        Principal_administrador PA = new Principal_administrador();
                        PA.setVisible(true);
                        dispose();
                    }
                    
                } catch (Exception e) {
                }
                
            } /*
            */
        } catch (Exception ex) {
            Logger.getLogger(Agregar_Administrador.class.getName()).log(Level.SEVERE, null, ex);
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
               char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_t_ccKeyTyped

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Agregar_Administrador().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Agregar_Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JPasswordField t_Password;
    private javax.swing.JTextField t_cc;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JPasswordField t_password_confirmar;
    private javax.swing.JTextField t_usuario;
    // End of variables declaration//GEN-END:variables
}
