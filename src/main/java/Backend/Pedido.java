
package Backend;

public class Pedido{
  // Atributos

  private int idPedido;
  private int idCliente;
  private String fechaEnvio;
  private String fechaCreacion;

  // Constructores
  public Pedido(){
    
  }

  public Pedido(int idPedido, int idCliente, String fechaEnvio){
    this.idPedido = idPedido;
    this.idCliente = idCliente;
    this.fechaEnvio = fechaEnvio;
  }

  public int getIdPedido(){
    return idPedido;
  }

  public void setIdPedido(int idPedido){
    this.idPedido = idPedido;
  }

  public int getIdCliente(){
    return idCliente;
  }

  public void setIdCliente(int idCliente){
    this.idCliente = idCliente;
  }

  public String getFechaEnvio(){
    return fechaEnvio;
  }

  public void setFechaEnvio(String fechaEnvio){
    this.fechaEnvio = fechaEnvio;
  }

  public String getFechaCreacion(){
    return fechaCreacion;
  }

  public void setFechaCreacion(String fechaCreacion){
    this.fechaCreacion = fechaCreacion;
  }

  public String toString(){
    return "Pedido: " + idPedido + "Cliente: " + idCliente + "Fecha de envio: " + fechaEnvio;
  }
  
}