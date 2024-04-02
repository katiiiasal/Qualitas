package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetallePedidoDAO {

    // Método para obtener la conexión a la base de datos
    private Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/qualitas"; // Reemplaza "tu_base_de_datos" por el nombre de tu base de datos
        String usuario = "root"; // Reemplaza "tu_usuario" por tu usuario de base de datos
        String contraseña = "toor"; // Reemplaza "tu_contraseña" por tu contraseña de base de datos

        return DriverManager.getConnection(url, usuario, contraseña);
    }

    // Método para insertar un nuevo detalle de pedido en la base de datos
    public int insertarDetallePedido(DetallePedido detallePedido) throws SQLException {
        String query = "INSERT INTO detalle_pedido (id_pedido, id_producto, cantidad) VALUES (?, ?, ?)";
        
        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, detallePedido.getIdPedido());
            stmt.setInt(2, detallePedido.getIdProducto());
            stmt.setInt(3, detallePedido.getCantidad());

            stmt.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error al insertar detalle de pedido: " + e.getMessage());
            return 0;
        }
    }

    // Método para obtener todos los detalles de pedidos de la base de datos
    public List<DetallePedido> obtenerDetallesPedidos() throws SQLException {
        List<DetallePedido> detallesPedidos = new ArrayList<>();
        String query = "SELECT * FROM detalle_pedido";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                DetallePedido detallePedido = new DetallePedido();
                detallePedido.setIdDetallePedido(rs.getInt("id_detalle"));
                detallePedido.setIdPedido(rs.getInt("id_pedido"));
                detallePedido.setIdProducto(rs.getInt("id_producto"));
                detallePedido.setCantidad(rs.getInt("cantidad"));

                detallesPedidos.add(detallePedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener detalles de pedidos: " + e.getMessage());
            throw e;
        }

        return detallesPedidos;
    }

    // Método para actualizar un detalle de pedido en la base de datos
    public int actualizarDetallePedido(DetallePedido detallePedido, int idDetallePedido) throws SQLException {
        String query = "UPDATE detalle_pedido SET id_pedido=?, id_producto=?, cantidad=? WHERE id_detalle=?";
        
        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, detallePedido.getIdPedido());
            stmt.setInt(2, detallePedido.getIdProducto());
            stmt.setInt(3, detallePedido.getCantidad());
            stmt.setInt(4, idDetallePedido);

            stmt.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error al actualizar detalle de pedido: " + e.getMessage());
            return 0;
        }
    }

    // Método para eliminar un detalle de pedido de la base de datos
    public int eliminarDetallePedido(int idDetallePedido) throws SQLException {
        String query = "DELETE FROM detalle_pedido WHERE id_detalle=?";
        
        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idDetallePedido);

            stmt.executeUpdate();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error al eliminar detalle de pedido: " + e.getMessage());
            return 0;
        }
    }

    // Método para obtener todos los detalles de pedidos asociados a un idPedido específico
    public List<DetallePedido> obtenerDetallesPedidoPorIdPedido(int idPedido) throws SQLException {
        List<DetallePedido> detallesPedidos = new ArrayList<>();
        String query = "SELECT * FROM detalle_pedido WHERE id_pedido=?";
        
        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idPedido);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    DetallePedido detallePedido = new DetallePedido();
                    detallePedido.setIdDetallePedido(rs.getInt("id_detalle"));
                    detallePedido.setIdPedido(rs.getInt("id_pedido"));
                    detallePedido.setIdProducto(rs.getInt("id_producto"));
                    detallePedido.setCantidad(rs.getInt("cantidad"));

                    detallesPedidos.add(detallePedido);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener detalles de pedidos por idPedido: " + e.getMessage());
            throw e;
        }

        return detallesPedidos;
    }
    
    public List<Object[]> obtenerDetallePedidoCompleto(int idPedido) throws SQLException {
        List<Object[]> detallesPedidos = new ArrayList<>();
        String query = "SELECT dp.id_producto, dp.cantidad, p.nombre, p.descripcion, p.precio FROM detalle_pedido dp JOIN productos p ON dp.id_producto = p.id_producto WHERE dp.id_pedido=?;";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idPedido);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Object[] detallePedido = new Object[5];
                    detallePedido[0] = rs.getObject("id_producto");
                    detallePedido[1] = rs.getObject("cantidad");
                    detallePedido[2] = rs.getObject("nombre");
                    detallePedido[3] = rs.getObject("descripcion");
                    detallePedido[4] = rs.getObject("precio");
                    detallesPedidos.add(detallePedido);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener detalles de pedidos por idPedido: " + e.getMessage());
            throw e;
        }

        return detallesPedidos;
    }



}
