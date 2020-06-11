package ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class interface2modulo1Juego extends javax.swing.JFrame {
    int [] listaAleatorios = new int [10];
    Frases frases = new Frases();
    Teclado teclado = new Teclado();
    protected Timer t;
    protected String frase="";
    protected String codigo="";
    protected int seg=30, cs=99, facilesRespondidas, mediasRespondidas, dificilesRespondidas;
    protected boolean finalTiempo = false;
    protected ActionListener acciones = new ActionListener(){
    
        @Override
        public void actionPerformed(ActionEvent ae){
            cs--;
            if(cs==0){
               cs=99;
               --seg;
            }
            if(facilesRespondidas < frases.cantidadFrasesFaciles())
            {
                jLabelInstrucciones.setText("NIVEL 1!");
                frase = jTextFieldFrase.getText();
                jLabelFrase.setText(frases.mostrarFrasesFaciles(facilesRespondidas));
                    if(frase.equals(frases.mostrarFrasesFaciles(facilesRespondidas))){
                        t.stop();
                        facilesRespondidas+=1;
                        JOptionPane.showMessageDialog(null, "Muy bien! Sigue así!");
                        jLabelImagenes.setIcon(null);
                        jTextFieldFrase.setText(null);
                        retomarValores();
                        t.start();
                        if(facilesRespondidas!=frases.cantidadFrasesFaciles())
                            jLabelFrase.setText(frases.mostrarFrasesFaciles(facilesRespondidas));
                        else
                            jLabelFrase.setText(frases.mostrarFrasesMedias(mediasRespondidas));
                    }
            }
            if(facilesRespondidas == frases.cantidadFrasesFaciles() && mediasRespondidas < frases.cantidadFrasesMedias())
            {
                jLabelInstrucciones.setText("Nivel 2! SUERTE!!");
                frase = jTextFieldFrase.getText();
                    if(frase.equals(frases.mostrarFrasesMedias(mediasRespondidas))){
                        t.stop();
                        mediasRespondidas+=1;
                        JOptionPane.showMessageDialog(null, "Mejoraste mucho! Sigue así!");
                        jLabelImagenes.setIcon(null);
                        jTextFieldFrase.setText(null);
                        retomarValores();
                        t.start();
                        if(mediasRespondidas!=frases.cantidadFrasesMedias())
                            jLabelFrase.setText(frases.mostrarFrasesMedias(mediasRespondidas));
                        else
                            jLabelFrase.setText(frases.mostrarFrasesDificiles(dificilesRespondidas));      
                    }
            }
            if(mediasRespondidas >= frases.cantidadFrasesMedias() && dificilesRespondidas < frases.cantidadFrasesDificiles())
            {
                jLabelInstrucciones.setText("Nivel 3!! ¡¡SUERTE!!");
                frase = jTextFieldFrase.getText();
                    if(frase.equals(frases.mostrarFrasesDificiles(dificilesRespondidas))){
                        t.stop();
                        dificilesRespondidas+=1;
                        JOptionPane.showMessageDialog(null, "Mejoraste mucho! Sigue así!");
                        jLabelImagenes.setIcon(null);
                        jTextFieldFrase.setText(null);
                        retomarValores();
                        t.start();
                        if(dificilesRespondidas!=frases.cantidadFrasesDificiles())
                            jLabelFrase.setText(frases.mostrarFrasesDificiles(dificilesRespondidas));
                        else{
                            t.stop();
                            actualizarImagenGanaste();
                            retomarValoresIniciales();
                        } 
                    }
            }
            if(seg == 0 && cs==1){
                cs=0;
                t.stop();
                actualizarImagenPerdiste();
                retomarValoresIniciales();
            }  
            actualizarJLabel();     
        }
    };
    
    public void actualizarImagenGanaste(){
        jLabelImagenes.setIcon(null);
        jLabelGanaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesModulo1/Ganaste.png")));
    }
    
    public void actualizarImagenPerdiste(){
        jLabelImagenes.setIcon(null);
        String codigo = "perdiste";
        jLabelPerdiste.setIcon(new javax.swing.ImageIcon(getClass().getResource(teclado.getTecla(codigo))));
    }
    
    public void retomarValoresIniciales(){
        this.seg=30;
        this.cs=99;
        frase="";
        jLabelInstrucciones.setText("Escribe las frases rapidamente!");
        jLabelFrase.setText("Aqui aparecerán las frases que debes escribir... SUERTE!");
        jTextFieldFrase.setText(null);
        facilesRespondidas = 0;
        mediasRespondidas = 0;
        dificilesRespondidas =0;
        
    }
    
    public void retomarValores(){
        this.seg=30;
        this.cs=99;
        frase="";
    }
    
    public void actualizarJLabel(){
        String tiempo = (seg<=9?"0":"")+seg+":"+(cs<=9?"0":"")+cs;
        jLabelTiempo.setText(tiempo);
    }
    
    public interface2modulo1Juego() {
        initComponents();
        this.setLocationRelativeTo(null);
        t = new Timer(10,acciones);
        frases.llenarListaFrasesFaciles();
        frases.llenarListaFrasesMedias();
        frases.llenarListaFrasesDificiles();
        jLabelInstrucciones.setText("Escribe las frases rapidamente!");
        jLabelFrase.setText("Aqui aparecerán las frases que debes escribir... SUERTE!");
        teclado.mapeoTeclas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEmpezar = new javax.swing.JButton();
        jLabelInstrucciones = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jTextFieldFrase = new javax.swing.JTextField();
        jLabelFrase = new javax.swing.JLabel();
        jLabelImagenes = new javax.swing.JLabel();
        jLabelTiempo = new javax.swing.JLabel();
        jLabelGanaste = new javax.swing.JLabel();
        jLabelPerdiste = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEmpezar.setBackground(new java.awt.Color(51, 0, 102));
        jButtonEmpezar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEmpezar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEmpezar.setText("Empezar!");
        jButtonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jLabelInstrucciones.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabelInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 300, 50));

        jButtonAtras.setBackground(new java.awt.Color(0, 0, 102));
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextFieldFrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFraseActionPerformed(evt);
            }
        });
        jTextFieldFrase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFraseKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFraseKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 610, 30));

        jLabelFrase.setBackground(new java.awt.Color(153, 153, 255));
        jLabelFrase.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelFrase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 780, 70));
        getContentPane().add(jLabelImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 780, 320));

        jLabelTiempo.setBackground(new java.awt.Color(51, 0, 102));
        jLabelTiempo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 130, 30));
        getContentPane().add(jLabelGanaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 470, 320));
        getContentPane().add(jLabelPerdiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 520, 260));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-and-black-wallpaper-hd-smart-phone-mac-desktop-images-windows-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        interface2modulo1 a= new interface2modulo1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpezarActionPerformed
        jLabelImagenes.setIcon(null);
        jLabelGanaste.setIcon(null);
        jLabelPerdiste.setIcon(null);
        t.start();
        jTextFieldFrase.setText(null);
        facilesRespondidas = 0;
        mediasRespondidas = 0;
        dificilesRespondidas = 0;
    }//GEN-LAST:event_jButtonEmpezarActionPerformed

    private void jTextFieldFraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFraseActionPerformed
        
    }//GEN-LAST:event_jTextFieldFraseActionPerformed

    private void jTextFieldFraseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFraseKeyPressed
        if(seg<31 && cs<99){
            String letraPresionada = evt.getKeyChar() + " ";
            if("a ".equals(letraPresionada)||"b ".equals(letraPresionada)||"c ".equals(letraPresionada)||"d ".equals(letraPresionada)||"e ".equals(letraPresionada)||"f ".equals(letraPresionada)||"g ".equals(letraPresionada)||"h ".equals(letraPresionada))      
            jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("i ".equals(letraPresionada)||"j ".equals(letraPresionada)||"k ".equals(letraPresionada)||"l ".equals(letraPresionada)||"m ".equals(letraPresionada)||"n ".equals(letraPresionada)||"o ".equals(letraPresionada)||"p ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("q ".equals(letraPresionada)||"r ".equals(letraPresionada)||"s ".equals(letraPresionada)||"t ".equals(letraPresionada)||"u ".equals(letraPresionada)||"v ".equals(letraPresionada)||"w ".equals(letraPresionada)||"x ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("y ".equals(letraPresionada)||"z ".equals(letraPresionada)||"A ".equals(letraPresionada)||"B ".equals(letraPresionada)||"C ".equals(letraPresionada)||"D ".equals(letraPresionada)||"E ".equals(letraPresionada)||"F ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("G ".equals(letraPresionada)||"H ".equals(letraPresionada)||"I ".equals(letraPresionada)||"J ".equals(letraPresionada)||"K ".equals(letraPresionada)||"L ".equals(letraPresionada)||"M ".equals(letraPresionada)||"N ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("O ".equals(letraPresionada)||"P ".equals(letraPresionada)||"Q ".equals(letraPresionada)||"R ".equals(letraPresionada)||"S ".equals(letraPresionada)||"T ".equals(letraPresionada)||"U ".equals(letraPresionada)||"V ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("W ".equals(letraPresionada)||"X ".equals(letraPresionada)||"Y ".equals(letraPresionada)||"Z ".equals(letraPresionada)||"! ".equals(letraPresionada)||"¡ ".equals(letraPresionada)||". ".equals(letraPresionada)||", ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if ("¿ ".equals(letraPresionada)||"? ".equals(letraPresionada)||"  ".equals(letraPresionada)||"1 ".equals(letraPresionada)||"2 ".equals(letraPresionada)||"3 ".equals(letraPresionada)||"4 ".equals(letraPresionada)||"5 ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));
            else if("6 ".equals(letraPresionada)||"7 ".equals(letraPresionada)||"8 ".equals(letraPresionada)||"9 ".equals(letraPresionada)||"0 ".equals(letraPresionada))
                jLabelImagenes.setIcon(new javax.swing.ImageIcon(this.getClass().getResource(teclado.getTecla(letraPresionada))));

                }
    }//GEN-LAST:event_jTextFieldFraseKeyPressed

    private void jTextFieldFraseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFraseKeyReleased
        
    }//GEN-LAST:event_jTextFieldFraseKeyReleased

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
            java.util.logging.Logger.getLogger(interface2modulo1Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface2modulo1Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface2modulo1Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEmpezar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JLabel jLabelGanaste;
    private javax.swing.JLabel jLabelImagenes;
    private javax.swing.JLabel jLabelInstrucciones;
    private javax.swing.JLabel jLabelPerdiste;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JTextField jTextFieldFrase;
    // End of variables declaration//GEN-END:variables

    private interface2 interface2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
