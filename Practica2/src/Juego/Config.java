
package Juego;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Config extends javax.swing.JFrame {
public static String adelante, atras, salto, disp1, disp2;
    public Config() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Resources/Cuphead.png"));
        Icon logo = new ImageIcon(imagen.getImage().getScaledInstance(imagencuphead.getWidth(),imagencuphead.getHeight(), Image.SCALE_DEFAULT));
        imagencuphead.setIcon(logo);
        this.repaint();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        imagencuphead = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbodisparo1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbodisparo2 = new javax.swing.JComboBox<>();
        txtdisparo2 = new javax.swing.JTextField();
        txtdisparo1 = new javax.swing.JTextField();
        txtsalto = new javax.swing.JTextField();
        txtmovatras = new javax.swing.JTextField();
        txtmovadelante = new javax.swing.JTextField();
        btmingresar = new javax.swing.JButton();
        btmcancelar = new javax.swing.JButton();
        btmsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración de Controles");
        setBackground(new java.awt.Color(204, 0, 0));

        panel.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setText("Menú de Configuración de Controles");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel2.setText("Mover hacia adelante:");

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel3.setText("Mover hacia atrás:");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel4.setText("Salto:");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel5.setText("Disparo 1:");

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel6.setText("Disparo 2:");

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel7.setText("Disparo 1:");

        cbodisparo1.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        cbodisparo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        jLabel8.setText("Disparo 2:");

        cbodisparo2.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        cbodisparo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtdisparo2.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        txtdisparo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtdisparo1.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        txtdisparo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtsalto.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        txtsalto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtmovatras.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        txtmovatras.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtmovadelante.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        txtmovadelante.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btmingresar.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        btmingresar.setText("Ingresar");
        btmingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmingresarActionPerformed(evt);
            }
        });

        btmcancelar.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        btmcancelar.setText("Cancelar");

        btmsalir.setFont(new java.awt.Font("Maiandra GD", 3, 12)); // NOI18N
        btmsalir.setText("Salir");
        btmsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(246, 246, 246)
                                .addComponent(btmingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btmcancelar)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdisparo1)
                                    .addComponent(txtsalto)
                                    .addComponent(txtdisparo2)
                                    .addComponent(cbodisparo1, 0, 121, Short.MAX_VALUE)
                                    .addComponent(txtmovatras)
                                    .addComponent(txtmovadelante)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagencuphead, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(92, 92, 92)
                        .addComponent(cbodisparo2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btmsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmovadelante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmovatras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtsalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdisparo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtdisparo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagencuphead, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbodisparo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btmingresar)
                        .addComponent(btmcancelar))
                    .addComponent(jLabel7))
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbodisparo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmsalir))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmsalirActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        hide();
    }//GEN-LAST:event_btmsalirActionPerformed

    private void btmingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmingresarActionPerformed
        adelante = txtmovadelante.getText();
        atras = txtmovatras.getText();
        salto = txtsalto.getText();
        disp1 = txtdisparo1.getText();
        disp2 = txtdisparo2.getText();
        JOptionPane.showMessageDialog(null, "Configuraciones de Control procesadas con Éxito");
        txtmovadelante.setText("");
        txtmovatras.setText("");
        txtsalto.setText("");
        txtdisparo1.setText("");
        txtdisparo2.setText("");
    }//GEN-LAST:event_btmingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Config.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Config().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmcancelar;
    private javax.swing.JButton btmingresar;
    private javax.swing.JButton btmsalir;
    private javax.swing.JComboBox<String> cbodisparo1;
    private javax.swing.JComboBox<String> cbodisparo2;
    private javax.swing.JLabel imagencuphead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtdisparo1;
    private javax.swing.JTextField txtdisparo2;
    private javax.swing.JTextField txtmovadelante;
    private javax.swing.JTextField txtmovatras;
    private javax.swing.JTextField txtsalto;
    // End of variables declaration//GEN-END:variables

}
