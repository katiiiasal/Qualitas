package Backend;

import Frontend.VistaProductosCrear;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductosDAO {
    private Connection connection;

    public ProductosDAO(Connection connection) {
        this.connection = connection;
    }
    

    public int insertarProducto(Productos producto) throws SQLException {
        String query = "INSERT INTO productos (nombre, descripcion, numero_lote, fecha_produccion, fecha_expiracion, expiracion_alerta) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getDescripcion());
            statement.setInt(3, producto.getNumeroLote());
            statement.setString(4, producto.getFechaProduccion());
            statement.setString(5, producto.getFechaExpiracion());
            statement.setBoolean(6, producto.estaPorExpirar());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        producto.setIdProducto( generatedKeys.getInt(1) );
                        return generatedKeys.getInt(1); // Obtiene el ID generado
                    } else {
                        throw new SQLException("No se pudo obtener el ID generado del producto.");
                    }
                }
            } else {
                throw new SQLException("No se pudo insertar el producto en la base de datos.");
            }
        }
    }

    public Productos obtenerProducto(int idProducto) throws SQLException {
        String query = "SELECT * FROM productos WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return obtenerProductoDesdeResultSet(resultSet);
                }
            }
        }
        return null;
    }

    private Productos obtenerProductoDesdeResultSet(ResultSet resultSet) throws SQLException {
        Productos producto = new Productos();
        producto.setIdProducto(resultSet.getInt("id_producto"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setDescripcion(resultSet.getString("descripcion"));
        producto.setNumeroLote(resultSet.getInt("numero_lote"));
        producto.setFechaProduccion(resultSet.getString("fecha_produccion"));
        producto.setFechaExpiracion(resultSet.getString("fecha_expiracion"));
        producto.estaPorExpirar();
        return producto;
    }

    public List<Productos> obtenerTodosProductos() throws SQLException {
        List<Productos> productos = new ArrayList<>();
        String query = "SELECT * FROM productos";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                productos.add(obtenerProductoDesdeResultSet(resultSet));
            }
        }
        return productos;
    }

    public int actualizarProducto(Productos producto, int idProducto) throws SQLException {
        String query = "UPDATE productos SET nombre = ?, descripcion = ?, numero_lote = ?, fecha_produccion = ?, fecha_expiracion = ?, expiracion_alerta = ? WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getDescripcion());
            statement.setInt(3, producto.getNumeroLote());
            statement.setString(4, producto.getFechaProduccion());
            statement.setString(5, producto.getFechaExpiracion());
            statement.setBoolean(6, producto.estaPorExpirar());
            statement.setInt(7, idProducto);

            statement.executeUpdate();
            return 1;
        }catch (SQLException ex) {
            return 0;
        }
    }

    public int eliminarProducto(int idProducto) throws SQLException {
        String query = "DELETE FROM productos WHERE id_producto = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idProducto);
            statement.executeUpdate();
            return 1;
        }catch (SQLException ex) {
            return 0;
        }
    }
}
