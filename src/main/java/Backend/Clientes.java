
package Backend;

public class Clientes {

  // Atributos

  private int idCliente;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String calle;
  private String numero;
  private String codigoPostal;
  private String colonia;
  private String ciudad;
  private String estado;
  private String email;
  private String telefono;

  // Constructor

  public Clientes() {

  }

  public Clientes(String nombre, String apellidoPaterno, String apellidoMaterno, String calle, String numero,
      String codigoPostal, String colonia, String ciudad, String estado, String email, String telefono) {

    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.calle = calle;
    this.numero = numero;
    this.codigoPostal = codigoPostal;
    this.colonia = colonia;
    this.ciudad = ciudad;
    this.estado = estado;
    this.email = email;
    this.telefono = telefono;
  }

  // Getters & Setters

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  // toString = método especial returns my attributes 
  public String toString(){
    return "Nombre: " + this.nombre + "\nApellido Paterno: " + this.apellidoPaterno + "\nApellido Materno: " + this.apellidoMaterno + "\nCalle: " + this.calle + "\nNumero: " + this.numero + "\nCodigo Postal: " + this.codigoPostal + "\nColonia: " + this.colonia + "\nCiudad: " + this.ciudad + "\nEstado: " + this.estado + "\nEmail: " + this.email + "\nTelefono: " + this.telefono;
  }

}
