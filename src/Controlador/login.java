/**
 *
 * @author Vicente Vasquez
 */
package Controlador;
import BD.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class login {
    public boolean buscarUsuario(String nombre){
        String query;
        ArrayList<Usuario> users = new ArrayList<>();
        try
        {
            Conexion coneX=new Conexion();
            Connection cnx=coneX.connection();
            query="SELECT nombre, contrasenna FROM USUARIO";
            PreparedStatement stmt=cnx.prepareStatement(query);
            //defino el elemento dónde recibiré el resultado del SELECT
            ResultSet rs=stmt.executeQuery();
            while (rs.next()){
                Usuario user = new Usuario();
                user.setNombre(rs.getString("nombre"));
                user.setContrasenna(rs.getString("constrasenna"));
            }
        }catch(SQLException e){
            System.out.println("Error SQL al listar libro: "+e.getMessage());
        }catch(Exception ex){
            System.out.println("Error al listar libro: "+ex.getMessage());
        }  
        return true;
    }
}
