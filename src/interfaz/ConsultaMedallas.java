/*
Materia: Desarrollo de Software II
Nombre: Andrea Estrada Macias (Betty)
Institucion: UANL
Dependencia: FACPYA
Programa: PIA 
 */
package interfaz;

/**
 *
 * @author Andrea
 */
public class ConsultaMedallas extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaMedallas
     */
    public ConsultaMedallas() {
        initComponents();
           this.setResizable(false);	
             //Que aparezca en medio
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
        txtFEntrenador = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        setPreferredSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setText("Entrenador:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 130, 100, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Medallas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 230, 80, 20);

        txtFEntrenador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        getContentPane().add(txtFEntrenador);
        txtFEntrenador.setBounds(340, 130, 200, 30);

        btnConsultar.setBackground(java.awt.Color.orange);
        btnConsultar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(102, 62, 0));
        btnConsultar.setText("Consultar");
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(560, 170, 90, 25);

        btnMenu.setBackground(java.awt.Color.orange);
        btnMenu.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(102, 62, 0));
        btnMenu.setText("Menú");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(560, 280, 90, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonConsultar.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(580, 120, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 220, 50, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 170, 200, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/45982665_60x60.gif"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 150, 190, 180);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/07ConsultaMedallasGanadas.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantPrincipal= new PantallaPrincipal();
        pantPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaMedallas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaMedallas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtFEntrenador;
    // End of variables declaration//GEN-END:variables
}
