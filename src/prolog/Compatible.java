/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prolog;

import java.awt.Image;
import java.awt.Toolkit;
import org.jpl7.Query;

/**
 *
 * @author Dulce Bick
 */
public class Compatible extends javax.swing.JFrame {

    /** Creates new form Compatible */
    public Compatible() {
        initComponents();
        setTitle("Compatibilidad");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/nana.jpg"));
        setIconImage(icon);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        compatible = new javax.swing.JTextArea();
        compa = new javax.swing.JButton();
        inicio = new javax.swing.JButton();
        signo2 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        compatible.setColumns(20);
        compatible.setRows(5);
        jScrollPane1.setViewportView(compatible);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 290, 150);

        compa.setBackground(new java.awt.Color(255, 204, 255));
        compa.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        compa.setText("Ver");
        compa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compaActionPerformed(evt);
            }
        });
        getContentPane().add(compa);
        compa.setBounds(170, 140, 100, 30);

        inicio.setBackground(new java.awt.Color(255, 255, 255));
        inicio.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(204, 0, 204));
        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        getContentPane().add(inicio);
        inicio.setBounds(10, 10, 140, 30);

        signo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                signo2KeyTyped(evt);
            }
        });
        getContentPane().add(signo2);
        signo2.setBounds(10, 140, 140, 30);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escribe tu signo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 110, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caballeros/cosmos2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed

            Horoscopo a = new Horoscopo();
            a.setBounds(500,100,680,420);
            a.setResizable(false);
            a.setVisible(true);
            this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_inicioActionPerformed

    private void signo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signo2KeyTyped

char car = evt.getKeyChar(); 
if((car<'a' || car>'z'))
{
evt.consume();
    
}else{
    //z.setText(z.getText()+String.valueOf(evt.getKeyChar()));
}



        // TODO add your handling code here:
    }//GEN-LAST:event_signo2KeyTyped

    private void compaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compaActionPerformed

     String sig = String.valueOf(signo2.getText());
           
          // System.out.println(sig);
         
          try {
            String conexion = "consult('horoscopo.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion + "" + (con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
            System.out.println("Iniciando la prueba");
            String consul = "prueba(X,"+sig+",Y).";
            Query ejecutar = new Query(consul);
            if (ejecutar.hasSolution()) {
           
           System.out.println(" Tu horóscopo es: "+ejecutar.oneSolution().get("X").toString());
           System.out.println(" Tu horóscopo es: "+ejecutar.oneSolution().get("Y").toString());
           compatible.setText(String.valueOf(ejecutar.oneSolution().get("X").toString()));
           compatible.setText(String.valueOf(ejecutar.oneSolution().get("Y").toString()));
         
             
             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
           
      
       



        // TODO add your handling code here:
    }//GEN-LAST:event_compaActionPerformed

    /**
     * 
     * 
     * 
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
            java.util.logging.Logger.getLogger(Compatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compatible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compatible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compa;
    private javax.swing.JTextArea compatible;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField signo2;
    // End of variables declaration//GEN-END:variables

}
