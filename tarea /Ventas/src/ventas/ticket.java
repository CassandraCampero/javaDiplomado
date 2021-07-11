/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.Iterator;

/**
 *
 * @author indra
 */
public class ticket extends javax.swing.JFrame {
    //javax.swing.JLabel principalLabel;

    Ventas v = new Ventas();

    public void mostrar() {
        nomTicket.setText(nomTicket.getText() + " " + v.nom);
        folioTicket.setText(folioTicket.getText() + " " + v.folio);

        Iterator<Productos> itrProductos = v.lista.iterator();
        while (itrProductos.hasNext()) {
            Productos prod = itrProductos.next();
            compra.append(prod.product + ", "
                    + prod.cantidad + ", "
                    + prod.descripcion + "\n");
        }

        /*for (int j = 0; j < v.lista.size(); j++) {
   
        
        compra.append( "producto: " + v.lista.get(j));
              
              
             
        }*/
    }

    /**
     * Creates new form ticket
     */
    public ticket() {
        initComponents();
        this.mostrar();
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
        nomTicket = new javax.swing.JLabel();
        folioTicket = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        detalle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        detalleCompra = new javax.swing.JScrollPane();
        compra = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Maku", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compra realizada");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nomTicket.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        nomTicket.setForeground(new java.awt.Color(255, 255, 255));
        nomTicket.setText("Nombre: ");
        getContentPane().add(nomTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 20));

        folioTicket.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        folioTicket.setForeground(new java.awt.Color(255, 255, 255));
        folioTicket.setText("Folio: ");
        getContentPane().add(folioTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        backBtn.setText("Regresar");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        detalle.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        detalle.setForeground(new java.awt.Color(255, 255, 255));
        detalle.setText("Detalle de compra: ");
        getContentPane().add(detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 450, 40));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        compra.setEditable(false);
        compra.setColumns(20);
        compra.setRows(5);
        detalleCompra.setViewportView(compra);

        getContentPane().add(detalleCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 480, 170));

        jLabel8.setFont(new java.awt.Font("Maku", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/indra/Desktop/fondo3.jpeg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        v.setVisible(true);
        v.limpiar();

        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea compra;
    private javax.swing.JLabel detalle;
    private javax.swing.JScrollPane detalleCompra;
    private javax.swing.JLabel folioTicket;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nomTicket;
    // End of variables declaration//GEN-END:variables

}
