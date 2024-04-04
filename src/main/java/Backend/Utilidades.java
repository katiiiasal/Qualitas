package Backend;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.text.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Utilidades {
    
    // Atributos
    
    public static final Color ROJO = new Color(0xCB2129);
    public static final Color NARANJA = new Color(0xF88920);
    public static final Color AZUL = new Color(0x286591);
    public static final Color VERDE = new Color(0x146E38);
    
    private static JDialog loadingDialog;

    public static void cargarLogo(JFrame frame, String nombreImagen) {
        // Obtener la URL de la imagen
        String rutaAbsoluta = "file:///C:/Images/" + nombreImagen;
        URL url;
        try {
            url = new URL(rutaAbsoluta);
            
            // Verificar si la URL no es nula
            if (url != null) {
                // Crear un ImageIcon con la URL
                ImageIcon icono = new ImageIcon(url);

                // Convertir el ImageIcon en Image
                Image image = icono.getImage();

                // Establecer la imagen del ícono de la ventana
                frame.setIconImage(image);
            } else {
                System.err.println("No se pudo cargar la imagen.");
            }
            
        } catch (MalformedURLException ex) {
            System.err.println("No se pudo cargar la imagen.");
        }

    }
    
    public static void convertComponentsToUpperCase(Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof Container) {
                convertComponentsToUpperCase((Container) component);
            }
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                label.setText(label.getText().toUpperCase());
            } else if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.setText(button.getText().toUpperCase());
            }
        }
        
    }
    
    
    public static void limitarCaracteres(JTextField textField, int limite, String tipo) {
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (validarCadena(fb.getDocument().getText(0, fb.getDocument().getLength()) + string, tipo, limite)) {
                    super.insertString(fb, offset, string, attr);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (validarCadena(fb.getDocument().getText(0, fb.getDocument().getLength()) + text, tipo, limite)) {
                    super.replace(fb, offset, length, text, attrs);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }

    private static boolean validarCadena(String cadena, String tipo, int limite) {
        if (tipo.equals("letras")) {
            return cadena.matches("[a-zA-Z ]*") && cadena.length() <= limite;
        } else if (tipo.equals("numeros")) {
            return cadena.matches("\\d*") && cadena.length() <= limite;
        } else if (tipo.equals("fechas")) {
            // Validación para fechas permitiendo solo dígitos y guiones medios
            if (!cadena.matches("[\\d-]*") || cadena.length() > 10) {
                return false;
            }

            if (cadena.isEmpty()) {
                return true; // Permitir cadena vacía
            }

            try {
                if (cadena.length() >= 4) { // Año completo ingresado
                    int year = Integer.parseInt(cadena.substring(0, 4));
                    if (year < 0) {
                        return false; // Año negativo no válido
                    }
                }
                if (cadena.length() >= 7) { // Mes completo ingresado
                    int month = Integer.parseInt(cadena.substring(5, 7));
                    if (month < 1 || month > 12) {
                        return false; // Mes fuera de rango (1-12)
                    }
                }
                if (cadena.length() == 10) { // Día completo ingresado
                    LocalDate.parse(cadena); // Intentar parsear la fecha completa
                }
                return true;
            } catch (DateTimeParseException | NumberFormatException e) {
                return false;
            }
        } else {
            return false;
        }
    }
   
    
    
    
    
}