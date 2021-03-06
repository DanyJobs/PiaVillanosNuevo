/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Combo;
import Clases.Procedimientos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author yarel
 */
public class ModificarEntrenador extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public ModificarEntrenador() {
        initComponents();
        this.setResizable(false);
        //Que aparezca en medio
        this.setLocationRelativeTo(null);
        Combo llenar = new Combo();
        llenar.llenar_combo(cmbCiudad, "Select * from Ciudad", "IdCiudad", "nombre");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFIdEntrenador = new javax.swing.JTextField();
        txtFNombre = new javax.swing.JTextField();
        txtFApPaterno = new javax.swing.JTextField();
        txtFDireccion = new javax.swing.JTextField();
        txtFApMaterno = new javax.swing.JTextField();
        txtFTelefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        setPreferredSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("idEntrenador:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 80, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 70, 80, 16);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 110, 16);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Apellido Materno:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 150, 110, 16);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Direcci??n:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 110, 16);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 270, 60, 16);

        txtFIdEntrenador.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFIdEntrenador.setPreferredSize(new java.awt.Dimension(8, 22));
        getContentPane().add(txtFIdEntrenador);
        txtFIdEntrenador.setBounds(130, 10, 100, 30);

        txtFNombre.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFNombre.setPreferredSize(new java.awt.Dimension(8, 22));
        getContentPane().add(txtFNombre);
        txtFNombre.setBounds(130, 60, 140, 30);

        txtFApPaterno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFApPaterno.setPreferredSize(new java.awt.Dimension(8, 22));
        txtFApPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFApPaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFApPaterno);
        txtFApPaterno.setBounds(130, 100, 140, 30);

        txtFDireccion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        getContentPane().add(txtFDireccion);
        txtFDireccion.setBounds(130, 180, 140, 30);

        txtFApMaterno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtFApMaterno.setPreferredSize(new java.awt.Dimension(8, 22));
        getContentPane().add(txtFApMaterno);
        txtFApMaterno.setBounds(130, 140, 140, 30);

        txtFTelefono.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        getContentPane().add(txtFTelefono);
        txtFTelefono.setBounds(130, 260, 140, 30);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setText("Ciudad:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 310, 46, 16);

        cmbCiudad.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cmbCiudad.setInheritsPopupMenu(true);
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCiudad);
        cmbCiudad.setBounds(130, 300, 140, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setText("Fec. Nacimiento:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 230, 99, 16);
        getContentPane().add(jFechaNac);
        jFechaNac.setBounds(130, 220, 140, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panel1.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 50, 270, 290);

        btnBuscar.setBackground(java.awt.Color.orange);
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 62, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(290, 20, 73, 23);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonBuscar.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 0, 40, 50);

        btnMenu.setBackground(java.awt.Color.orange);
        btnMenu.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(102, 62, 0));
        btnMenu.setText("Men??");
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
        btnMenu.setBounds(290, 330, 70, 23);

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
        btnRegresar.setBounds(280, 230, 100, 23);

        btnModificar.setBackground(java.awt.Color.orange);
        btnModificar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(102, 62, 0));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(280, 140, 100, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonModificar.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(300, 80, 50, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(300, 270, 50, 50);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonRegresar.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(300, 170, 50, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tumblr_mjtrowPBFL1qkk63ho1_500 (1).gif"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(500, 200, 200, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/18ActualizarEntrenador.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFApPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFApPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFApPaternoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantPrincipal = new PantallaPrincipal();
        pantPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        ActualizarEntrenador actEnt = new ActualizarEntrenador();
        actEnt.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int idEntrenador;
        String nombre;
        String App;
        String Apm;
        String tel;
        String dir;
        int ciudad;
        String mensaje;

        if (txtFIdEntrenador.getText().isEmpty() || txtFNombre.getText().isEmpty() || txtFApPaterno.getText().isEmpty() || txtFApMaterno.getText().isEmpty()
                || jFechaNac.getDate() == null || txtFTelefono.getText().isEmpty() || txtFDireccion.getText().isEmpty()
                || cmbCiudad.getSelectedIndex() == 0 || cmbCiudad.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los datos", "Error de introduccion de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                idEntrenador = Integer.parseInt(txtFIdEntrenador.getText().trim());
                nombre = txtFNombre.getText().trim();
                App = txtFApPaterno.getText().trim();
                Apm = txtFApMaterno.getText().trim();
                Date date = jFechaNac.getDate();
                long d = date.getTime();
                java.sql.Date fechaNac = new java.sql.Date(d);
                dir = txtFDireccion.getText().trim();
                tel = txtFTelefono.getText().trim();
                ciudad = cmbCiudad.getItemAt(cmbCiudad.getSelectedIndex()).getCodigo();
                mensaje = Procedimientos.ModificarEntrenador(idEntrenador, nombre, App, Apm, fechaNac, tel, dir, ciudad);
                JOptionPane.showMessageDialog(null, mensaje);
                txtFIdEntrenador.setText("");
                txtFNombre.setText("");
                txtFDireccion.setText("");
                txtFApPaterno.setText("");
                txtFApMaterno.setText("");
                txtFTelefono.setText("");
                jFechaNac.setDate(null);
                cmbCiudad.setSelectedIndex(0);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String vDato = txtFIdEntrenador.getText().trim();
        if (vDato.equals("")) {
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los datos", "Error de introduccion de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "SELECT * From Entrenador where idEntrenador = '" + vDato + "'";
                ResultSet consulta = Procedimientos.BuscarConsultas(sql);
                if (consulta != null && consulta.next()) {
                    txtFIdEntrenador.setText(consulta.getString("idEntrenador"));
                    txtFNombre.setText(consulta.getString("nombre"));
                    txtFApPaterno.setText(consulta.getString("ApellidoP"));
                    txtFApMaterno.setText(consulta.getString("ApellidoM"));
                    jFechaNac.setDate(consulta.getDate("FechaN"));
                    txtFTelefono.setText(consulta.getString("NCelular"));
                    txtFDireccion.setText(consulta.getString("Direccion"));
                    cmbCiudad.setSelectedIndex(consulta.getInt("idCiudad"));

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro resultados", "Error de conexion", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collaciudaded" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(ModificarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEntrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<Combo> cmbCiudad;
    private com.toedter.calendar.JDateChooser jFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtFApMaterno;
    private javax.swing.JTextField txtFApPaterno;
    private javax.swing.JTextField txtFDireccion;
    private javax.swing.JTextField txtFIdEntrenador;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFTelefono;
    // End of variables declaration//GEN-END:variables
}
