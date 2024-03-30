
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpleadoDAO {

    
    private final String url = "jdbc:mysql://localhost:3306/qualitas";
    private final String user = "root";
    private final String password = "toor";

    // Consultas SQL
    private static final String INSERT_EMPLEADO_SQL = "INSERT INTO empleados (nombre, apellido_paterno, apellido_materno, email, contrasena, rol, telefono) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_EMPLEADO_BY_ID_SQL = "SELECT * FROM empleados WHERE id_empleado=?";
    private static final String SELECT_ALL_EMPLEADOS_SQL = "SELECT * FROM empleados";
    private static final String DELETE_EMPLEADO_SQL = "DELETE FROM empleados WHERE id_empleado=?";
    private static final String UPDATE_EMPLEADO_SQL = "UPDATE empleados SET nombre=?, apellido_paterno=?, apellido_materno=?, email=?, contrasena=?, rol=?, telefono=? WHERE id_empleado=?";

    // Establecer la conexión con la base de datos
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Insertar un nuevo empleado
    public int insertarEmpleado(Empleado empleado) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLEADO_SQL)) {
            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setString(2, empleado.getApellidoPaterno());
            preparedStatement.setString(3, empleado.getApellidoMaterno());
            preparedStatement.setString(4, empleado.getEmail());
            preparedStatement.setString(5, empleado.getPassword());
            preparedStatement.setString(6, empleado.getRol());
            preparedStatement.setString(7, empleado.getTelefono());
            preparedStatement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Obtener un empleado por su ID
    public Empleado obtenerEmpleado(int idEmpleado) {
        Empleado empleado = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLEADO_BY_ID_SQL)) {
            preparedStatement.setInt(1, idEmpleado);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre").toUpperCase();
                String apellidoPaterno = rs.getString("apellido_paterno").toUpperCase();
                String apellidoMaterno = rs.getString("apellido_materno").toUpperCase();
                String email = rs.getString("email").toUpperCase();
                String contrasena = rs.getString("contrasena");
                String rol = rs.getString("rol").toUpperCase();
                String telefono = rs.getString("telefono");
                empleado = new Empleado(nombre, apellidoPaterno, apellidoMaterno, email, contrasena, rol, telefono);
                empleado.setIdEmpleado(idEmpleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    // Obtener todos los empleados
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLEADOS_SQL)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idEmpleado = rs.getInt("id_empleado");
                String nombre = rs.getString("nombre").toUpperCase();
                String apellidoPaterno = rs.getString("apellido_paterno").toUpperCase();
                String apellidoMaterno = rs.getString("apellido_materno").toUpperCase();
                String email = rs.getString("email").toUpperCase();
                String contrasena = rs.getString("contrasena");
                String rol = rs.getString("rol").toUpperCase();
                String telefono = rs.getString("telefono");
                Empleado empleado = new Empleado(nombre, apellidoPaterno, apellidoMaterno, email, contrasena, rol, telefono);
                empleado.setIdEmpleado(idEmpleado);
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    // Eliminar un empleado por su ID
    public boolean borrarEmpleado(int idEmpleado) {
        boolean rowDeleted = false;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_EMPLEADO_SQL)) {
            statement.setInt(1, idEmpleado);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    // Actualizar un empleado
    public boolean actualizarEmpleado(Empleado empleado, int idEmpleado) {
        boolean rowUpdated = false;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLEADO_SQL)) {
            statement.setString(1, empleado.getNombre());
            statement.setString(2, empleado.getApellidoPaterno());
            statement.setString(3, empleado.getApellidoMaterno());
            statement.setString(4, empleado.getEmail());
            statement.setString(5, empleado.getPassword());
            statement.setString(6, empleado.getRol());
            statement.setString(7, empleado.getTelefono());
            statement.setInt(8,idEmpleado );
            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }
}





