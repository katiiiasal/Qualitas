/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author heiva
 */
public class VistaClientesCrear extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductosCrear
     */
    public VistaClientesCrear() {
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

        lblIdCliente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        txtfidCliente = new javax.swing.JTextField();
        txtfNombre = new javax.swing.JTextField();
        txtfApellidoMaterno = new javax.swing.JTextField();
        txtfApellidoPaterno = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        txtfCalle = new javax.swing.JTextField();
        lblCalle = new javax.swing.JLabel();
        lblNumeroInterior = new javax.swing.JLabel();
        txtfNumeroInterior = new javax.swing.JTextField();
        lblCodigoPostal = new javax.swing.JLabel();
        txtfCodigoPostal = new javax.swing.JTextField();
        lblColonia = new javax.swing.JLabel();
        txtfColonia = new javax.swing.JTextField();
        lblCuidad = new javax.swing.JLabel();
        txtfCuidad = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtfEstado = new javax.swing.JTextField();
        txtfEmail1 = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - CREAR CLIENTES");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        getContentPane().setLayout(null);

        lblIdCliente.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblIdCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdCliente.setText("idCliente");
        lblIdCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblIdCliente);
        lblIdCliente.setBounds(210, 130, 96, 32);

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(210, 220, 90, 32);

        lblApellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidoMaterno.setText("Apellido Materno");
        lblApellidoMaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(210, 310, 240, 32);

        lblApellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidoPaterno.setText("Apellido Paterno");
        lblApellidoPaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(210, 400, 230, 32);

        txtfidCliente.setEditable(false);
        txtfidCliente.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfidCliente.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfidCliente);
        txtfidCliente.setBounds(210, 170, 450, 40);

        txtfNombre.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombre.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombre.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(210, 260, 450, 40);

        txtfApellidoMaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoMaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoMaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(210, 350, 450, 38);

        txtfApellidoPaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoPaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoPaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(210, 430, 450, 40);

        txtfTelefono.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfTelefono.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfTelefono.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(210, 620, 450, 40);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CLIENTES");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(890, 30, 320, 90);

        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        btnRegresar.setText("🔙");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(60, 20, 180, 80);

        lblEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblEmail);
        lblEmail.setBounds(210, 490, 230, 32);

        btnCrear.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear);
        btnCrear.setBounds(790, 30, 141, 55);

        txtfCalle.setEditable(false);
        txtfCalle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfCalle.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfCalle);
        txtfCalle.setBounds(700, 170, 450, 40);

        lblCalle.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCalle.setText("Calle");
        lblCalle.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCalle);
        lblCalle.setBounds(700, 140, 53, 32);

        lblNumeroInterior.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNumeroInterior.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroInterior.setText("Numero Interior");
        lblNumeroInterior.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNumeroInterior);
        lblNumeroInterior.setBounds(700, 220, 210, 32);

        txtfNumeroInterior.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNumeroInterior.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNumeroInterior.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNumeroInterior);
        txtfNumeroInterior.setBounds(700, 260, 450, 40);

        lblCodigoPostal.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCodigoPostal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodigoPostal.setText("Codigo Postal");
        lblCodigoPostal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCodigoPostal);
        lblCodigoPostal.setBounds(700, 310, 240, 32);

        txtfCodigoPostal.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfCodigoPostal.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfCodigoPostal.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfCodigoPostal);
        txtfCodigoPostal.setBounds(700, 350, 450, 38);

        lblColonia.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblColonia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblColonia.setText("Colonia");
        lblColonia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblColonia);
        lblColonia.setBounds(700, 400, 230, 32);

        txtfColonia.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfColonia.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfColonia.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfColonia);
        txtfColonia.setBounds(700, 430, 450, 40);

        lblCuidad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCuidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCuidad.setText("Cuidad");
        lblCuidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCuidad);
        lblCuidad.setBounds(700, 490, 250, 32);

        txtfCuidad.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfCuidad.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfCuidad.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfCuidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCuidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCuidad);
        txtfCuidad.setBounds(700, 520, 450, 40);

        lblEstado.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEstado.setText("Estado");
        lblEstado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblEstado);
        lblEstado.setBounds(700, 590, 230, 32);

        txtfEstado.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfEstado.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfEstado.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEstado);
        txtfEstado.setBounds(700, 620, 450, 40);

        txtfEmail1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfEmail1.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfEmail1.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmail1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEmail1);
        txtfEmail1.setBounds(210, 520, 450, 40);

        lblTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTelefono.setText("Telefono");
        lblTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(210, 590, 230, 32);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(10, -20, 1430, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTelefonoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        /* 
        String nombre = txtfNombre.getText();
        System.out.println(nombre);
        String descripcion = txtfApellidoMaterno.getText();
        System.out.println(descripcion);
        int numeroLote = Integer.valueOf(txtfApellidoPaterno.getText());
        System.out.println(numeroLote);
        String fechaProduccion = txtffechaProduccion.getText();
        System.out.println(fechaProduccion);
        String fechaExpiracion = txtfTelefono.getText();
        System.out.println(fechaExpiracion);
        */
        
        
        
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de crear este producto?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
               //label.setText("You selected: Yes");
            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
               //label.setText("None selected");
            }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
                 VistaClientes vistaClientes = new VistaClientes();
                 vistaClientes.show();
                 dispose();      
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfCuidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCuidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCuidadActionPerformed

    private void txtfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEstadoActionPerformed

    private void txtfEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEmail1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaClientesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaClientesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaClientesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaClientesCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaClientesCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblCuidad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroInterior;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfCalle;
    private javax.swing.JTextField txtfCodigoPostal;
    private javax.swing.JTextField txtfColonia;
    private javax.swing.JTextField txtfCuidad;
    private javax.swing.JTextField txtfEmail1;
    private javax.swing.JTextField txtfEstado;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfNumeroInterior;
    private javax.swing.JTextField txtfTelefono;
    private javax.swing.JTextField txtfidCliente;
    // End of variables declaration//GEN-END:variables
}
