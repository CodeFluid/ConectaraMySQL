package Source;

import java.sql.SQLException;

/**
 *
 * @author Unknown
 */
public class ConectaraMySQL {

    
    public static void main(String[] args) throws SQLException {
        ClaseConectar cc = new ClaseConectar();
        if(cc.conectar()!=null){
            System.out.println("Conexion Correcta");
            cc.cerrar();
        }else{
            System.out.println("Conexion Incorrecta");
        }
    }
    
}
