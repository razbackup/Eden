package BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Vicente, Jeremy
 */
public class Conexion {
    public Connection connection(){
        Connection conexion=null;
        String url,user,password;
        
        //hago la inicialización de mis variables
        url="jdbc:mysql://localhost:3306/libreria";//mi base de datos
        user="root";
        password="";
        
        try
        {//cargar la clase controlador
            Class.forName("com.mysql.cj.jdbc.Driver");//Nombre del controlador JDBC
            //establecer la conexión a la BD [ruta de la BD , usuario por defecto, contraseña]
            conexion= DriverManager.getConnection(url,user,password);
            System.out.println("Conexión Exitosa");
        }catch(SQLException e){
            System.out.println("Error de BD: "+e.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
         return conexion;
    }
}
