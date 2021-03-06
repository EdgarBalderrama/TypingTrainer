/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import Herramientas.ConexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PUDGE
 */
public class interface1 extends javax.swing.JFrame {
    
    ArrayList<String> usuarios = new ArrayList<>();
    ArrayList<String> contrasenia = new ArrayList<>();

    ConexionBD con  = new ConexionBD();
    Connection cn = con.conexion();
    Statement stmt;
    /**
     * Creates new form interface1
     */
    public interface1() {
        initComponents();
        this.setLocationRelativeTo(null);
        recuperarDatos();
    }
    
    private void recuperarDatos(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn(" Nombre ");
        modelo.addColumn("");
        tabla_tutores.setModel(modelo);
        
        String sql = "SELECT * FROM usuarios";
        
        String[] datos = new String[2];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                usuarios.add(rs.getString(1));
                contrasenia.add(rs.getString(2));
                modelo.addRow(datos);
            }
            tabla_tutores.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(interface1.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0 ;i < usuarios.size(); i++){
            System.out.println(usuarios.get(i));
        }
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tutores = new javax.swing.JTable();
        jButtonSalida = new javax.swing.JButton();
        jLabel2fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonIniciar = new javax.swing.JButton();
        jButtoncrearCuenta = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        tabla_tutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_tutores);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalida.setBackground(new java.awt.Color(0, 51, 255));
        jButtonSalida.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalida.setText("Salir");
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        jLabel2fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User.png"))); // NOI18N
        getContentPane().add(jLabel2fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 250, 260));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, 20));

        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(0, 0, 255));
        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 150, -1));

        jPasswordFieldContraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldContraseña.setForeground(new java.awt.Color(0, 0, 255));
        jPasswordFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, -1));

        jButtonIniciar.setBackground(new java.awt.Color(0, 0, 204));
        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciar.setText("Iniciar Sesíon");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, 30));

        jButtoncrearCuenta.setBackground(new java.awt.Color(0, 0, 204));
        jButtoncrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jButtoncrearCuenta.setText("CrearCuenta");
        jButtoncrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtoncrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoncrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blue-and-black-wallpaper-hd-smart-phone-mac-desktop-images-windows-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed
     System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    private void jPasswordFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseñaActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        String cadena1, cadena2;
        cadena1 = jTextFieldUser.getText();
        cadena2 = jPasswordFieldContraseña.getText();
        if(esCorrecto(cadena1, cadena2)){
            interface2 a=new interface2();
            a.setVisible(true);
            this.setVisible(false);
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "error de login \n","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
       
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private boolean esCorrecto(String usuario, String pasword){
        boolean res = false;
        for(int i=0; i<usuarios.size(); i++){
            if(usuarios.get(i).equals(usuario)){
                if(contrasenia.get(i).equals(pasword))
                    res = true;
            }
        }
        return res;
    }
    
    private void jButtoncrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncrearCuentaActionPerformed
       interface3 a=new interface3(usuarios);
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtoncrearCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JButton jButtoncrearCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2fondo;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JTable tabla_tutores;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelatiVeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
