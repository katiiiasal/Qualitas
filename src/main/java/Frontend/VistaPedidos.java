/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.ConexionBD;
import Backend.Pedido;
import Backend.PedidoDAO;
import Backend.Productos;
import Backend.ProductosDAO;
import Backend.Utilidades;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heiva
 */
public class VistaPedidos extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductos
     */
    public VistaPedidos() {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");

        DefaultTableModel model = (DefaultTableModel) tblPedidos.getModel();
        PedidoDAO pedidoDAO = new PedidoDAO();
        // Obtener todos los pedidos
        List<Pedido> pedidos = pedidoDAO.obtenerPedidos();
        System.out.println(pedidos);
        System.out.println("Todos los pedidos:");
        for (Pedido pedido : pedidos) {
            
            model.addRow(new Object[]{
                pedido.getIdPedido(),
                pedido.getIdCliente(),
                pedido.getFechaCreacion(),
                pedido.getFechaEnvio()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spHeadersTable = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblReturnToMenu = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - PEDIDOS");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductos"); // NOI18N
        getContentPane().setLayout(null);

        spHeadersTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tblPedidos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idPedido", "idCliente", "Fecha envio", "Fecha creacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spHeadersTable.setViewportView(tblPedidos);

        getContentPane().add(spHeadersTable);
        spHeadersTable.setBounds(142, 58, 1138, 662);

        btnMenu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btnMenu.setText("🏠");
        btnMenu.setPreferredSize(new java.awt.Dimension(65, 65));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(30, 540, 80, 70);

        btnCreate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnCreate.setText("➕");
        btnCreate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate);
        btnCreate.setBounds(6, 58, 130, 65);

        btnDelete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnDelete.setText("🗑️");
        btnDelete.setPreferredSize(new java.awt.Dimension(65, 65));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(6, 129, 130, 65);

        lblReturnToMenu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        lblReturnToMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnToMenu.setText("MENU");
        getContentPane().add(lblReturnToMenu);
        lblReturnToMenu.setBounds(10, 620, 120, 60);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("LISTA DE PEDIDOS");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(150, 10, 1120, 40);

        lblFoto.setIcon(new javax.swing.ImageIcon("C:\\Images\\Pedidos.png")); // NOI18N
        getContentPane().add(lblFoto);
        lblFoto.setBounds(-50, 280, 270, 120);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        VistaMenu vistaMenu = new VistaMenu();
        vistaMenu.show();
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        VistaPedidosCrear vistaPedidosCrear = new VistaPedidosCrear();
        vistaPedidosCrear.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de eliminar este pedido?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
                int selectedRow = tblPedidos.getSelectedRow();
        
                if(selectedRow != -1){
                    int idPedido = (int) tblPedidos.getValueAt(selectedRow, 0);
                    System.out.println(idPedido);
                    
                        PedidoDAO pedidoDAO = new PedidoDAO();
                        int id = pedidoDAO.eliminarPedido(idPedido);
                        if (id != 0){
                            JOptionPane.showMessageDialog(null, "Se elimino el pedido exitosmente.", "Qualitas - Pedido", JOptionPane.INFORMATION_MESSAGE);
                            VistaPedidos vistaPedidos = new VistaPedidos();
                            vistaPedidos.setVisible(true);
                            dispose();

                        }else{
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar el pedido", "Qualitas - Pedido", JOptionPane.ERROR_MESSAGE);

                        }

                }else{
                     JOptionPane.showMessageDialog(null, "Por favor selecciona un producto");
                }

            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
               //label.setText("None selected");
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblReturnToMenu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane spHeadersTable;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}
