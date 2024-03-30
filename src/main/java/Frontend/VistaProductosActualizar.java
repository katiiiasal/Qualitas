
package Frontend;

import Backend.ConexionBD;
import Backend.Productos;
import Backend.ProductosDAO;
import Backend.Utilidades;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class VistaProductosActualizar extends javax.swing.JFrame {
    
    // Atributos 
    private int idProducto;

    // Getters and Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
    public VistaProductosActualizar() {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
    }
    
    public VistaProductosActualizar(int idProducto) {
        initComponents(); 
        
        Utilidades.cargarLogo(this, "logo.png");
        this.idProducto = idProducto;
        
        Connection conexion;
        
        try {
            conexion = ConexionBD.obtenerConexion();
                
            
            ProductosDAO productosDAO = new ProductosDAO(conexion);
            Productos producto = productosDAO.obtenerProducto(idProducto);
            
            txtfidProducto.setText(Integer.toString(idProducto));
            txtfNombre.setText(producto.getNombre());
            txtfDescripcion.setText(producto.getDescripcion());
            txtfnumeroLote.setText(Integer.toString( producto.getNumeroLote()));
            txtffechaProduccion.setText(producto.getFechaProduccion());
            txtffechaExpiracion.setText(producto.getFechaExpiracion());
            txtfPrecio.setText(Double.toString(producto.getPrecio()));
            
            
        } catch (SQLException ex) {
            System.out.println("Error al cargar datos");    
        }
        
        List<JTextField> campos;
        campos = new ArrayList<>();
        
        campos.add(txtfNombre);
        campos.add(txtfDescripcion);
        campos.add(txtfnumeroLote);
        campos.add(txtffechaProduccion);
        campos.add(txtffechaExpiracion);
        campos.add(txtfPrecio);

        // Agregar oyente de foco a cada JTextField
        for (JTextField campo : campos) {
            campo.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    validarCampoVacio(campo, false, false);
                    campo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }
                @Override
                public void focusGained(FocusEvent e) {
                    campo.setForeground(Utilidades.VERDE);
                    campo.setBorder(BorderFactory.createLineBorder(Utilidades.AZUL, 5));
                    if (campo.getText().isEmpty() ||
                        campo.getText().equals("El campo es obligatorio")) {
                        campo.setText("");
                    }
                }
            });
        }
       
        
    }

    public boolean validarCampoVacio(JTextField campo, boolean esFecha, boolean esNumerico) {
        boolean valido = false;
        String FORMATO_FECHA = "\\d{4}-\\d{2}-\\d{2}";
        
        String textoCampo = campo.getText().trim();
        if (textoCampo.isEmpty() || textoCampo.equals("El campo es obligatorio")) {
            campo.setForeground(Utilidades.ROJO);
            campo.setText("El campo es obligatorio");
            valido = false;
        }
        else{
            campo.setForeground(Utilidades.VERDE);
            valido = true;
        }
        
        // Si el campo es una fecha
        if(esFecha){
            Pattern pattern = Pattern.compile(FORMATO_FECHA);
            Matcher matcher = pattern.matcher(textoCampo);
           
            String regex = "^(20[1-9][5-9]|[2-9][0-9]{3})-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]|(0[1-9]|1\\d|2[0-8]))|((20[1-9][5-9]|[2-9][0-9]{3})(0[48]|[2468][048]|[13579][26])-02-29|((20[1-9][5-9]|[2-9][0-9]{3})-02-(0[1-9]|1\\d|2[0-8])))$";
            
            // Si no es un formato de fecha pone el borde en rojo
            if(!matcher.matches()){
                campo.setBorder(BorderFactory.createLineBorder(Utilidades.ROJO));
                valido = false;
            }else{
                
                // Si es un formato de fecha valido, validara si la fecha es una fecha valida
                if(Pattern.matches(regex, textoCampo)){
                   campo.setBorder(BorderFactory.createLineBorder(Utilidades.AZUL));
                   valido = true;
                }else{
                    campo.setBorder(BorderFactory.createLineBorder(Utilidades.ROJO));
                    valido = false;
                }
                
            }
        }
        
        // Si el campo debe ser numerico
        if(esNumerico){
            try {
                Double.parseDouble(textoCampo);
                // Si la conversión es exitosa, el contenido es numérico
                campo.setBorder(BorderFactory.createLineBorder(Utilidades.AZUL));
                valido = true;
            } catch (NumberFormatException ex) {
                // Si ocurre una excepción, el contenido no es numérico
                campo.setBorder(BorderFactory.createLineBorder(Utilidades.ROJO));
                valido = false;
            }
        }
        return valido;
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
        txtfidProducto = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtfNombre = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtfDescripcion = new javax.swing.JTextField();
        lblnumeroLote = new javax.swing.JLabel();
        txtfnumeroLote = new javax.swing.JTextField();
        lblfechaProduccion = new javax.swing.JLabel();
        txtffechaProduccion = new javax.swing.JTextField();
        lblfechaExpiracion = new javax.swing.JLabel();
        txtffechaExpiracion = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtfPrecio = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - ACTUALIZAR PRODUCTO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        getContentPane().setLayout(null);

        lblidProducto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblidProducto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblidProducto.setText("idProducto");
        lblidProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblidProducto);
        lblidProducto.setBounds(520, 90, 122, 32);

        txtfidProducto.setEditable(false);
        txtfidProducto.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfidProducto.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfidProducto);
        txtfidProducto.setBounds(520, 120, 690, 40);

        btnActualizar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(130, 480, 243, 55);

        lblProductos.setIcon(new javax.swing.ImageIcon("C:\\Images\\Productos.png")); // NOI18N
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
        btnRegresar.setBounds(60, 20, 170, 80);

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(520, 170, 90, 32);

        txtfNombre.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombre.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombre.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfNombreFocusLost(evt);
            }
        });
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(520, 210, 690, 40);

        lblDescripcion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripción");
        lblDescripcion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblDescripcion);
        lblDescripcion.setBounds(520, 260, 128, 32);

        txtfDescripcion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfDescripcion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfDescripcion.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfDescripcion);
        txtfDescripcion.setBounds(520, 300, 690, 38);

        lblnumeroLote.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblnumeroLote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblnumeroLote.setText("Número de lote (solo números)");
        lblnumeroLote.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblnumeroLote);
        lblnumeroLote.setBounds(520, 350, 380, 32);

        txtfnumeroLote.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfnumeroLote.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfnumeroLote.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfnumeroLote);
        txtfnumeroLote.setBounds(520, 380, 690, 40);

        lblfechaProduccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblfechaProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfechaProduccion.setText("Fecha de produccion (YYYY-MM-DD)");
        lblfechaProduccion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblfechaProduccion);
        lblfechaProduccion.setBounds(520, 430, 430, 32);

        txtffechaProduccion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtffechaProduccion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtffechaProduccion.setPreferredSize(new java.awt.Dimension(65, 40));
        txtffechaProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtffechaProduccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtffechaProduccion);
        txtffechaProduccion.setBounds(520, 460, 690, 40);

        lblfechaExpiracion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblfechaExpiracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblfechaExpiracion.setText("Fecha de expiracion (YYYY-MM-DD)");
        lblfechaExpiracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblfechaExpiracion);
        lblfechaExpiracion.setBounds(520, 520, 430, 32);

        txtffechaExpiracion.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtffechaExpiracion.setMinimumSize(new java.awt.Dimension(65, 40));
        txtffechaExpiracion.setPreferredSize(new java.awt.Dimension(65, 40));
        txtffechaExpiracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtffechaExpiracionActionPerformed(evt);
            }
        });
        getContentPane().add(txtffechaExpiracion);
        txtffechaExpiracion.setBounds(520, 550, 690, 40);

        lblPrecio.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Precio");
        lblPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblPrecio);
        lblPrecio.setBounds(520, 610, 68, 32);

        txtfPrecio.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfPrecio.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfPrecio.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfPrecioFocusLost(evt);
            }
        });
        getContentPane().add(txtfPrecio);
        txtfPrecio.setBounds(520, 640, 690, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
                 VistaProductos vistaProductos = new VistaProductos();
                 vistaProductos.show();
                 dispose();      
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         
        String nombre = txtfNombre.getText();
        System.out.println(nombre);
        String descripcion = txtfDescripcion.getText();
        System.out.println(descripcion);
        int numeroLote = Integer.valueOf(txtfnumeroLote.getText());
        System.out.println(numeroLote);
        String fechaProduccion = txtffechaProduccion.getText();
        System.out.println(fechaProduccion);
        String fechaExpiracion = txtffechaExpiracion.getText();
        System.out.println(fechaExpiracion);
        double precio = Double.parseDouble(txtfPrecio.getText());
        System.out.println(precio);
        
        
        
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de actualizar este producto?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
                
               
            Connection conexion;
            
            try {
                conexion = ConexionBD.obtenerConexion();
                 Productos producto = new Productos(nombre, descripcion, numeroLote, fechaProduccion, fechaExpiracion, precio);
                producto.estaPorExpirar();
                
                ProductosDAO productosDAO = new ProductosDAO(conexion);
                int id = productosDAO.actualizarProducto(producto, this.getIdProducto());
                if (id != 0){
                    JOptionPane.showMessageDialog(null, "Se actualizo producto(" + nombre + ") exitosmente.", "Qualitas - Producto", JOptionPane.INFORMATION_MESSAGE);
                    VistaProductos vistaProductos = new VistaProductos();
                    vistaProductos.setVisible(true);
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "No se actualizo producto(" + nombre + ") ", "Qualitas - Producto", JOptionPane.ERROR_MESSAGE);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(VistaProductosCrear.class.getName()).log(Level.SEVERE, null, ex);
            }
                

            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
               
            }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfNombreFocusGained

    }//GEN-LAST:event_txtfNombreFocusGained

    private void txtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfNombreFocusLost

    }//GEN-LAST:event_txtfNombreFocusLost

    private void txtffechaProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtffechaProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtffechaProduccionActionPerformed

    private void txtffechaExpiracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtffechaExpiracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtffechaExpiracionActionPerformed

    private void txtfPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfPrecioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPrecioFocusGained

    private void txtfPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfPrecioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPrecioFocusLost

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
            java.util.logging.Logger.getLogger(VistaProductosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductosActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfechaExpiracion;
    private javax.swing.JLabel lblfechaProduccion;
    private javax.swing.JLabel lblidProducto;
    private javax.swing.JLabel lblnumeroLote;
    private javax.swing.JTextField txtfDescripcion;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfPrecio;
    private javax.swing.JTextField txtffechaExpiracion;
    private javax.swing.JTextField txtffechaProduccion;
    private javax.swing.JTextField txtfidProducto;
    private javax.swing.JTextField txtfnumeroLote;
    // End of variables declaration//GEN-END:variables
}
