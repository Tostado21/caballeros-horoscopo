
package prolog;
import java.awt.Image;
import java.awt.Toolkit;




public class Horoscopo extends javax.swing.JFrame {

    /**
     * Creates new form Horoscopo
     */
    public Horoscopo() {
        initComponents();
        setTitle("Horoscopo");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/cz/icon_main.png"));
        setIconImage(icon);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTodo = new javax.swing.JButton();
        principal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btTodo.setBackground(new java.awt.Color(102, 102, 255));
        btTodo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btTodo.setText("Play");
        btTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTodoActionPerformed(evt);
            }
        });
        getContentPane().add(btTodo);
        btTodo.setBounds(150, 110, 140, 30);

        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cz/principal.gif"))); // NOI18N
        getContentPane().add(principal);
        principal.setBounds(0, 0, 460, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTodoActionPerformed
           Todo a = new Todo();
           a.setBounds(500,100,680,500);
           a.setVisible(true);
    }//GEN-LAST:event_btTodoActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Horoscopo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTodo;
    private javax.swing.JLabel principal;
    // End of variables declaration//GEN-END:variables
}
