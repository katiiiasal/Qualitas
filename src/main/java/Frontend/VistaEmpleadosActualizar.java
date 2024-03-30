/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.Utilidades;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author heiva
 */
public class VistaEmpleadosActualizar extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductosCrear
     */
    public VistaEmpleadosActualizar() {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblidEmpleado = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtfidEmpleado = new javax.swing.JTextField();
        txtfNombre = new javax.swing.JTextField();
        txtfApellidoPaterno = new javax.swing.JTextField();
        txtfApellidoMaterno = new javax.swing.JTextField();
        txtfEmail = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtpPassword = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - ACTUALIZAR EMPLEADOS");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        getContentPane().setLayout(null);

        lblidEmpleado.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblidEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblidEmpleado.setText("idEmpleado");
        lblidEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblidEmpleado);
        lblidEmpleado.setBounds(520, 140, 140, 32);

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(520, 230, 90, 32);

        lblApellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidoPaterno.setText("Apellido Paterno");
        lblApellidoPaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(520, 320, 190, 32);

        lblApellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidoMaterno.setText("Apellido Materno");
        lblApellidoMaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(510, 410, 210, 32);

        lblEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblEmail);
        lblEmail.setBounds(530, 490, 60, 32);

        txtfidEmpleado.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfidEmpleado.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfidEmpleado);
        txtfidEmpleado.setBounds(520, 180, 690, 40);

        txtfNombre.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombre.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombre.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(520, 270, 690, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoPaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoPaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(520, 360, 690, 38);

        txtfApellidoMaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoMaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoMaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(520, 440, 690, 40);

        txtfEmail.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfEmail.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfEmail.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEmail);
        txtfEmail.setBounds(520, 520, 690, 40);

        btnActualizar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(130, 480, 243, 55);

        lblProductos.setIcon(new javax.swing.ImageIcon("C:\\Images\\Empleados.png")); // NOI18N
        getContentPane().add(lblProductos);
        lblProductos.setBounds(120, 170, 280, 260);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EMPLEADOS");
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
        btnRegresar.setBounds(60, 20, 170, 80);

        lblPassword.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Contraseña");
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblPassword);
        lblPassword.setBounds(520, 580, 130, 32);

        txtpPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtpPassword.setText("jPasswordField1");
        getContentPane().add(txtpPassword);
        txtpPassword.setBounds(520, 620, 690, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEmailActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
                 VistaEmpleados vistaEmpleados = new VistaEmpleados();
                 vistaEmpleados.show();
                 dispose();      
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         
        String nombre = txtfNombre.getText();
        System.out.println(nombre);
        String apellidoPaterno = txtfApellidoPaterno.getText();
        System.out.println (apellidoPaterno);
        
        String apellidoMaterno = txtfApellidoMaterno.getText();
        System.out.println (apellidoMaterno);
        
        String email = txtfEmail.getText();
        System.out.println (email);
        
        String password =  String.valueOf(txtpPassword.getPassword());
        System.out.println(password);
        
        
        
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de actualizar este Empleado?", 
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
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEmpleadosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleadosActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblidEmpleado;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfidEmpleado;
    private javax.swing.JPasswordField txtpPassword;
    // End of variables declaration//GEN-END:variables
}
