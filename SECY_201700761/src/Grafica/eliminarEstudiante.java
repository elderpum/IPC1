/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;
import  Logica.PasswordGenerator;
import Logica.Listas;
import javax.swing.JOptionPane;
/**
 *
 * @author Elder
 */
public class eliminarEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form eliminarEstudiante
     */
    public eliminarEstudiante() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcarnet = new javax.swing.JTextField();
        txtdpi = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcreditos = new javax.swing.JTextField();
        txtcontrasenia = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELIMINAR ESTUDIANTES");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setText("Eliminar Estudiante");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel2.setText("Carnet:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel3.setText("DPI:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel6.setText("Correo:");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel8.setText("No. Créditos:");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel9.setText("Contraseña:");

        txtcarnet.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtcarnet.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtdpi.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtdpi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdpi.setEnabled(false);

        txtnombre.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombre.setEnabled(false);

        txtcorreo.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtcorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcorreo.setEnabled(false);

        txtdireccion.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdireccion.setEnabled(false);

        txtcreditos.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtcreditos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcreditos.setEnabled(false);

        txtcontrasenia.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        txtcontrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcontrasenia.setEnabled(false);

        btneliminar.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.setEnabled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setEnabled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Comic Sans MS", 3, 11)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btncancelar)
                        .addGap(63, 63, 63)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(txtdpi)
                                    .addComponent(txtnombre)
                                    .addComponent(txtcorreo)
                                    .addComponent(txtdireccion)
                                    .addComponent(txtcreditos)
                                    .addComponent(txtcontrasenia)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btneliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneliminar)
                    .addComponent(btnbuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnsalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a Estudiante?", "Sistema SECY", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION) {
            try{
                Listas.estudiante.eliminar(txtcarnet.getText());
                btncancelar.setEnabled(false);
                btneliminar.setEnabled(false);
                btnbuscar.setEnabled(true);
                txtcarnet.setText("");
                txtdpi.setText("");
                txtnombre.setText("");
                txtcorreo.setText("");
                txtdireccion.setText("");
                txtcreditos.setText("");
                txtcontrasenia.setText("");
            }catch (Exception e){
                System.out.println("Esto no sirve >:c");
                btncancelar.setEnabled(true);
                btneliminar.setEnabled(true);
                btnbuscar.setEnabled(false);
            }
        JOptionPane.showConfirmDialog(null, "Estudiante Eliminado con éxito.", "Sistema SECY", JOptionPane.OK_OPTION);
        }else{
            JOptionPane.showMessageDialog(null, "Operación Cancelada.", "Sistema SECY", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        String a = PasswordGenerator.getPassword(PasswordGenerator.MAYUSCULAS,1);
        String b = PasswordGenerator.getPassword(PasswordGenerator.NUMEROS,1);
        String c = PasswordGenerator.getPassword(PasswordGenerator.MINUSCULAS,1);
        String d = PasswordGenerator.getPassword(PasswordGenerator.NUMEROS,1);
        txtcarnet.setText("");
        txtdpi.setText("");
        txtnombre.setText("");
        txtcorreo.setText("");
        txtdireccion.setText("");
        txtcreditos.setText("");
        txtcontrasenia.setText(a + b + c + d);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        CrudEstudiante estudiante = new CrudEstudiante();
        estudiante.setVisible(true);
        estudiante.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String carnet = txtcarnet.getText();
        try{
            txtdpi.setEnabled(true);
            txtnombre.setEnabled(true);
            txtcorreo.setEnabled(true);
            txtdireccion.setEnabled(true);
            txtcreditos.setEnabled(true);
            txtcontrasenia.setEnabled(true);
            txtdpi.setText(Listas.estudiante.buscarNodo(carnet).getDpi());
            txtnombre.setText(Listas.estudiante.buscarNodo(carnet).getNombre());
            txtcorreo.setText(Listas.estudiante.buscarNodo(carnet).getCorreo());
            txtdireccion.setText(Listas.estudiante.buscarNodo(carnet).getDireccion());
            txtcreditos.setText(String.valueOf(Listas.estudiante.buscarNodo(carnet).getNocreditos()));
            txtcontrasenia.setText(Listas.estudiante.buscarNodo(carnet).getPassword());
            btneliminar.setEnabled(true);
            btncancelar.setEnabled(true);
            btnbuscar.setEnabled(false);
        }catch (Exception e){
            System.out.println("Esto no funciona >:c");
            JOptionPane.showMessageDialog(null, "Estudiante No Encontrado", "Sistema SECY", JOptionPane.ERROR_MESSAGE);
            txtdpi.setEnabled(false);
            txtnombre.setEnabled(false);
            txtcorreo.setEnabled(false);
            txtdireccion.setEnabled(false);
            txtcreditos.setEnabled(false);
            txtcontrasenia.setEnabled(false);
            btncancelar.setEnabled(false);
            btneliminar.setEnabled(false);
            btnbuscar.setEnabled(true);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(eliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcarnet;
    private javax.swing.JTextField txtcontrasenia;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcreditos;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdpi;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
