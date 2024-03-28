
package Backend;

public class DetallePedido {

  // Atributos
  private int idDetallePedido;
  private int idPedido;
  private int idProducto;
  private int cantidad;
  private String nombre;
  private String descripcion;
  private double precio;


  // Constructor
  public DetallePedido() {

  }

  public DetallePedido(int idPedido, int idProducto, int cantidad) {
    this.idPedido = idPedido;
    this.idProducto = idProducto;
    this.cantidad = cantidad;
  }

  public int getIdDetallePedido() {
    return idDetallePedido;
  }

  public void setIdDetallePedido(int idDetallePedido) {
    this.idDetallePedido = idDetallePedido;
  }

  public int getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(int idPedido) {
    this.idPedido = idPedido;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public String toString() {
    return "DetallePedido [idDetallePedido=" + idDetallePedido + ", idPedido=" + idPedido + ", idProducto=" + idProducto
        + ", cantidad=" + cantidad + "]";
  }
  
  // Getters adicionales
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}