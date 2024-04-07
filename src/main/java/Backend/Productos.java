package Backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Productos {

    // Atributos
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int numeroLote;
    private String fechaProduccion;
    private String fechaExpiracion;
    private double precio;

    // Constructor
    public Productos() {

    }

    public Productos(String nombre, String descripcion, int numeroLote, String fechaProduccion, String fechaExpiracion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroLote = numeroLote;
        this.fechaProduccion = fechaProduccion;
        this.fechaExpiracion = fechaExpiracion;
        this.precio = precio;
    }

    // Getters & Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    // Métodos adicionales
    public static String fechaHoy() {
        LocalDate fechaHoy = LocalDate.now();
        return fechaHoy.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static int calcularDiferenciaEnDias(String fechaHoy, String fechaExpiracion) {
        // Define el formato de las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Convierte las cadenas a objetos LocalDate
        LocalDate hoy = LocalDate.parse(fechaHoy, formatter);
        LocalDate expiracion = LocalDate.parse(fechaExpiracion, formatter);

        // Calcula la diferencia en días y realiza la conversión a int
        int dias = (int) ChronoUnit.DAYS.between(hoy, expiracion);
        System.out.println(dias);
        return dias;
    }

    public int estaPorExpirar() {
        int dias = calcularDiferenciaEnDias(fechaHoy(), this.getFechaExpiracion());

        if (dias <= 2 && dias >= 0) {
            System.out.println("El producto está por expirar en " + dias + " días.");
            return 1;
        } else if (dias > 2) {
            System.out.println("El producto no está por expirar, ¡no te preocupes!");
            return 0;
        } else {
            System.out.println("El producto ha expirado.");
            return 2;
        }
    }

    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Productos{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroLote=" + numeroLote +
                ", fechaProduccion='" + fechaProduccion + '\'' +
                ", fechaExpiracion='" + fechaExpiracion + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
