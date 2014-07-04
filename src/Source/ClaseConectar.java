package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Unknown
 */
public class ClaseConectar { 

    private Connection conn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nombrebasededatos", "Usuario", "Contraseña");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conn;
    }
    
    public void cerrar() throws SQLException{
        conectar().close();
    }
}
