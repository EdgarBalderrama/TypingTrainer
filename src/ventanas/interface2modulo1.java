package ventanas;
public class interface2modulo1 extends javax.swing.JFrame {

    public interface2modulo1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonJugar = new javax.swing.JButton();
        jButtonAñadirFrases = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonJugar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonJugar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonJugar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonJugar.setText("Juega con las frases");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 180, -1));

        jButtonAñadirFrases.setBackground(new java.awt.Color(0, 0, 102));
        jButtonAñadirFrases.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAñadirFrases.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAñadirFrases.setText("Añade tu propia frase");
        jButtonAñadirFrases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirFrasesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadirFrases, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jButtonAtras.setBackground(new java.awt.Color(51, 0, 102));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, -1));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesModulo1/Profe (2).jpg"))); // NOI18N
        getContentPane().add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 442, 337));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        interface2 a= new interface2();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        interface2modulo1Juego juego= new interface2modulo1Juego();
        juego.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void jButtonAñadirFrasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirFrasesActionPerformed
        interface2modulo1AñadirFrases añadirFrase= new interface2modulo1AñadirFrases();
        añadirFrase.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAñadirFrasesActionPerformed

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
            java.util.logging.Logger.getLogger(interface2modulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface2modulo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAñadirFrases;
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JLabel jLabel1Fondo;
    // End of variables declaration//GEN-END:variables
}
