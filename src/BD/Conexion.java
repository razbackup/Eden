package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Vicente, Jeremy
 */
public class Conexion {
    public boolean connection() throws ClassNotFoundException{
        Connection connect = null;
        String url,user,pass;
        url = "jdbc:mysql://localhost:3306/eden"; // Ruta de Conexion
        user = "root";
        pass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion exitosa");
            return true;
        }catch(SQLException ex){
            System.out.println(ex.getErrorCode());
        }
        return false;
    }
}
