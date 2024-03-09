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
public class VistaProductosCrear extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductosCrear
     */
    public VistaProductosCrear() {
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

        lblidProducto = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblnumeroLote = new javax.swing.JLabel();
        lblfechaProduccion = new javax.swing.JLabel();
        lblfechaExpiracion = new javax.swing.JLabel();
        txtfidProducto = new javax.swing.JTextField();
        txtfNombre = new javax.swing.JTextField();
        txtfDescripcion = new javax.swing.JTextField();
        txtfnumeroLote = new javax.swing.JTextField();
        txtffechaExpiracion = new javax.swing.JTextField();
        txtffechaProduccion = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - CREAR PRODUCTO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        getContentPane().setLayout(null);

        lblidProducto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblidProducto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblidProducto.setText("idProducto");
        lblidProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblidProducto);
        lblidProducto.setBounds(520, 140, 122, 32);

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(520, 230, 90, 32);

        lblDescripcion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripcion");
        lblDescripcion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(520, 320, 128, 32);

        lblnumeroLote.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblnumeroLote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumeroLote.setText("Numero de lote");
        lblnumeroLote.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblnumeroLote);
        lblnumeroLote.setBounds(510, 410, 180, 32);

        lblfechaProduccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblfechaProduccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfechaProduccion.setText("Fecha de produccion");
        lblfechaProduccion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblfechaProduccion);
        lblfechaProduccion.setBounds(500, 490, 250, 32);

        lblfechaExpiracion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblfechaExpiracion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfechaExpiracion.setText("Fecha de expiracion");
        lblfechaExpiracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblfechaExpiracion);
        lblfechaExpiracion.setBounds(510, 580, 230, 32);

        txtfidProducto.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfidProducto.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfidProducto);
        txtfidProducto.setBounds(520, 180, 690, 40);

        txtfNombre.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombre.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombre.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(520, 270, 690, 40);

        txtfDescripcion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfDescripcion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfDescripcion.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfDescripcion);
        txtfDescripcion.setBounds(520, 360, 690, 38);

        txtfnumeroLote.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfnumeroLote.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfnumeroLote.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfnumeroLote);
        txtfnumeroLote.setBounds(520, 440, 690, 40);

        txtffechaExpiracion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtffechaExpiracion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtffechaExpiracion.setPreferredSize(new java.awt.Dimension(65, 40));
        txtffechaExpiracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtffechaExpiracionActionPerformed(evt);
            }
        });
        getContentPane().add(txtffechaExpiracion);
        txtffechaExpiracion.setBounds(520, 610, 690, 40);

        txtffechaProduccion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtffechaProduccion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtffechaProduccion.setPreferredSize(new java.awt.Dimension(65, 40));
        txtffechaProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtffechaProduccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtffechaProduccion);
        txtffechaProduccion.setBounds(520, 520, 690, 40);

        btnCrear.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear);
        btnCrear.setBounds(180, 470, 141, 55);

        lblProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\heiva\\Documents\\NetBeansProjects\\QualitasProject\\src\\main\\java\\Images\\Productos.png")); // NOI18N
        getContentPane().add(lblProductos);
        lblProductos.setBounds(120, 170, 280, 260);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PRODUCTOS");
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

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\heiva\\Documents\\NetBeansProjects\\QualitasProject\\src\\main\\java\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtffechaProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtffechaProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtffechaProduccionActionPerformed

    private void txtffechaExpiracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtffechaExpiracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtffechaExpiracionActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
         int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "Sure? You want to exit?", 
                            "Swing Tester",
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
                 VistaProductos vistaProductos = new VistaProductos();
                 vistaProductos.show();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaProductosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfechaExpiracion;
    private javax.swing.JLabel lblfechaProduccion;
    private javax.swing.JLabel lblidProducto;
    private javax.swing.JLabel lblnumeroLote;
    private javax.swing.JTextField txtfDescripcion;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtffechaExpiracion;
    private javax.swing.JTextField txtffechaProduccion;
    private javax.swing.JTextField txtfidProducto;
    private javax.swing.JTextField txtfnumeroLote;
    // End of variables declaration//GEN-END:variables
}
