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
            
            Clientes cliente1 = new Clientes("Oxxo", "Seshomaru", "Yasha", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru1@ymail.com", "2552552552");
            Clientes cliente2 = new Clientes("Seven", "Sesho", "Sha", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru2@gmail.com", "2552552552");
            Clientes cliente3 = new Clientes("Coppel", "Maru", "Ya", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru3@ymail.com", "2552552552");
            Clientes cliente4 = new Clientes("PriceShoes", "Seshomaru1", "Inu", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru4@ymail.com", "2552552552");
            Clientes cliente5 = new Clientes("Modelorama", "Seshomaru2", "Sanko", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru5@ymail.com", "2552552552");
            Clientes cliente6 = new Clientes("Elektra", "Seshomaru3", "Aome", "Pedro Moreno", "1234", "45190", "El Batan", "GDL", "Jalisco", "seshomaru6@ymail.com", "2552552552");
            
            System.out.println(cliente1);
             
            ClientesDAO clientesDAO = new ClientesDAO(conexion);
            clientesDAO.insertarCliente(cliente1);
            clientesDAO.insertarCliente(cliente2);
            clientesDAO.insertarCliente(cliente3);
            clientesDAO.insertarCliente(cliente4);
            clientesDAO.insertarCliente(cliente5);
            clientesDAO.insertarCliente(cliente6);
            
            
            ProductosDAO productosDAO = new ProductosDAO(conexion);

            // Insertar un producto
            Productos producto1 = new Productos("Doritos", "12Pack sabor nacho 35g", 11111, "2024-03-17", "2024-03-26", 100);
            Productos producto2 = new Productos("Rufles", "12Pack sabor queso 35g", 22222, "2024-03-17", "2024-03-27", 200);
            Productos producto3 = new Productos("Sabritas", "12Pack naturales 50g", 33333, "2024-03-17", "2024-03-31", 300);
            Productos producto4 = new Productos("Nachos", "12Pack sabor spicy 40g", 44444, "2024-03-17", "2024-03-30", 400);
            Productos producto5 = new Productos("Fritos", "12Pack sabor chipotle 50g", 55555, "2024-03-17", "2024-04-01", 500);
            Productos producto6 = new Productos("Paquetaxo", "12Pack sabor mix 150g", 66666, "2024-03-17", "2024-03-28", 600);
            
            System.out.println(producto1);
            
            productosDAO.insertarProducto(producto1);
            productosDAO.insertarProducto(producto2);
            productosDAO.insertarProducto(producto3);
            productosDAO.insertarProducto(producto4);
            productosDAO.insertarProducto(producto5);
            productosDAO.insertarProducto(producto6);
            
            //Pedido pedido1 = new Pedido(1545217, 2, "2025-12-31");
            //Pedido pedido2 = new Pedido(1545218, 2, "2025-12-31");
            //PedidoDAO pedidoDAO = new PedidoDAO();
            
            //pedidoDAO.insertarPedido(pedido2);
            //pedidoDAO.actualizarPedido(pedido1, 1545217);
            //pedidoDAO.eliminarPedido(1545218);
            
            /*
            DetallePedido detallePedido1 = new DetallePedido(1545217, 2, 5);
            DetallePedido detallePedido2 = new DetallePedido(1545217, 1, 3);
            DetallePedido detallePedido3 = new DetallePedido(1545217, 1, 2);
            DetallePedido detallePedido4 = new DetallePedido(1545217, 2, 10);
            
            DetallePedidoDAO detallePedidoDAO1 = new DetallePedidoDAO();
            
            detallePedidoDAO1.insertarDetallePedido(detallePedido1);
            detallePedidoDAO1.insertarDetallePedido(detallePedido2);
            detallePedidoDAO1.insertarDetallePedido(detallePedido3);
            detallePedidoDAO1.insertarDetallePedido(detallePedido4);
            */
            
            
            //pedidoDAO.insertarPedido(pedido2);
            //pedidoDAO.actualizarPedido(pedido1, 1545217);
            //pedidoDAO.eliminarPedido(1545218);
            
            //EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            //empleadoDAO.insertarEmpleado(empleado1);
            
            
            
            /*
            
            

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
            
            

            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}
