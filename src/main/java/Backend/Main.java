package Backend;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author heiva
 */
public class Main {

    public static void main(String[] args) {
        
        
        Empleado empleado1 = new Empleado("Juan", "Perez", "Gomez", "ejeyd@example", "123456", "admin", "55555555");
    System.out.println(empleado1);

         try {
            Connection conexion = ConexionBD.obtenerConexion();
            
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            empleadoDAO.insertarEmpleado(empleado1);
            
            
            
            /*
            ProductosDAO productosDAO = new ProductosDAO(conexion);

            // Insertar un producto
            Productos doritos = new Productos("Doritos", "35grs sabor nacho", 12345, "2024-03-17", "2024-03-18");
            System.out.println(doritos);
            productosDAO.insertarProducto(doritos);
            

            // Obtener un producto por su ID
            Productos productoObtenido = productosDAO.obtenerProducto(1);
            System.out.println("Producto obtenido por ID:");
            System.out.println(productoObtenido);
            
            
            // Obtener todos los productos
            List<Productos> todosProductos = productosDAO.obtenerTodosProductos();
            System.out.println("Todos los productos:");
            for (Productos product : todosProductos) {
                System.out.println(product);
            }
            
            
            // Actualizar un producto
            Productos producto2 = new Productos("Doritos", "76grs sabor nacho", 12345, "2024-03-17", "2024-03-29");
            productosDAO.actualizarProducto(producto2, 1);
            
            
            // Eliminar un producto
            //productosDAO.eliminarProducto(1);
            */
            
            Clientes cliente1 = new Clientes("Oxxo", "Seshomaru", "Yasha", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru@ymail.com", "2552552552");
             System.out.println(cliente1);
             
             
            // ClientesDAO clientesDAO = new ClientesDAO(conexion);
            // clientesDAO.insertarCliente(cliente1);

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
