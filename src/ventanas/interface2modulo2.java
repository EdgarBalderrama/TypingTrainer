/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class interface2modulo2 extends javax.swing.JFrame {
      Hilo h=new Hilo();
     Respuesta [] respuestaImagen;
        private int numero;
        private int intentos;
        private String Resultado;
        private int aciertos;
    
    public interface2modulo2() {
        initComponents();
        this.setLocationRelativeTo(null);
         armarImagen();
       NumerodeIntentos.setText("3");
       NumAciertos.setText("0");
       mostarImagen();
       h.start();
    }

    public void armarImagen(){
    respuestaImagen=new Respuesta[20];
    respuestaImagen[0]=new Respuesta("k","/imagenes/muestra1.png");
    respuestaImagen[1]=new Respuesta("b","/imagenes/muestra2.png");
    respuestaImagen[2]=new Respuesta("i","/imagenes/muestra3.png");
    respuestaImagen[3]=new Respuesta("t","/imagenes/muestra4.png");
    respuestaImagen[4]=new Respuesta("h","/imagenes/muestra5.png");
    respuestaImagen[5]=new Respuesta("f","/imagenes/muestra6.png");
    respuestaImagen[6]=new Respuesta("k","/imagenes/muestra7.png");
    respuestaImagen[7]=new Respuesta("y","/imagenes/muestra8.png");
    respuestaImagen[8]=new Respuesta("w","/imagenes/muestra9.png");
    respuestaImagen[9]=new Respuesta("x","/imagenes/muestra10.png");
    respuestaImagen[10]=new Respuesta("v","/imagenes/muestra11.png");
    respuestaImagen[11]=new Respuesta("s","/imagenes/muestra12.png");
    respuestaImagen[12]=new Respuesta("f","/imagenes/muestra13.png");
    respuestaImagen[13]=new Respuesta("z","/imagenes/muestra14.png");
    respuestaImagen[14]=new Respuesta("o","/imagenes/muestra15.png");
    respuestaImagen[15]=new Respuesta("u","/imagenes/muestra16.png");
    respuestaImagen[16]=new Respuesta("e","/imagenes/muestra17.png");
    respuestaImagen[17]=new Respuesta("p","/imagenes/muestra18.png");
    respuestaImagen[18]=new Respuesta("a","/imagenes/muestra19.png");
    respuestaImagen[19]=new Respuesta("n","/imagenes/muestra20.png");
    }
    public void mostarImagen(){
    mostrarteclas.setIcon(new javax.swing.ImageIcon(getClass().getResource(respuestaImagen[numero].getTecla())));
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarteclas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CajaRespuesta = new javax.swing.JTextField();
        jButtonverificar = new javax.swing.JButton();
        NumerodeIntentos = new javax.swing.JLabel();
        CuantosIntentos = new javax.swing.JLabel();
        NumAciertos = new javax.swing.JLabel();
        TituloTiempo = new javax.swing.JLabel();
        Naciertos = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostrarteclas.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mostrarteclas.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(mostrarteclas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 330, 150));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        CajaRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaRespuestaActionPerformed(evt);
            }
        });
        getContentPane().add(CajaRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 190, 30));

        jButtonverificar.setBackground(new java.awt.Color(0, 0, 255));
        jButtonverificar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonverificar.setText("verificar");
        jButtonverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonverificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        NumerodeIntentos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NumerodeIntentos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NumerodeIntentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 50, 40));

        CuantosIntentos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CuantosIntentos.setForeground(new java.awt.Color(255, 255, 255));
        CuantosIntentos.setText("Nunero de intentos");
        getContentPane().add(CuantosIntentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        NumAciertos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NumAciertos.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NumAciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 50, 30));

        TituloTiempo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TituloTiempo.setForeground(new java.awt.Color(255, 255, 255));
        TituloTiempo.setText("Tiempo Total(S)");
        getContentPane().add(TituloTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 30));

        Naciertos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Naciertos.setForeground(new java.awt.Color(255, 255, 255));
        Naciertos.setText("Aciertos");
        getContentPane().add(Naciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 70, -1));

        Tiempo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 60, 50));

        jLabelFondo.setBackground(new java.awt.Color(0, 0, 255));
        jLabelFondo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-and-black-wallpaper-hd-smart-phone-mac-desktop-images-windows-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       interface2 a=new interface2();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CajaRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaRespuestaActionPerformed

    private void jButtonverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonverificarActionPerformed
 if(CajaRespuesta.getText().equals("")){
    JOptionPane.showMessageDialog(null, "Campo vacio");
    } else{
     String posibleRespuesta = convertirMinuscula(CajaRespuesta.getText());
    if(posibleRespuesta.equals(respuestaImagen[numero].getRespuesta())){
    JOptionPane.showMessageDialog(null, "Muy bien");
    numero=numero+1;
    intentos = Integer.parseInt(NumerodeIntentos.getText());
    aciertos=Integer.parseInt(NumAciertos.getText());
    
    
    if(numero==20){
        Win1 w=new Win1();
        w.setVisible(true);
        this.setVisible(false);
    }
    mostarImagen();
    CajaRespuesta.setText(null);
    
    int aumento=1;
    aciertos=aciertos+aumento;
    Resultado=aciertos+"";
    NumAciertos.setText(Resultado);
    if(intentos<3){
        intentos=intentos +aumento;
    }
    Resultado=intentos+"";
    NumerodeIntentos.setText(Resultado);
    }else{
    JOptionPane.showMessageDialog(null,"Es intentando lo Imposible como se realiza lo Posible","sigue intentando",JOptionPane.INFORMATION_MESSAGE);
    CajaRespuesta.setText(null);
    int descuento=1;
    intentos=Integer.parseInt(NumerodeIntentos.getText());
    intentos=intentos-descuento;
    Resultado=intentos+"";
    NumerodeIntentos.setText(Resultado);
    }if(intentos==0){
    GameOver1 g=new GameOver1();
    g.setVisible(true);
    this.setVisible(false);
    
    }
    
    }         }//GEN-LAST:event_jButtonverificarActionPerformed

    private String convertirMinuscula(String h){
        String res;
        if(h.equals("a") || h.equals("A")){
            res = "a";
        }else if(h.equals("b") || h.equals("B")){
            res = "b";
        }else if(h.equals("c") || h.equals("C")){
            res = "c";
        }else if(h.equals("d") || h.equals("D")){
            res = "d";
        }else if(h.equals("e") || h.equals("E")){
            res = "e";
        }else if(h.equals("f") || h.equals("F")){
            res = "f";
        }else if(h.equals("g") || h.equals("G")){
            res = "g";
        }else if(h.equals("h") || h.equals("H")){
            res = "h";
        }else if(h.equals("i") || h.equals("I")){
            res = "i";
        }else if(h.equals("j") || h.equals("J")){
            res = "j";
        }else if(h.equals("K") || h.equals("k")){
            res = "k";
        }else if(h.equals("l") || h.equals("L")){
            res = "l";
        }else if(h.equals("m") || h.equals("M")){
            res = "m";
        }else if(h.equals("n") || h.equals("N")){
            res = "n";
        }else if(h.equals("ñ") || h.equals("Ñ")){
            res = "ñ";
        }else if(h.equals("o") || h.equals("O")){
            res = "o";
        }else if(h.equals("p") || h.equals("P")){
            res = "p";
        }else if(h.equals("q") || h.equals("Q")){
            res = "q";
        }else if(h.equals("r") || h.equals("R")){
            res = "r";
        }else if(h.equals("s") || h.equals("S")){
            res = "s";
        }else if(h.equals("t") || h.equals("T")){
            res = "t";
        }else if(h.equals("u") || h.equals("U")){
            res = "u";
        }else if(h.equals("V") || h.equals("v")){
            res = "v";
        }else if(h.equals("w") || h.equals("W")){
            res = "w";
        }else if(h.equals("x") || h.equals("X")){
            res = "x";
        }else if(h.equals("y") || h.equals("Y")){
            res = "y";
        }else if(h.equals("z") || h.equals("Z")){
            res = "z";
        }else{
            res = h;
        }
        return res;
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
            java.util.logging.Logger.getLogger(interface2modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface2modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface2modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface2modulo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface2modulo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaRespuesta;
    private javax.swing.JLabel CuantosIntentos;
    private javax.swing.JLabel Naciertos;
    private javax.swing.JLabel NumAciertos;
    private javax.swing.JLabel NumerodeIntentos;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel TituloTiempo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonverificar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel mostrarteclas;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelatiVeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private class Hilo extends Thread{
        private int contador=0;
        public void run(){
        while(true){
          Tiempo.setText(Integer.toString(contador++)); 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(interface2modulo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            }
    
    }
}



