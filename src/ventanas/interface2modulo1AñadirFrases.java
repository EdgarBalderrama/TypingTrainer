package ventanas;
import javax.swing.JOptionPane;
import verificador.Verificador;
public class interface2modulo1AñadirFrases extends javax.swing.JFrame {

    Verificador verificador = new Verificador();
    Frases frases = new Frases();
    
    public interface2modulo1AñadirFrases() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAñadirFrase = new javax.swing.JButton();
        jTextFieldFrase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDificultad = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelImagen2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelImagen1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAñadirFrase.setBackground(new java.awt.Color(51, 0, 102));
        jButtonAñadirFrase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAñadirFrase.setText("Añade tu frase");
        jButtonAñadirFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirFraseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAñadirFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, -1, -1));

        jTextFieldFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFraseActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 610, 30));

        jLabel3.setBackground(new java.awt.Color(51, 0, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nivel de dificultad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 140, 30));

        jLabel2.setBackground(new java.awt.Color(51, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Frase:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 50, 30));

        jTextFieldDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDificultadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDificultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 170, 30));

        jButtonAtras.setBackground(new java.awt.Color(51, 0, 102));
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese su frase y especifique el nivel de dificultad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 570, 30));

        jLabel4.setBackground(new java.awt.Color(51, 0, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1: Frases cortas, en minúscula, sin signos de puntuación ni tíldes.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(51, 0, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("3: Frases con más de 10 palabras que implementen todo lo antes mencionado.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 40));
        getContentPane().add(jLabelImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 310, 240));

        jLabel5.setBackground(new java.awt.Color(51, 0, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2: Frases con no más de 10 palabras que implementen: Mayúsculas, signos de puntuación y tildes.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesModulo1/Estudioso2.png"))); // NOI18N
        getContentPane().add(jLabelImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 340, 280));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-and-black-wallpaper-hd-smart-phone-mac-desktop-images-windows-1920x1080.jpg"))); // NOI18N
        jLabelFondo.setText("Ed");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonAñadirFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirFraseActionPerformed
        if(jTextFieldFrase.getText().equals("") || jTextFieldDificultad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ups! Creo que te olvidaste ingresar la frase o la dificultad");
        }
        else{
            if(verificador.verificarIdioma(jTextFieldFrase.getText())){
                if(jTextFieldDificultad.getText()==null)
                    JOptionPane.showMessageDialog(null, "Ups! Creo que te olvidaste ingresar el nivel de dificultad");
                else{
                    if("1".equals(jTextFieldDificultad.getText())){
                        frases.setFraseFacil(jTextFieldFrase.getText());
                        JOptionPane.showMessageDialog(null, "Felicidades! Su frase se añadió correctamente!");
                        jTextFieldFrase.setText(null);
                        jTextFieldDificultad.setText(null);

                    }
                    else if ("2".equals(jTextFieldDificultad.getText())){
                        
                        frases.setFraseMedia(jTextFieldFrase.getText());
                        JOptionPane.showMessageDialog(null, "Felicidades! Su frase se añadió correctamente!");
                        jTextFieldFrase.setText(null);
                        jTextFieldDificultad.setText(null);
                    }
                    else if ("3".equals(jTextFieldDificultad.getText())){
                        
                        frases.setFraseDificil(jTextFieldFrase.getText());
                        JOptionPane.showMessageDialog(null, "Felicidades! Su frase se añadió correctamente!");
                        jTextFieldFrase.setText(null);
                        jTextFieldDificultad.setText(null);
                    }
                }
            }
            else if(!verificador.verificarIdioma(jTextFieldFrase.getText())){
                JOptionPane.showMessageDialog(null, "Revisa tu frase... No cumple con los requisitos del castellano");
            }
        }
    }//GEN-LAST:event_jButtonAñadirFraseActionPerformed

    private void jTextFieldFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFraseActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        interface2modulo1 juego= new interface2modulo1();
        juego.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextFieldDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDificultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDificultadActionPerformed

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
            java.util.logging.Logger.getLogger(interface2modulo1AñadirFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1AñadirFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1AñadirFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1AñadirFrases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface2modulo1AñadirFrases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAñadirFrase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelImagen1;
    private javax.swing.JLabel jLabelImagen2;
    private javax.swing.JTextField jTextFieldDificultad;
    private javax.swing.JTextField jTextFieldFrase;
    // End of variables declaration//GEN-END:variables
}
