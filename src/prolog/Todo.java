package prolog;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.jpl7.Query;

public class Todo extends javax.swing.JFrame {

    private JLabel etiqueta;

    public Todo() {
        initComponents();
        setTitle("Dime Todo");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/cz/icon_main_sec.jpg"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        signo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        compatible = new javax.swing.JTextArea();
        day = new javax.swing.JFormattedTextField();
        month = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        horoscopo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btInicio = new javax.swing.JButton();
        Secundario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        signo.setColumns(20);
        signo.setRows(5);
        jScrollPane1.setViewportView(signo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 10, 120, 40);

        compatible.setColumns(20);
        compatible.setRows(5);
        jScrollPane2.setViewportView(compatible);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 110, 290, 50);

        day.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dayKeyTyped(evt);
            }
        });
        getContentPane().add(day);
        day.setBounds(70, 60, 70, 30);

        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                monthKeyTyped(evt);
            }
        });
        getContentPane().add(month);
        month.setBounds(80, 110, 70, 30);

        horoscopo.setColumns(20);
        horoscopo.setRows(5);
        jScrollPane3.setViewportView(horoscopo);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(230, 280, 380, 120);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Horóscopo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 230, 200, 40);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 110, 70, 40);

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Compatibilidad");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 60, 320, 40);

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Signo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 10, 140, 40);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dia:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 60, 70, 40);
        getContentPane().add(image);
        image.setBounds(30, 240, 170, 200);

        jButton3.setBackground(new java.awt.Color(102, 255, 255));
        jButton3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButton3.setText("Dime todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 150, 150, 40);

        btInicio.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btInicio.setText("Inicio");
        btInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btInicio);
        btInicio.setBounds(10, 10, 140, 30);

        Secundario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cz/Secundario2.gif"))); // NOI18N
        getContentPane().add(Secundario);
        Secundario.setBounds(0, 0, 660, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayKeyTyped
        char car = evt.getKeyChar();
        if (day.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_dayKeyTyped

    private void monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthKeyTyped

        char car = evt.getKeyChar();
        if (month.getText().length() >= 2) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_monthKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int dayy = Integer.parseInt(day.getText());
        int monthh = Integer.parseInt(month.getText());

        try {
            String conexion = "consult('horoscopo.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion + "" + (con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
            System.out.println("Iniciando la prueba");

            String consul = "main(" + this.day.getText() + "," + month.getText() + ",X,Y,Z,A).";
            Query ejecutar = new Query(consul);
            if (ejecutar.hasSolution()) {

                System.out.println(" Tu horóscopo es: " + ejecutar.oneSolution().get("Z").toString());
                signo.setText(String.valueOf(ejecutar.oneSolution().get("X").toString()));
                compatible.setText(String.valueOf(ejecutar.oneSolution().get("Y") + ejecutar.oneSolution().get("Z").toString()));
                horoscopo.setText(String.valueOf(ejecutar.oneSolution().get("A").toString()));

                switch (signo.getText()) {

                    case "acuario":
                        String path = "/cz/Acuario_z.gif";
                        URL url = this.getClass().getResource(path);
                        ImageIcon icon = new ImageIcon(url);
                        image.setIcon(icon);
                        System.out.println("Hola Acuario");

                        break;

                    case "aries":
                        String path2 = "/cz/Aries_z.gif";
                        URL url2 = this.getClass().getResource(path2);
                        ImageIcon icon2 = new ImageIcon(url2);
                        image.setIcon(icon2);
                        System.out.println("Hola Aries");

                        break;

                    case "cancer":
                        String path3 = "/cz/Cancer_z.gif";
                        URL url3 = this.getClass().getResource(path3);
                        ImageIcon icon3 = new ImageIcon(url3);
                        image.setIcon(icon3);
                        System.out.println("Hola Cancer");
                        break;

                    case "capricornio":
                        String path4 = "/cz/Capricornio_z.gif";
                        URL url4 = this.getClass().getResource(path4);
                        ImageIcon icon4 = new ImageIcon(url4);
                        image.setIcon(icon4);
                        System.out.println("Hola Capricornio");
                        break;
                    case "gemenis":
                        String path5 = "/cz/Geminis_z.gif";
                        URL url5 = this.getClass().getResource(path5);
                        ImageIcon icon5 = new ImageIcon(url5);
                        image.setIcon(icon5);
                        System.out.println("Hola Geminis");
                        break;
                    case "leo":
                        String path6 = "/cz/Leo_z.gif";
                        URL url6 = this.getClass().getResource(path6);
                        ImageIcon icon6 = new ImageIcon(url6);
                        image.setIcon(icon6);
                        System.out.println("Hola Leo");
                        break;
                    case "libra":
                        String path7 = "/cz/Libra_z.gif";
                        URL url7 = this.getClass().getResource(path7);
                        ImageIcon icon7 = new ImageIcon(url7);
                        image.setIcon(icon7);
                        System.out.println("Hola Libra");
                        break;
                    case "picis":
                        String path8 = "/cz/Picis_z.gif";
                        URL url8 = this.getClass().getResource(path8);
                        ImageIcon icon8 = new ImageIcon(url8);
                        image.setIcon(icon8);
                        System.out.println("Hola Picis");
                        break;
                    case "sagitario":
                        String path9 = "/cz/Sagitario_z.gif";
                        URL url9 = this.getClass().getResource(path9);
                        ImageIcon icon9 = new ImageIcon(url9);
                        image.setIcon(icon9);
                        System.out.println("Hola Sagitario");
                        break;
                    case "escorpion":
                        String path10 = "/cz/Escorpio_z.gif";
                        URL url10 = this.getClass().getResource(path10);
                        ImageIcon icon10 = new ImageIcon(url10);
                        image.setIcon(icon10);
                        System.out.println("Hola Escorpion");
                        break;
                    case "tauro":
                        String path11 = "/cz/Tauro_z.gif";
                        URL url11 = this.getClass().getResource(path11);
                        ImageIcon icon11 = new ImageIcon(url11);
                        image.setIcon(icon11);
                        System.out.println("Hola Tauro");
                        break;

                    case "virgo":
                        String path12 = "/cz/Virgo_z.gif";
                        URL url12 = this.getClass().getResource(path12);
                        ImageIcon icon12 = new ImageIcon(url12);
                        image.setIcon(icon12);
                        System.out.println("Hola Virgo");
                        break;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInicioActionPerformed

        Horoscopo a = new Horoscopo();
        a.setResizable(false);
        this.setVisible(false);

    }//GEN-LAST:event_btInicioActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed

    }//GEN-LAST:event_monthActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Todo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Secundario;
    private javax.swing.JButton btInicio;
    private javax.swing.JTextArea compatible;
    private javax.swing.JFormattedTextField day;
    private javax.swing.JTextArea horoscopo;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JFormattedTextField month;
    private javax.swing.JTextArea signo;
    // End of variables declaration//GEN-END:variables
}
