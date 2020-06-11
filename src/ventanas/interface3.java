package ventanas;

import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JAIRO
 */
public class interface3 extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ArrayList<String> usuarios;
    /**
     * Creates new form interface3
     */
    public interface3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public interface3 (ArrayList<String> usuarios){
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarios = usuarios;
    } 
    
     public Image getIconImage() {
        Image retValue = null;
        
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCrearUsuario = new javax.swing.JLabel();
        jLabelCrearContraseña = new javax.swing.JLabel();
        jTextFieldEscribircuenta = new javax.swing.JTextField();
        jPasswordFieldCrearConraseña = new javax.swing.JPasswordField();
        jLabelRepetirContraseña = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPasswordFieldRepetirContraseña = new javax.swing.JPasswordField();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCrearUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCrearUsuario.setText("Crear Usuario:");
        getContentPane().add(jLabelCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, 40));

        jLabelCrearContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCrearContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCrearContraseña.setText("Crear Contraseña:");
        getContentPane().add(jLabelCrearContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jTextFieldEscribircuenta.setForeground(new java.awt.Color(0, 51, 255));
        jTextFieldEscribircuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEscribircuentaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEscribircuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 280, -1));

        jPasswordFieldCrearConraseña.setForeground(new java.awt.Color(0, 51, 255));
        jPasswordFieldCrearConraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCrearConraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldCrearConraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 280, -1));

        jLabelRepetirContraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRepetirContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRepetirContraseña.setText("Repetir Contraseña:");
        getContentPane().add(jLabelRepetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 40));

        jButtonCrear.setBackground(new java.awt.Color(0, 0, 255));
        jButtonCrear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrear.setText("Crear Cuenta");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jButtonAtras.setBackground(new java.awt.Color(51, 0, 255));
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Crea una cuenta nueva ");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));
        getContentPane().add(jPasswordFieldRepetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 280, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-and-black-wallpaper-hd-smart-phone-mac-desktop-images-windows-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEscribircuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEscribircuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEscribircuentaActionPerformed

    private void jPasswordFieldCrearConraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCrearConraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCrearConraseñaActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
   interface1 a=new interface1();
       a.setVisible(true);
       this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        String cadena1, cadena2, cadena3;
        cadena1 = jTextFieldEscribircuenta.getText();
        cadena2 = jPasswordFieldCrearConraseña.getText();
        cadena3 = jPasswordFieldRepetirContraseña.getText();
        
        if(!cadena2.equals(cadena3)){
            javax.swing.JOptionPane.showMessageDialog(this, "las contrasenias no son iguales \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else if(cadena1.equals("") || cadena2.equals("") || cadena3.equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "debe llenar todos los campos \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }else{
            if(existeUsuario(cadena1)){
                JOptionPane.showMessageDialog(null, "EL usuario ya Exixte");
            }else{
                try{
                    String url;
                    url = "jdbc:mysql://localhost:3306/typingtrainer";
                    String usuario="root";
                    String contraseña="";
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con =DriverManager.getConnection(url,usuario,contraseña);
                    if(con !=null)
                    System.out.println("sse ha establecido una coneccion a la base de datos"+"\n"+url );
                    stmt = con.createStatement();
                    stmt.executeUpdate("INSERT INTO usuarios VALUES('"+cadena1+"', '"+cadena3+"')");
                    System.out.println("Los valores han sido agregados a la base de datos");
                } catch(InstantiationException ex){
                    Logger.getLogger(interface3.class.getName()).log(Level.SEVERE,null,ex);
                }catch(IllegalAccessException ex){
                    Logger.getLogger(interface3.class.getName()).log(Level.SEVERE,null,ex);   
                }catch(ClassNotFoundException ex){
                    Logger.getLogger(interface3.class.getName()).log(Level.SEVERE,null,ex);
                }catch (SQLException ex){
                    Logger.getLogger(interface3.class.getName()).log(Level.SEVERE,null,ex);     
                }
            
                finally{
                    if(con !=null){
                        try{
                            con.close();
                            stmt.close();
                        }catch (SQLException e){
                            System.out.println(e.getMessage());
                        }
                    }   
                }
                javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso ! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            interface1 a=new interface1();
            a.setVisible(true);
            this.setVisible(false);
        }
       
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private boolean existeUsuario(String usuario){
        boolean res = false;
        for(String s: usuarios){
            if(s.equals(usuario)){
                res = true;
            }
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
            java.util.logging.Logger.getLogger(interface3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JLabel jLabelCrearContraseña;
    private javax.swing.JLabel jLabelCrearUsuario;
    private javax.swing.JLabel jLabelRepetirContraseña;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPasswordField jPasswordFieldCrearConraseña;
    private javax.swing.JPasswordField jPasswordFieldRepetirContraseña;
    private javax.swing.JTextField jTextFieldEscribircuenta;
    // End of variables declaration//GEN-END:variables
}