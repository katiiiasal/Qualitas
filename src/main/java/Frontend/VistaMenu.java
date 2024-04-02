/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.Utilidades;

/**
 *
 * @author heiva
 */
public class VistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VistaMenu
     */
    public VistaMenu() {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
        Utilidades.convertComponentsToUpperCase(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        lblEmpleados = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblClientes1 = new javax.swing.JLabel();
        btnAlerta = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - MENU");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblMenu.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        lblMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenu.setText("MENÚ");
        getContentPane().add(lblMenu);
        lblMenu.setBounds(60, 420, 240, 90);

        btnPedidos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnPedidos.setText("PEDIDOS");
        btnPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedidos.setPreferredSize(new java.awt.Dimension(200, 35));
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedidos);
        btnPedidos.setBounds(480, 260, 200, 35);

        btnProductos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setPreferredSize(new java.awt.Dimension(200, 35));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos);
        btnProductos.setBounds(860, 260, 200, 35);

        btnEmpleados.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnEmpleados.setText("EMPLEADOS");
        btnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleados.setPreferredSize(new java.awt.Dimension(200, 35));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpleados);
        btnEmpleados.setBounds(480, 570, 200, 40);

        btnClientes.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setPreferredSize(new java.awt.Dimension(200, 35));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes);
        btnClientes.setBounds(860, 570, 200, 35);

        lblEmpleados.setIcon(new javax.swing.ImageIcon("C:\\Images\\Empleados.png")); // NOI18N
        getContentPane().add(lblEmpleados);
        lblEmpleados.setBounds(460, 410, 240, 190);

        lblPedidos.setIcon(new javax.swing.ImageIcon("C:\\Images\\Pedidos.png")); // NOI18N
        getContentPane().add(lblPedidos);
        lblPedidos.setBounds(460, 100, 220, 200);

        lblProductos.setIcon(new javax.swing.ImageIcon("C:\\Images\\Productos.png")); // NOI18N
        getContentPane().add(lblProductos);
        lblProductos.setBounds(810, 100, 270, 210);

        lblClientes1.setIcon(new javax.swing.ImageIcon("C:\\Images\\Clientes.jpg")); // NOI18N
        lblClientes1.setName(""); // NOI18N
        getContentPane().add(lblClientes1);
        lblClientes1.setBounds(800, 380, 300, 240);

        btnAlerta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        btnAlerta.setForeground(new java.awt.Color(255, 255, 51));
        btnAlerta.setIcon(new javax.swing.ImageIcon("C:\\Images\\notificacion.png")); // NOI18N
        btnAlerta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlerta.setPreferredSize(new java.awt.Dimension(65, 65));
        btnAlerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlerta);
        btnAlerta.setBounds(1080, 70, 100, 100);

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Images\\LogoEmpresa airesize.png")); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(-10, 140, 390, 280);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(370, 0, 910, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VistaClientes vistaClientes = new VistaClientes();
        vistaClientes.show();
        dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VistaProductos vistaProductos = new VistaProductos();
        vistaProductos.show();
        dispose();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        VistaPedidos vistaPedidos = new VistaPedidos();
        vistaPedidos.show();
        dispose();
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        VistaEmpleados vistaEmpleados = new VistaEmpleados();
        vistaEmpleados.show();
        dispose();
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnAlertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertaActionPerformed
        VistaProductosAlerta vistaProductosAlerta = new VistaProductosAlerta();
        vistaProductosAlerta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlertaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlerta;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblClientes1;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProductos;
    // End of variables declaration//GEN-END:variables
}
