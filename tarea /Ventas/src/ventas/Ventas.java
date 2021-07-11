/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author indra
 */
public class Ventas extends javax.swing.JFrame {

    public static Productos producto;// = new Productos();
    public static ArrayList lista = new ArrayList();
    public int i = 0;

    public static String nom, folio;

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreIn = new javax.swing.JTextField();
        folioIn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionIn = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        productoIn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cantidadIn = new javax.swing.JTextField();
        nuevoBtn = new javax.swing.JButton();
        aceptarBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Maku", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Maku", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Folio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        nombreIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreInActionPerformed(evt);
            }
        });
        getContentPane().add(nombreIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 410, -1));

        folioIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folioInActionPerformed(evt);
            }
        });
        getContentPane().add(folioIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 140, -1));

        jLabel4.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        descripcionIn.setColumns(20);
        descripcionIn.setRows(5);
        jScrollPane2.setViewportView(descripcionIn);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 340, -1));

        jLabel5.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        getContentPane().add(productoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, -1));

        jLabel6.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, 60));

        cantidadIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadInActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, -1));

        nuevoBtn.setText("Nuevo");
        nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 90, -1));

        aceptarBtn.setText("Ticket");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 90, -1));

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });
        getContentPane().add(salirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 90, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/indra/Desktop/fondo2.jpeg")); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        String p;
        int c;
        String d;
        nom = nombreIn.getText();
        folio = folioIn.getText();

        if (folio.length() != 0 || nom.length() != 0 || productoIn.getText().length() != 0 || cantidadIn.getText().length() != 0) {
            try {
                System.out.println(productoIn.getText().length());
                System.out.println(cantidadIn.getText().length());
                p = productoIn.getText();
                c = Integer.parseInt(cantidadIn.getText());
                d = descripcionIn.getText();
                historial(p, c, d);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Revisa los datos introducidos");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Revisa los datos introducidos");
        }

        ticket t = new ticket();
        t.setVisible(true);
        this.setVisible(false);

        limpiar();
        //System.out.println("nom: "+nom+" folio: "+ folio);
    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void folioInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folioInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folioInActionPerformed

    private void nombreInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreInActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_salirBtnActionPerformed

    private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed

        if (productoIn.getText().length() != 0 || cantidadIn.getText().length() != 0) {
            try {

                String p = productoIn.getText();
                int c = Integer.parseInt(cantidadIn.getText());
                String d = descripcionIn.getText();

                historial(p, c, d);
                nuevo();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Revisa los datos introducidos");
            }

        } else {
            JOptionPane.showMessageDialog(null, " Revisa los datos introducidos");
        }

        /* &
         */
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoBtnActionPerformed

    private void cantidadInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadInActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JTextField cantidadIn;
    private javax.swing.JTextArea descripcionIn;
    private javax.swing.JTextField folioIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreIn;
    private javax.swing.JButton nuevoBtn;
    private javax.swing.JTextField productoIn;
    private javax.swing.JButton salirBtn;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {

        productoIn.setText("");
        cantidadIn.setText("");
        descripcionIn.setText("");
        folioIn.setText("");
        nombreIn.setText("");

    }

    public void nuevo() {

        productoIn.setText("");
        cantidadIn.setText("");
        descripcionIn.setText("");

    }

    public void historial(String p, int c, String d) {

        d = d.length() != 0 ? d : "- producto sin descripción -";

        producto = new Productos(p, c, d);

        lista.add(producto);

    }
}
