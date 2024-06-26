/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import Backend.Clientes;
import Backend.ClientesDAO;
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

/**
 *
 * @author heiva
 */
public class VistaClientesActualizar extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductosCrear
     */
    // Atributos
    private int idCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    public VistaClientesActualizar(){
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
        Utilidades.convertComponentsToUpperCase(this);
    }
    
    public VistaClientesActualizar(int idCliente) {
        initComponents();
        Utilidades.cargarLogo(this, "logo.png");
        Utilidades.convertComponentsToUpperCase(this);
        this.setIdCliente(idCliente);
        
        List<JTextField> campos;
        campos = new ArrayList<>();
        
        campos.add(txtfNombre);
        campos.add(txtfApellidoPaterno);
        campos.add(txtfApellidoMaterno);
        campos.add(txtfEmail);
        campos.add(txtfTelefono);
        campos.add(txtfCalle);
        campos.add(txtfNumeroInterior);
        campos.add(txtfCodigoPostal);
        campos.add(txtfColonia);
        campos.add(txtfCiudad);
        campos.add(txtfEstado);

        // Agregar oyente de foco a cada JTextField
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
        
         Connection conexion;
        
        try {
            conexion = ConexionBD.obtenerConexion();
            
            ClientesDAO clientesDAO = new ClientesDAO(conexion);
            Clientes cliente = clientesDAO.obtenerCliente(idCliente);
            
            txtfNombre.setText(cliente.getNombre());
            txtfApellidoPaterno.setText(cliente.getApellidoPaterno());
            txtfApellidoMaterno.setText(cliente.getApellidoMaterno());
            txtfEmail.setText(cliente.getEmail());
            txtfTelefono.setText(cliente.getTelefono());
            txtfCalle.setText(cliente.getCalle());
            txtfNumeroInterior.setText(cliente.getNumero());
            txtfCodigoPostal.setText(cliente.getCodigoPostal());
            txtfColonia.setText(cliente.getColonia());
            txtfCiudad.setText(cliente.getCiudad());
            txtfEstado.setText(cliente.getEstado());
            
        } catch (SQLException ex) {
            System.out.println("Error al cargar datos");    
        }
        
        txtfNombre.setNextFocusableComponent(txtfApellidoPaterno);
        txtfApellidoPaterno.setNextFocusableComponent(txtfApellidoMaterno);
        txtfApellidoMaterno.setNextFocusableComponent(txtfEmail);
        txtfEmail.setNextFocusableComponent(txtfTelefono);
        txtfTelefono.setNextFocusableComponent(txtfCalle);
        txtfCalle.setNextFocusableComponent(txtfNumeroInterior);
        txtfNumeroInterior.setNextFocusableComponent(txtfCodigoPostal);
        txtfCodigoPostal.setNextFocusableComponent(txtfColonia);
        txtfColonia.setNextFocusableComponent(txtfCiudad);
        txtfCiudad.setNextFocusableComponent(txtfEstado);
        txtfEstado.setNextFocusableComponent(btnActualizar);
        btnActualizar.setNextFocusableComponent(btnRegresar);
        
        Utilidades.limitarCaracteres(txtfNombre, 20, "letras");
        Utilidades.limitarCaracteres(txtfApellidoPaterno, 20, "letras");
        Utilidades.limitarCaracteres(txtfApellidoMaterno, 20, "letras");
        Utilidades.limitarCaracteres(txtfTelefono, 10, "numeros");
        Utilidades.limitarCaracteres(txtfCalle, 20, "letras");
        Utilidades.limitarCaracteres(txtfNumeroInterior, 5, "numeros");
        Utilidades.limitarCaracteres(txtfCodigoPostal, 5, "numeros");
        Utilidades.limitarCaracteres(txtfColonia, 20, "letras");
        Utilidades.limitarCaracteres(txtfCiudad, 20, "letras");
        Utilidades.limitarCaracteres(txtfEstado, 20, "letras");
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfNombre = new javax.swing.JTextField();
        txtfApellidoPaterno = new javax.swing.JTextField();
        txtfApellidoMaterno = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtfCalle = new javax.swing.JTextField();
        txtfNumeroInterior = new javax.swing.JTextField();
        txtfCodigoPostal = new javax.swing.JTextField();
        txtfColonia = new javax.swing.JTextField();
        txtfCiudad = new javax.swing.JTextField();
        txtfEstado = new javax.swing.JTextField();
        txtfEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblNumeroInterior = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblCodigoPostal = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUALITAS - ACTUALIZAR CLIENTES");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("jfVistaProductoActualizar"); // NOI18N
        getContentPane().setLayout(null);

        txtfNombre.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNombre.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNombre.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(140, 170, 450, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoPaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoPaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(140, 260, 450, 38);

        txtfApellidoMaterno.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfApellidoMaterno.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfApellidoMaterno.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(140, 350, 450, 40);

        txtfTelefono.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfTelefono.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfTelefono.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(140, 520, 450, 40);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(203, 33, 41));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CLIENTES");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(890, 30, 320, 90);

        btnRegresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Images\\regresar.png")); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(0, 0, 90, 80);

        btnActualizar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(20, 110, 56));
        btnActualizar.setIcon(new javax.swing.ImageIcon("C:\\Images\\actualizar.png")); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(140, 620, 450, 40);

        txtfCalle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfCalle.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfCalle);
        txtfCalle.setBounds(640, 170, 450, 40);

        txtfNumeroInterior.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfNumeroInterior.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfNumeroInterior.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfNumeroInterior);
        txtfNumeroInterior.setBounds(640, 260, 450, 40);

        txtfCodigoPostal.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfCodigoPostal.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfCodigoPostal.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfCodigoPostal);
        txtfCodigoPostal.setBounds(640, 350, 450, 38);

        txtfColonia.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfColonia.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfColonia.setPreferredSize(new java.awt.Dimension(65, 40));
        getContentPane().add(txtfColonia);
        txtfColonia.setBounds(640, 430, 450, 40);

        txtfCiudad.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfCiudad.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfCiudad.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfCiudadActionPerformed(evt);
            }
        });
        getContentPane().add(txtfCiudad);
        txtfCiudad.setBounds(640, 520, 450, 40);

        txtfEstado.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfEstado.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfEstado.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEstado);
        txtfEstado.setBounds(640, 620, 450, 40);

        txtfEmail.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        txtfEmail.setMinimumSize(new java.awt.Dimension(65, 40));
        txtfEmail.setPreferredSize(new java.awt.Dimension(65, 40));
        txtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtfEmail);
        txtfEmail.setBounds(140, 430, 450, 40);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 100));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(610, 0, 30, 720);

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(40, 101, 145));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNombre);
        lblNombre.setBounds(140, 140, 290, 32);

        lblCalle.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCalle.setForeground(new java.awt.Color(40, 101, 145));
        lblCalle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCalle.setText("Calle");
        lblCalle.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCalle);
        lblCalle.setBounds(640, 140, 250, 32);

        lblApellidoPaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(40, 101, 145));
        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidoPaterno.setText("Apellido Paterno");
        lblApellidoPaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoPaterno);
        lblApellidoPaterno.setBounds(140, 220, 440, 32);

        lblNumeroInterior.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblNumeroInterior.setForeground(new java.awt.Color(40, 101, 145));
        lblNumeroInterior.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNumeroInterior.setText("Numero Interior");
        lblNumeroInterior.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblNumeroInterior);
        lblNumeroInterior.setBounds(640, 230, 410, 32);

        lblApellidoMaterno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(40, 101, 145));
        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidoMaterno.setText("Apellido Materno");
        lblApellidoMaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblApellidoMaterno);
        lblApellidoMaterno.setBounds(140, 310, 430, 32);

        lblCodigoPostal.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCodigoPostal.setForeground(new java.awt.Color(40, 101, 145));
        lblCodigoPostal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCodigoPostal.setText("Codigo Postal");
        lblCodigoPostal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCodigoPostal);
        lblCodigoPostal.setBounds(640, 310, 440, 32);

        lblEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(40, 101, 145));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email");
        lblEmail.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblEmail);
        lblEmail.setBounds(140, 400, 430, 32);

        lblColonia.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblColonia.setForeground(new java.awt.Color(40, 101, 145));
        lblColonia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblColonia.setText("Colonia");
        lblColonia.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblColonia);
        lblColonia.setBounds(640, 400, 430, 32);

        lblTelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(40, 101, 145));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTelefono.setText("Telefono");
        lblTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblTelefono);
        lblTelefono.setBounds(140, 490, 430, 32);

        lblCiudad.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(40, 101, 145));
        lblCiudad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCiudad.setText("Cuidad");
        lblCiudad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblCiudad);
        lblCiudad.setBounds(640, 490, 450, 32);

        lblEstado.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(40, 101, 145));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEstado.setText("Estado");
        lblEstado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lblEstado);
        lblEstado.setBounds(640, 590, 430, 32);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Images\\background.png")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1430, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTelefonoActionPerformed
    
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
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
         if(
            validarCampoVacio(txtfNombre, false, false) &&
            validarCampoVacio(txtfApellidoPaterno, false, false) &&
            validarCampoVacio(txtfApellidoMaterno, false, false) &&
            validarCampoVacio(txtfEmail, false, false) &&
            validarCampoVacio(txtfTelefono, false, true) && 
            validarCampoVacio(txtfCalle, false, false) &&
            validarCampoVacio(txtfNumeroInterior, false, true) && 
            validarCampoVacio(txtfCodigoPostal, false, true) &&    
            validarCampoVacio(txtfColonia, false, false) &&  
            validarCampoVacio(txtfCiudad, false, false) &&  
            validarCampoVacio(txtfEstado, false, false)        
        ){
            
        }else{
            JOptionPane.showMessageDialog(null, "Verifica los campos", "Qualitas - Cliente", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Verifica los campos");
        }
         
        String nombre = txtfNombre.getText();
        System.out.println(nombre);
        String apellidoPaterno = txtfApellidoPaterno.getText();
        System.out.println(apellidoPaterno);
        String apellidoMaterno = txtfApellidoMaterno.getText();
        System.out.println(apellidoMaterno);
        String email = txtfEmail.getText();
        System.out.println(email);
        String telefono = txtfTelefono.getText();
        System.out.println(telefono);
        String calle = txtfCalle.getText();
        System.out.println(calle);
        String numeroInterior = txtfNumeroInterior.getText();
        System.out.println(numeroInterior);
        String codigoPostal = txtfCodigoPostal.getText();
        System.out.println(codigoPostal);
        String colonia = txtfColonia.getText();
        System.out.println(colonia);
        String ciudad = txtfCiudad.getText();
        System.out.println(ciudad);
        String estado = txtfEstado.getText();
        System.out.println(estado);
        
        
        
        // Logica del pop up de confirmacion
        int result = JOptionPane.showConfirmDialog(
                            new JFrame(),
                            "¿Estas seguro de actualizar este cliente?", 
                            "QUALITAS - CONFIRMACION",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                        );
         
            if(result == JOptionPane.YES_OPTION){

                Connection conexion;
            
            try {
                conexion = ConexionBD.obtenerConexion();
                Clientes cliente = new Clientes(nombre, apellidoPaterno, apellidoMaterno, calle, numeroInterior, codigoPostal, colonia, ciudad, estado, email, telefono);
                System.out.println(cliente);
                
                ClientesDAO clientesDAO = new ClientesDAO(conexion);
                int id = clientesDAO.actualizarCliente(cliente, this.idCliente);
                if (id != 0){
                    JOptionPane.showMessageDialog(null, "Se actualizo el cliente (" + nombre + ") exitosamente.", "Qualitas - Cliente", JOptionPane.INFORMATION_MESSAGE);
                    VistaClientes vistaClientes = new VistaClientes();
                    vistaClientes.setVisible(true);
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el cliente (" + nombre + ") ", "Qualitas - Cliente", JOptionPane.ERROR_MESSAGE);
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(VistaClientesActualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
                

            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
               
            }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
                 VistaClientes vistaClientes = new VistaClientes();
                 vistaClientes.setVisible(true);
                 dispose();      
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfCiudadActionPerformed

    private void txtfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEstadoActionPerformed

    private void txtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfEmailActionPerformed

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
            java.util.logging.Logger.getLogger(VistaClientesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaClientesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaClientesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaClientesActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaClientesActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroInterior;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfCalle;
    private javax.swing.JTextField txtfCiudad;
    private javax.swing.JTextField txtfCodigoPostal;
    private javax.swing.JTextField txtfColonia;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JTextField txtfEstado;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfNumeroInterior;
    private javax.swing.JTextField txtfTelefono;
    // End of variables declaration//GEN-END:variables
}
