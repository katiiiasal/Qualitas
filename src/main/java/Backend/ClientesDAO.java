package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientesDAO {
    private Connection connection;

    public ClientesDAO(Connection connection) {
        this.connection = connection;
    }

    public int insertarCliente(Clientes cliente) throws SQLException {
        String sql = "INSERT INTO clientes (nombre, apellido_paterno, apellido_materno, calle, numero, codigo_postal, colonia, ciudad, estado, email, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellidoPaterno());
            statement.setString(3, cliente.getApellidoMaterno());
            statement.setString(4, cliente.getCalle());
            statement.setString(5, cliente.getNumero());
            statement.setString(6, cliente.getCodigoPostal());
            statement.setString(7, cliente.getColonia());
            statement.setString(8, cliente.getCiudad());
            statement.setString(9, cliente.getEstado());
            statement.setString(10, cliente.getEmail());
            statement.setString(11, cliente.getTelefono());

            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        cliente.setIdCliente( generatedKeys.getInt(1) );
                        return generatedKeys.getInt(1); // Obtiene el ID generado
                    } else {
                        throw new SQLException("No se pudo obtener el ID generado del cliente.");
                    }
                }
            } else {
                throw new SQLException("No se pudo insertar el cliente en la base de datos.");
            }
        }
    }

    public List<Clientes> obtenerTodosClientes() throws SQLException {
        List<Clientes> clientesList = new ArrayList<>();
        String sql = "SELECT * FROM clientes";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Clientes cliente = new Clientes();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                cliente.setApellidoMaterno(resultSet.getString("apellido_materno"));
                cliente.setCalle(resultSet.getString("calle"));
                cliente.setNumero(resultSet.getString("numero"));
                cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
                cliente.setColonia(resultSet.getString("colonia"));
                cliente.setCiudad(resultSet.getString("ciudad"));
                cliente.setEstado(resultSet.getString("estado"));
                cliente.setEmail(resultSet.getString("email"));
                cliente.setTelefono(resultSet.getString("telefono"));

                clientesList.add(cliente);
            }
        }

        return clientesList;
    }

    public Clientes obtenerCliente(int idCliente) throws SQLException {
        String sql = "SELECT * FROM clientes WHERE idCliente = ?";
        Clientes cliente = null;

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idCliente);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                cliente = new Clientes();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                cliente.setApellidoMaterno(resultSet.getString("apellido_materno"));
                cliente.setCalle(resultSet.getString("calle"));
                cliente.setNumero(resultSet.getString("numero"));
                cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
                cliente.setColonia(resultSet.getString("colonia"));
                cliente.setCiudad(resultSet.getString("ciudad"));
                cliente.setEstado(resultSet.getString("estado"));
                cliente.setEmail(resultSet.getString("email"));
                cliente.setTelefono(resultSet.getString("telefono"));
            }
        }

        return cliente;
    }

    public int actualizarCliente(Clientes cliente, int idCliente) throws SQLException {
        String sql = "UPDATE clientes SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, calle = ?, numero = ?, codigo_postal = ?, colonia = ?, ciudad = ?, estado = ?, email = ?, telefono = ? WHERE idCliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellidoPaterno());
            statement.setString(3, cliente.getApellidoMaterno());
            statement.setString(4, cliente.getCalle());
            statement.setString(5, cliente.getNumero());
            statement.setString(6, cliente.getCodigoPostal());
            statement.setString(7, cliente.getColonia());
            statement.setString(8, cliente.getCiudad());
            statement.setString(9, cliente.getEstado());
            statement.setString(10, cliente.getEmail());
            statement.setString(11, cliente.getTelefono());
            statement.setInt(12, cliente.getIdCliente());

            statement.executeUpdate();
            return 1;
        }catch (SQLException ex) {
            return 0;
        }
        
    }

    public int eliminarCliente(int idCliente) throws SQLException {
        String sql = "DELETE FROM clientes WHERE idCliente = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idCliente);
            statement.executeUpdate();
            return 1;
        }catch (SQLException ex) {
            return 0;
        }
        
    }
}
