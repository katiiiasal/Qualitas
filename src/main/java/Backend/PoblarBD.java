package Backend;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author heiva
 */
public class PoblarBD {

    public static void main(String[] args) {
        

         try {
            Connection conexion = ConexionBD.obtenerConexion();
            
            EmpleadoDAO empleadoDAO = new EmpleadoDAO();
            ClientesDAO clientesDAO = new ClientesDAO(conexion);   
            ProductosDAO productosDAO = new ProductosDAO(conexion);
            
            Empleado empleado1 = new Empleado("Katia", "SALDANA", "ESQUIVEL", "katia@qualitas.org", "qualitas", "admin", "3325458521");
            Empleado empleado2 = new Empleado("Hector", "Cardenas", "Guerrero", "hector@qualitas.org", "hector123", "admin", "335878548");
            Empleado empleado3 = new Empleado("Jose", "Gomez", "Camacho", "michi@qualitas.org", "michi", "admin", "335878548");
            Empleado empleado4 = new Empleado("Donna", "Ramírez", "Gutiérrez", "donna.ramirez@qualitas.org", "donnaram", "user", "123456789");
            Empleado empleado5 = new Empleado("Gary", "Molina", "Sánchez", "gary.molina@qualitas.org", "garymoli", "admin", "987654321");
            Empleado empleado6 = new Empleado("Pamela", "Vargas", "Navarro", "pamela.vargas@qualitas.org", "pamelavar", "user", "456123789");
            Empleado empleado7 = new Empleado("Dennis", "Gómez", "Martínez", "dennis.gomez@qualitas.org", "dennisgom", "admin", "789123456");
            Empleado empleado8 = new Empleado("Sharon", "Hernández", "González", "sharon.hernandez@qualitas.org", "sharonher", "user", "321654987");
            Empleado empleado9 = new Empleado("Bruce", "Delgado", "López", "bruce.delgado@qualitas.org", "brucedel", "admin", "654789321");
            Empleado empleado10 = new Empleado("Deborah", "Serrano", "Torres", "deborah.serrano@qualitas.org", "deborahse", "user", "147258369");  

            empleadoDAO.insertarEmpleado(empleado1);
            empleadoDAO.insertarEmpleado(empleado2);
            empleadoDAO.insertarEmpleado(empleado3);
            empleadoDAO.insertarEmpleado(empleado4);
            empleadoDAO.insertarEmpleado(empleado5);
            empleadoDAO.insertarEmpleado(empleado6);
            empleadoDAO.insertarEmpleado(empleado7);
            empleadoDAO.insertarEmpleado(empleado8);
            empleadoDAO.insertarEmpleado(empleado9);
            empleadoDAO.insertarEmpleado(empleado10);


            Clientes cliente1 = new Clientes("Alejandro", "Gutiérrez", "Díaz", "María Hernández", "1234", "45678", "Calle Andalucía", "Guadalajara", "Jalisco", "alejandro.gutierrez@oxxo.com", "3312345678");
            Clientes cliente2 = new Clientes("Lucía", "López", "Sánchez", "José Rodríguez", "5678", "45000", "Avenida Triana", "Zapopan", "Jalisco", "lucia.lopez@seveneleven.com", "3334567890");
            Clientes cliente3 = new Clientes("Carlos", "Martínez", "Fernández", "Ana García", "9101", "45100", "Calle Sevilla", "Tlaquepaque", "Jalisco", "carlos.martinez@zoopizza.com", "3356789012");
            Clientes cliente4 = new Clientes("Elena", "García", "Martín", "Juan Pérez", "1122", "45200", "Calle Betis", "Tonala", "Jalisco", "elena.garcia@dominos.com", "3378901234");
            Clientes cliente5 = new Clientes("Miguel", "Fernández", "Gómez", "Laura Ruiz", "3344", "45300", "Avenida Catedral", "Guadalajara", "Jalisco", "miguel.fernandez@soriana.com", "3390123456");

            clientesDAO.insertarCliente(cliente1);
            clientesDAO.insertarCliente(cliente2);
            clientesDAO.insertarCliente(cliente3);
            clientesDAO.insertarCliente(cliente4);
            clientesDAO.insertarCliente(cliente5);
            


            // Insertar un producto

            Productos producto1 = new Productos("Doritos", "Bolsa de Doritos sabor Nacho de 170g", 6248371, "2024-03-20", "2024-08-10", 18.50);
            Productos producto2 = new Productos("Cheetos", "Bolsa de Cheetos sabor Queso de 180g", 4629815, "2024-03-21", "2024-09-15", 15.99);
            Productos producto3 = new Productos("Fritos", "Bolsa de Fritos sabor Original de 150g", 7835692, "2024-03-22", "2024-10-05", 14.75);
            Productos producto4 = new Productos("Ruffles", "Bolsa de Ruffles sabor Jamón de 200g", 8956214, "2024-03-23", "2024-08-28", 17.25);
            Productos producto5 = new Productos("Takis", "Bolsa de Takis sabor Fuego de 100g", 3578921, "2024-03-24", "2024-09-20", 12.99);
            Productos producto6 = new Productos("Lay's", "Bolsa de Papas Lay's sabor Limón de 160g", 6543789, "2024-03-25", "2024-09-30", 16.99);
            Productos producto7 = new Productos("Cheetos Flamin Hot", "Bolsa de Cheetos Flamin' Hot de 200g", 2145983, "2024-03-26", "2024-09-25", 19.50);
            Productos producto8 = new Productos("Doritos Dinamita", "Bolsa de Doritos Dinamita sabor Chile Limón de 180g", 9367854, "2024-03-27", "2024-10-15", 20.75);
            Productos producto9 = new Productos("Barcel Chips", "Bolsa de Barcel Chips sabor Habanero de 130g", 7854926, "2024-03-28", "2024-10-25", 13.99);
            Productos producto10 = new Productos("Sabritas Turbos Flamin' Hot", "Bolsa de Sabritas Turbos Flamin' Hot de 150g", 3698247, "2024-03-29", "2024-08-05", 22.99);

            productosDAO.insertarProducto(producto1);
            productosDAO.insertarProducto(producto2);
            productosDAO.insertarProducto(producto3);
            productosDAO.insertarProducto(producto4);
            productosDAO.insertarProducto(producto5);
            productosDAO.insertarProducto(producto6);
            productosDAO.insertarProducto(producto7);
            productosDAO.insertarProducto(producto8);
            productosDAO.insertarProducto(producto9);
            productosDAO.insertarProducto(producto10);
            
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
