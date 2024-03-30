/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.Clientes;
import Backend.ClientesDAO;
import Backend.ConexionBD;
import Backend.DetallePedido;
import Backend.DetallePedidoDAO;
import Backend.Pedido;
import Backend.PedidoDAO;
import Backend.Productos;
import Backend.ProductosDAO;
import Backend.Utilidades;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author heiva
 */
public class VistaPedidosCrear extends javax.swing.JFrame {
    
    List<DetallePedido> carrito;
    double total;
    int idPedidoGenerado;
    /**
     * Creates new form VistaProductosCrear
     */
    public VistaPedidosCrear() {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
        
        total = 0;
        idPedidoGenerado = generarIdAleatorio();
        lblIdGeneradoPedido.setText("PEDIDO #" + String.valueOf(idPedidoGenerado));
        
        this.carrito = new ArrayList<>(); 
        
        try {
            
            Connection conexion = ConexionBD.obtenerConexion();
            
            ProductosDAO productosDAO = new ProductosDAO(conexion);
            ClientesDAO clientesDAO = new ClientesDAO(conexion);
            
            // Obtener todos los productos
            List<Productos> productos = productosDAO.obtenerTodosProductos();
            List<Clientes> clientes = clientesDAO.obtenerTodosClientes();
            
            for (Clientes cliente : clientes) {
                cmbIdCliente.addItem(String.valueOf(cliente.getIdCliente()));
            }
            
            for (Productos producto : productos) {
                cmbIdProducto.addItem(String.valueOf(producto.getIdProducto()));
            }
            
            cmbIdCliente.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        try {
                            String id = (String) cmbIdCliente.getSelectedItem();
                            System.out.println(id);
                            Clientes cliente = clientesDAO.obtenerCliente(Integer.valueOf(id));
                            txtfNombreCliente.setText(cliente.getNombre() + " " + cliente.getApellidoPaterno());
                        } catch (SQLException ex) {
                            Logger.getLogger(VistaPedidosCrear.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });

            cmbIdProducto.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        try {
                            String id = (String) cmbIdProducto.getSelectedItem();
                            System.out.println(id);
                            Productos producto = productosDAO.obtenerProducto(Integer.valueOf(id));
                            txtfNombreProducto.setText(producto.getNombre());
                            txtfDescripcion.setText(producto.getDescripcion());
                            txtfPrecio.setText(String.valueOf(producto.getPrecio()));
                        } catch (SQLException ex) {
                            Logger.getLogger(VistaPedidosCrear.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
            
            
            /*
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
            */
            
            //conexion.close();
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

        lblIdGeneradoPedido = new javax.swing.JLabel();
        txtfTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        idCliente = new javax.swing.JLabel();
        idProducto = new javax.swing.JLabel();
        cmbIdProducto = new javax.swing.JComboBox<>();
        txtfNombreProducto = new javax.swing.JTextField();
        txtfNombreCliente = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        cmbIdCliente = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        lblBackground = new javax.swing.JLabel();
        txtfPrecio = new javax.swing.JTextField();
        txtfDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - CREAR PEDIDOS");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblIdGeneradoPedido.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        lblIdGeneradoPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdGeneradoPedido.setText("PEDIDO");
        lblIdGeneradoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblIdGeneradoPedido);
        lblIdGeneradoPedido.setBounds(60, 610, 470, 40);

        txtfTotal.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfTotal.setText("0.0");
        txtfTotal.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfTotal.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfTotal);
        txtfTotal.setBounds(780, 610, 230, 40);

        lblTotal.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("TOTAL : ");
        lblTotal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblTotal);
        lblTotal.setBounds(680, 610, 96, 40);

        lblCantidad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidad.setText("Cantidad");
        lblCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCantidad);
        lblCantidad.setBounds(950, 70, 100, 32);

        idCliente.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        idCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idCliente.setText("idCliente");
        idCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(idCliente);
        idCliente.setBounds(320, 70, 96, 32);

        idProducto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        idProducto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idProducto.setText("idProducto");
        idProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(idProducto);
        idProducto.setBounds(670, 70, 130, 32);

        cmbIdProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(cmbIdProducto);
        cmbIdProducto.setBounds(600, 110, 80, 40);

        txtfNombreProducto.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombreProducto.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombreProducto.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombreProducto);
        txtfNombreProducto.setBounds(680, 110, 250, 40);

        txtfNombreCliente.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombreCliente.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombreCliente.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombreCliente);
        txtfNombreCliente.setBounds(320, 110, 250, 40);

        btnCrear.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnCrear.setText("CREAR");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear);
        btnCrear.setBounds(1040, 610, 141, 55);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PEDIDO");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(960, 0, 320, 90);

        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        btnRegresar.setText("🔙");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(60, 20, 180, 80);

        cmbIdCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(cmbIdCliente);
        cmbIdCliente.setBounds(240, 110, 80, 40);
        getContentPane().add(spnCantidad);
        spnCantidad.setBounds(950, 110, 110, 40);

        btnAdd.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        btnAdd.setText("➕");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setIconTextGap(0);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(1110, 100, 70, 60);

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Nombre", "Descripcion", "Precio", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarrito);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 1120, 440);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        txtfPrecio.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfPrecio.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfPrecio.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfPrecio);
        txtfPrecio.setBounds(280, 10, 250, 40);

        txtfDescripcion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfDescripcion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfDescripcion.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfDescripcion);
        txtfDescripcion.setBounds(280, 10, 250, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public  int generarIdAleatorio() {
        Random rand = new Random();
        int numero = rand.nextInt(9000000) + 1000000; // Genera un número aleatorio entre 1000000 y 9999999
        return numero;
    }
    
    
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        int idCliente =  Integer.valueOf((String) cmbIdCliente.getSelectedItem());
        int idProducto = Integer.valueOf((String) cmbIdProducto.getSelectedItem());
        int cantidad = (int) spnCantidad.getValue();
        
         Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        // Formatear la fecha de hoy
        String fechaFormateada = formato.format(fechaActual);
        
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de crear este pedido?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
                PedidoDAO pedidoDAO = new PedidoDAO();
                
                Pedido pedido = new Pedido(this.idPedidoGenerado, idCliente, fechaFormateada);
                pedidoDAO.insertarPedido(pedido);
                
                DetallePedidoDAO detallePedidoDAO = new DetallePedidoDAO();
                
                for(DetallePedido carrito : this.carrito){
                    try {
                        detallePedidoDAO.insertarDetallePedido(carrito);
                    } catch (SQLException ex) {
                        Logger.getLogger(VistaPedidosCrear.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Se creo el pedido (#" + this.idPedidoGenerado + ") exitosmente.", "Qualitas - Pedido", JOptionPane.INFORMATION_MESSAGE);
                
                VistaPedidos vistaPedidos = new VistaPedidos();
                vistaPedidos.setVisible(true);
                dispose();
                
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
                 VistaPedidos vistaPedidos = new VistaPedidos();
                 vistaPedidos.show();
                 dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblCarrito.getModel();
        model.setRowCount(0);
        
        int idCliente =  Integer.valueOf((String) cmbIdCliente.getSelectedItem());
        int idProducto = Integer.valueOf((String) cmbIdProducto.getSelectedItem());
        int cantidad = (int) spnCantidad.getValue();
        
        DetallePedido detallePedido = new DetallePedido( this.idPedidoGenerado,  idProducto,  cantidad);
        detallePedido.setNombre(txtfNombreProducto.getText());
        detallePedido.setDescripcion(txtfDescripcion.getText());
        detallePedido.setPrecio(Double.parseDouble(txtfPrecio.getText()));
        System.out.println(detallePedido);
        
        this.carrito.add(detallePedido);
        System.out.println(this.carrito);
        
        this.total = 0;

        for (DetallePedido carrito : this.carrito) {
                double subtotal = carrito.getPrecio() * carrito.getCantidad();
                
                model.addRow(new Object[]{
                    carrito.getIdProducto(),
                    carrito.getNombre(),
                    carrito.getDescripcion(),
                    carrito.getPrecio(),
                    carrito.getCantidad(),
                    subtotal
                });
                this.total += subtotal;
        }
        txtfTotal.setText(Double.toString(this.total));
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPedidosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPedidosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPedidosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPedidosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaPedidosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbIdCliente;
    private javax.swing.JComboBox<String> cmbIdProducto;
    private javax.swing.JLabel idCliente;
    private javax.swing.JLabel idProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIdGeneradoPedido;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTextField txtfDescripcion;
    private javax.swing.JTextField txtfNombreCliente;
    private javax.swing.JTextField txtfNombreProducto;
    private javax.swing.JTextField txtfPrecio;
    private javax.swing.JTextField txtfTotal;
    // End of variables declaration//GEN-END:variables
}
