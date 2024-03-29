/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.ConexionBD;
import Backend.Productos;
import Backend.ProductosDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heiva
 */
public class VistaProductos extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductos
     */
    public VistaProductos() {
        initComponents();

        try {
            DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
             
            Connection conexion = ConexionBD.obtenerConexion();
            ProductosDAO productosDAO = new ProductosDAO(conexion);
            
            // Obtener todos los productos
            List<Productos> todosProductos = productosDAO.obtenerTodosProductos();
            System.out.println("Todos los productos:");
            for (Productos product : todosProductos) {
                
                model.addRow(new Object[]{
                    product.getIdProducto(),
                    product.getNombre(),
                    product.getDescripcion(),
                    product.getNumeroLote(),
                    product.getFechaProduccion(),
                    product.getFechaExpiracion(),
                    product.estaPorExpirar(),
                    product.getPrecio(),
                });
            }
            
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
        tblProductos = new javax.swing.JTable();
        btnMenu = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblReturnToMenu = new javax.swing.JLabel();
        btnAlerta = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - PRODUCTOS");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductos"); // NOI18N
        getContentPane().setLayout(null);

        spHeadersTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tblProductos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Nombre", "Descripcion", "Lote", "Fecha produccion", "Fecha Expiracion", "Alerta Expiracion", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProductos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblProductosComponentShown(evt);
            }
        });
        spHeadersTable.setViewportView(tblProductos);

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

        btnUpdate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnUpdate.setText("🖊️");
        btnUpdate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(0, 129, 65, 65);

        btnCreate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnCreate.setText("➕");
        btnCreate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate);
        btnCreate.setBounds(0, 58, 136, 65);

        btnDelete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnDelete.setText("🗑️");
        btnDelete.setPreferredSize(new java.awt.Dimension(65, 65));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(70, 130, 65, 65);

        lblReturnToMenu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        lblReturnToMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReturnToMenu.setText("MENU");
        getContentPane().add(lblReturnToMenu);
        lblReturnToMenu.setBounds(10, 620, 120, 60);

        btnAlerta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnAlerta.setText("🔔");
        btnAlerta.setPreferredSize(new java.awt.Dimension(65, 65));
        btnAlerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlerta);
        btnAlerta.setBounds(40, 260, 65, 65);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("LISTA DE PRODUCTOS");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(150, 10, 1120, 40);

        lblFoto.setIcon(new javax.swing.ImageIcon("C:\\Images\\Productos.png")); // NOI18N
        getContentPane().add(lblFoto);
        lblFoto.setBounds(-50, 370, 270, 120);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        int selectedRow = tblProductos.getSelectedRow();
        
        if(selectedRow != -1){
            int idProducto = (int) tblProductos.getValueAt(selectedRow, 0);
            System.out.println(idProducto);
            VistaProductosActualizar vistaProductosActualizar = new VistaProductosActualizar(idProducto);
            vistaProductosActualizar.setVisible(true);
            dispose();
        }else{
             JOptionPane.showMessageDialog(null, "Por favor selecciona un producto");
        }

 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        VistaMenu vistaMenu = new VistaMenu();
        vistaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        VistaProductosCrear vistaProductosCrear = new VistaProductosCrear();
        vistaProductosCrear.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de eliminar este producto?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
                int selectedRow = tblProductos.getSelectedRow();
        
                if(selectedRow != -1){
                    int idProducto = (int) tblProductos.getValueAt(selectedRow, 0);
                    System.out.println(idProducto);
                    Connection conexion;
        
                    try {
                        conexion = ConexionBD.obtenerConexion();


                        ProductosDAO productosDAO = new ProductosDAO(conexion);
                        int id = productosDAO.eliminarProducto(idProducto);
                        if (id != 0){
                            JOptionPane.showMessageDialog(null, "Se elimino el producto exitosmente.", "Qualitas - Producto", JOptionPane.INFORMATION_MESSAGE);
                            VistaProductos vistaProductos = new VistaProductos();
                            vistaProductos.setVisible(true);
                            dispose();

                        }else{
                            JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto", "Qualitas - Producto", JOptionPane.ERROR_MESSAGE);

                        }


                    } catch (SQLException ex) {
                        System.out.println("Error al eliminar el producto");    
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

    private void tblProductosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblProductosComponentShown

    }//GEN-LAST:event_tblProductosComponentShown

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
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlerta;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblReturnToMenu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane spHeadersTable;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
