package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/qualitas";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "toor";

    // Consultas SQL
    private static final String INSERTAR_PEDIDO = "INSERT INTO pedidos (id_pedido, id_cliente, fecha_envio) VALUES (?, ?, ?)";
    private static final String SELECCIONAR_PEDIDOS = "SELECT * FROM pedidos";
    private static final String ACTUALIZAR_PEDIDO = "UPDATE pedidos SET id_cliente = ?, fecha_envio = ? WHERE id_pedido = ?";
    private static final String ELIMINAR_PEDIDO = "DELETE FROM pedidos WHERE id_pedido = ?";
    
    // Método para establecer la conexión con la base de datos
    private Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }

    // Método para insertar un pedido en la base de datos
    public int insertarPedido(Pedido pedido) {
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(INSERTAR_PEDIDO)) {
            statement.setInt(1, pedido.getIdPedido());
            statement.setInt(2, pedido.getIdCliente());
            statement.setString(3, pedido.getFechaEnvio());

            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para obtener todos los pedidos de la base de datos
    public List<Pedido> obtenerPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(SELECCIONAR_PEDIDOS);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int idPedido = resultSet.getInt("id_pedido");
                int idCliente = resultSet.getInt("id_cliente");
                String fechaEnvio = resultSet.getString("fecha_envio");
                String fechaCreacion = resultSet.getString("fecha_de_creacion");

                Pedido pedido = new Pedido(idPedido, idCliente, fechaEnvio);
                pedido.setFechaCreacion(fechaCreacion);

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
        return pedidos;
    }

    // Método para obtener un pedido por su ID
    public Pedido obtenerPedidoPorId(int idPedido) {
        Pedido pedido = null;
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM pedidos WHERE id_pedido = ?")) {
            statement.setInt(1, idPedido);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int idCliente = resultSet.getInt("id_cliente");
                    String fechaEnvio = resultSet.getString("fecha_envio");
                    String fechaCreacion = resultSet.getString("fecha_de_creacion");

                    pedido = new Pedido(idPedido, idCliente, fechaEnvio);
                    pedido.setFechaCreacion(fechaCreacion);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
        return pedido;
    }

    // Método para actualizar un pedido en la base de datos
    public int actualizarPedido(Pedido pedido, int idPedido) {
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(ACTUALIZAR_PEDIDO)) {
            statement.setInt(1, pedido.getIdCliente());
            statement.setString(2, pedido.getFechaEnvio());
            statement.setInt(3, idPedido);

            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para eliminar un pedido de la base de datos
    public int eliminarPedido(int idPedido) {
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(ELIMINAR_PEDIDO)) {
            statement.setInt(1, idPedido);
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
