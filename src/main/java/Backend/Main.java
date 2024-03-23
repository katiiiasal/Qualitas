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
        
         try {
            Connection conexion = ConexionBD.obtenerConexion();
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
            

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
