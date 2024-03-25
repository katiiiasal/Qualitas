
package Backend;

public class Empleado {

  // Atributos
  private int idEmpleado;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String email;
  private String password;
  private String rol;
  private String telefono;

  // Construcor
  public Empleado() {

  }

  public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String email, String password,
      String rol, String telefono) {

    this.nombre = nombre;
    this.apellidoMaterno = apellidoPaterno;
    this.apellidoPaterno = apellidoMaterno;
    this.email = email;
    this.password = password;
    this.rol = rol;
    this.telefono = telefono;
  }

  public int getIdEmpleado() {
    return idEmpleado;
  }

  public void setIdEmpleado(int idEmpleado) {
    this.idEmpleado = idEmpleado;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  // Metodos
  public String toString(){
    return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", email=" + email + ", password=" + password + ", rol=" + rol + ", telefono=" + telefono + "]";
  }

}
    

