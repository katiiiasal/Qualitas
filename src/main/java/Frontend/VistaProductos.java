/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.ConexionBD;
import Backend.Productos;
import Backend.ProductosDAO;
import Backend.Utilidades;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
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
        Utilidades.cargarLogo(this, "logo.png");
        Utilidades.convertComponentsToUpperCase(this);

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
        
        tblProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                int expiracionValue = (int) table.getModel().getValueAt(row, 6);

                switch (expiracionValue) {
                    case 0 -> component.setBackground(Utilidades.VERDE);
                    case 1 -> component.setBackground(Utilidades.NARANJA);
                    case 2 -> component.setBackground(Utilidades.ROJO);
                    default -> component.setBackground(Utilidades.AZUL);
                }

                return component;
            }
        });
        

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        tblProductos.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODCUTO", "NOMBRE", "DESCRIPCIÓN", "LOTE", "PRODUCCIÓN", "EXPIRACIÓN", "ALERTA EXPIRACIÓN", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
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

        jLabel1.setBackground(new java.awt.Color(248, 137, 32));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 137, 32));
        jLabel1.setText("POR CADUCAR 🟥");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1040, 20, 100, 30);

        jLabel2.setBackground(new java.awt.Color(203, 33, 41));
        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(203, 33, 41));
        jLabel2.setText("CADUCADO 🟥");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1160, 20, 100, 30);

        jLabel3.setBackground(new java.awt.Color(20, 110, 56));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 110, 56));
        jLabel3.setText("NO CADUCADO 🟥");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(910, 20, 140, 30);

        btnMenu.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon("C:\\Images\\menu.png")); // NOI18N
        btnMenu.setPreferredSize(new java.awt.Dimension(65, 65));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(30, 540, 80, 70);

        btnUpdate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Images\\actualizar.png")); // NOI18N
        btnUpdate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(0, 129, 65, 65);

        btnCreate.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon("C:\\Images\\crear.png")); // NOI18N
        btnCreate.setPreferredSize(new java.awt.Dimension(65, 65));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate);
        btnCreate.setBounds(0, 58, 136, 65);

        btnDelete.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Images\\borrar.png")); // NOI18N
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
        btnAlerta.setIcon(new javax.swing.ImageIcon("C:\\Images\\notificacion.png")); // NOI18N
        btnAlerta.setPreferredSize(new java.awt.Dimension(65, 65));
        btnAlerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlerta);
        btnAlerta.setBounds(20, 240, 90, 90);

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
                            JOptionPane.showMessageDialog(null, "Se elimino el producto exitosamente.", "Qualitas - Producto", JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblReturnToMenu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane spHeadersTable;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
