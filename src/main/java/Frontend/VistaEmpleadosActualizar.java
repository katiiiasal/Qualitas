/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;


import Backend.Empleado;
import Backend.EmpleadoDAO;
import Backend.Utilidades;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author heiva
 */
public class VistaEmpleadosActualizar extends javax.swing.JFrame {

    // Atributos 
    private int idEmpleado;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    /**
     * Creates new form VistaProductosCrear
     */
    public VistaEmpleadosActualizar() {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
        Utilidades.convertComponentsToUpperCase(this);
    }

    public VistaEmpleadosActualizar(int idEmpleado) {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
        Utilidades.convertComponentsToUpperCase(this);
        
        this.idEmpleado = idEmpleado;
        
        EmpleadoDAO empleadoDAO =new EmpleadoDAO();
        Empleado empleado = empleadoDAO.obtenerEmpleado(idEmpleado);
        
       txtfidEmpleado.setText(String.valueOf(empleado.getIdEmpleado()) );
       txtfNombre.setText(empleado.getNombre());
       txtfApellidoPaterno.setText(empleado.getApellidoPaterno());
       txtfApellidoMaterno.setText(empleado.getApellidoMaterno());
       txtfEmail.setText(empleado.getEmail());
       txtpPassword.setText(empleado.getPassword());
       txtfTelefono.setText(empleado.getTelefono());
       
        List<JTextField> campos;
        campos = new ArrayList<>();
        
        campos.add(txtfNombre);
        campos.add(txtfApellidoPaterno);
        campos.add(txtfApellidoMaterno);
        campos.add(txtfEmail);
        campos.add(txtfTelefono);

        for (JTextField campo : campos) {
            campo.addFocusListener(new FocusAdapter() {
                @Override
                public void focusLost(FocusEvent e) {
                    validarCampoVacio(campo, false, false);
                    campo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

                    if (campo.getText().isEmpty() ||
                        campo.getText().equals("El campo es obligatorio")) {
                        campo.setBorder(BorderFactory.createLineBorder(Utilidades.ROJO, 5));
                    }

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
        
        txtfNombre.setNextFocusableComponent(txtfApellidoPaterno);
        txtfApellidoPaterno.setNextFocusableComponent(txtfApellidoMaterno);
        txtfApellidoMaterno.setNextFocusableComponent(txtfEmail);
        txtfEmail.setNextFocusableComponent(txtpPassword);
        txtpPassword.setNextFocusableComponent(txtfTelefono);
        txtfTelefono.setNextFocusableComponent(btnActualizar);
        btnActualizar.setNextFocusableComponent(txtfNombre);
        
        Utilidades.limitarCaracteres(txtfNombre, 20, "letras");
        Utilidades.limitarCaracteres(txtfApellidoPaterno, 20, "letras");
        Utilidades.limitarCaracteres(txtfApellidoMaterno, 20, "letras");
        Utilidades.limitarCaracteres(txtfTelefono, 10, "numeros");
       
    
    }
    
    public boolean validarCampoVacio(JTextField campo, boolean esFecha, boolean esNumerico) {
        boolean valido = false;
        String FORMATO_FECHA = "\\d{4}-\\d{2}-\\d{2}";
        
        String textoCampo = campo.getText().trim();
        if (textoCampo.isEmpty() || textoCampo.equals("El campo es obligatorio")) {
            campo.setForeground(Utilidades.ROJO);
            //campo.setText("El campo es obligatorio");
            valido = false;
        }
        else{
            campo.setForeground(Utilidades.AZUL);
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
                   campo.setBorder(BorderFactory.createLineBorder(Utilidades.VERDE));
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
                campo.setBorder(BorderFactory.createLineBorder(Utilidades.VERDE));
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
        lblPassword = new javax.swing.JLabel();
        txtpPassword = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JButton();
        lblTelefono = new javax.swing.JLabel();
        txtfTelefono = new javax.swing.JTextField();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - ACTUALIZAR EMPLEADOS");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        getContentPane().setLayout(null);

        lblidEmpleado.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblidEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblidEmpleado.setText("idEmpleado");
        lblidEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblidEmpleado);
        lblidEmpleado.setBounds(460, 20, 430, 30);

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(460, 120, 380, 30);

        lblApellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidoPaterno.setText("Apellido Paterno");
        lblApellidoPaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(460, 200, 480, 30);

        lblApellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidoMaterno.setText("Apellido Materno");
        lblApellidoMaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(460, 290, 500, 30);

        lblEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblEmail);
        lblEmail.setBounds(460, 370, 350, 30);

        txtfidEmpleado.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfidEmpleado.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfidEmpleado);
        txtfidEmpleado.setBounds(460, 60, 690, 40);

        txtfNombre.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombre.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombre.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(460, 150, 690, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoPaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoPaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(460, 240, 690, 40);

        txtfApellidoMaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoMaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoMaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(460, 320, 690, 40);

        txtfEmail.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfEmail.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfEmail.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEmail);
        txtfEmail.setBounds(460, 400, 690, 40);

        btnActualizar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(100, 500, 243, 55);

        lblProductos.setIcon(new javax.swing.ImageIcon("C:\\Images\\Empleados.png")); // NOI18N
        getContentPane().add(lblProductos);
        lblProductos.setBounds(90, 190, 280, 260);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EMPLEADOS");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(60, 130, 320, 90);

        lblPassword.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Contraseña");
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblPassword);
        lblPassword.setBounds(460, 470, 420, 30);

        txtpPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtpPassword.setText("jPasswordField1");
        getContentPane().add(txtpPassword);
        txtpPassword.setBounds(460, 500, 690, 40);

        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Images\\regresar.png")); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(0, 0, 90, 80);

        lblTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTelefono.setText("Telefono");
        lblTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(460, 560, 650, 30);

        txtfTelefono.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfTelefono.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(460, 590, 690, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEmailActionPerformed

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
        
        String telefono =txtfTelefono.getText();
        System.out.println(telefono);
       
        
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de actualizar este empleado?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
                
                Empleado empleado = new Empleado(nombre, apellidoPaterno, apellidoMaterno, email, password, "empleado", telefono);
                
                EmpleadoDAO empleadoDAO =new EmpleadoDAO ();
                int id = empleadoDAO.actualizarEmpleado(empleado, this.getIdEmpleado());
                if (id != 0){
                    JOptionPane.showMessageDialog(null, "Se actualizo empleado(" + nombre + ") exitosamente.", "Qualitas - Empleado", JOptionPane.INFORMATION_MESSAGE);
                    VistaEmpleados vistaEmpleados = new VistaEmpleados();
                    vistaEmpleados.setVisible(true);
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "No se actualizo empleado(" + nombre + ") ", "Qualitas - Empleado", JOptionPane.ERROR_MESSAGE);
                    
                }
 
            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
               
            }

        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VistaEmpleados vistaEmpleados = new VistaEmpleados();
        vistaEmpleados.setVisible(true);
        dispose();
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
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblidEmpleado;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfTelefono;
    private javax.swing.JTextField txtfidEmpleado;
    private javax.swing.JPasswordField txtpPassword;
    // End of variables declaration//GEN-END:variables
}
