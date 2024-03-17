package Backend;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {
    private Connection connection;

    public ProductosDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertarProducto(Productos producto) throws SQLException {
        String query = "INSERT INTO producto (nombre, descripcion, numero_lote, fecha_produccion, fecha_expiracion, expiracion_alerta) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getDescripcion());
            statement.setInt(3, producto.getNumeroLote());
            statement.setString(4, producto.getFechaProduccion());
            statement.setString(5, producto.getFechaExpiracion());
            statement.setBoolean(6, producto.estaPorExpirar());

            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            System.out.println("Supuestamente se inserto");

        }
    }

    public Productos obtenerProducto(int idProducto) throws SQLException {
        String query = "SELECT * FROM producto WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Productos producto = new Productos();
                    producto.setNombre(resultSet.getString("nombre"));
                    producto.setDescripcion(resultSet.getString("descripcion"));
                    producto.setNumeroLote(resultSet.getInt("numero_lote"));
                    producto.setFechaProduccion(resultSet.getString("fecha_produccion"));
                    producto.setFechaExpiracion(resultSet.getString("fecha_expiracion"));
                    producto.estaPorExpirar();
                    return producto;
                }
            }
        }
        return null;
    }

    public List<Productos> obtenerTodosProductos() throws SQLException {
        List<Productos> productos = new ArrayList<>();
        String query = "SELECT * FROM producto";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Productos producto = new Productos();
                producto.setNombre(resultSet.getString("nombre"));
                producto.setDescripcion(resultSet.getString("descripcion"));
                producto.setNumeroLote(resultSet.getInt("numero_lote"));
                producto.setFechaProduccion(resultSet.getString("fecha_produccion"));
                producto.setFechaExpiracion(resultSet.getString("fecha_expiracion"));
                producto.estaPorExpirar();
                productos.add(producto);
            }
        }
        return productos;
    }

    public void actualizarProducto(Productos producto, int idProducto) throws SQLException {
        String query = "UPDATE producto SET nombre = ?, descripcion = ?, numero_lote = ?, fecha_produccion = ?, fecha_expiracion = ?, expiracion_alerta = ? WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getDescripcion());
            statement.setInt(3, producto.getNumeroLote());
            statement.setString(4, producto.getFechaProduccion());
            statement.setString(5, producto.getFechaExpiracion());
            statement.setBoolean(6, producto.estaPorExpirar());
            statement.setInt(7, idProducto);

            statement.executeUpdate();
        }
    }

    public void eliminarProducto(int idProducto) throws SQLException {
        String query = "DELETE FROM producto WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);
            statement.executeUpdate();
        }
    }
}
