/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author LIVERPOOL
 */
public class EliminarMedallas extends javax.swing.JFrame {

    /**
     * Creates new form EliminarMedallas
     */
    public EliminarMedallas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFIdMedalla = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonEliminar.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        setPreferredSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setText("idMedalla:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 40, 90, 30);

        txtFIdMedalla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        getContentPane().add(txtFIdMedalla);
        txtFIdMedalla.setBounds(410, 40, 160, 30);

        btnBuscar.setBackground(java.awt.Color.orange);
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 62, 0));
        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(590, 60, 73, 23);

        btnEliminar.setBackground(java.awt.Color.orange);
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(102, 62, 0));
        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(330, 340, 80, 23);

        btnRegresar.setBackground(java.awt.Color.orange);
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(102, 62, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(590, 340, 90, 23);

        btnBuscar1.setBackground(java.awt.Color.orange);
        btnBuscar1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(102, 62, 0));
        btnBuscar1.setText("Menú");
        btnBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar1);
        btnBuscar1.setBounds(470, 340, 73, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonEliminar.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 280, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonBuscar.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 10, 40, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 280, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonRegresar.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(620, 280, 50, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 100, 340, 170);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panel1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 90, 360, 190);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokemon1.gif"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 50, 260, 270);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/23EliminarMedallas.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantPrincipal= new PantallaPrincipal();
        pantPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscar1MouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        InterfazActualizarMedalla actMed= new InterfazActualizarMedalla();
        actMed.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(EliminarMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarMedallas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtFIdMedalla;
    // End of variables declaration//GEN-END:variables
}
