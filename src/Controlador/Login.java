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

public class Login {

    public Login() {
    }
    
    public boolean buscarUsuario(String nombre, String pass){
        String query;
        ArrayList<Usuario> users = new ArrayList<>();
        try {
            Conexion coneX=new Conexion();
            Connection cnx=coneX.connection();
            query="SELECT nombre, contrasenna FROM USUARIO";
            PreparedStatement stmt=cnx.prepareStatement(query);
            //defino el elemento dónde recibiré el resultado del SELECT
            ResultSet rs=stmt.executeQuery();
            while (rs.next()){
                Usuario user = new Usuario();
                user.setNombre(rs.getString("nombre"));
                user.setContrasenna(rs.getString("contrasenna"));
                users.add(user);
            }
        }catch(SQLException e){
            System.out.println("Error SQL al listar el usuario: "+e.getMessage());
        }catch(Exception ex){
            System.out.println("Error al encontrar usuario:  "+ex.getMessage());
        }  
        for (Usuario user : users) {
            if (nombre.equals(user.getNombre()) && pass.equals(user.getContrasenna())){
                System.out.println("Login correcto");
                return true;
            }
        }
        return false;
    }
}