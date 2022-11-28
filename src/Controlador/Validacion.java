package Controlador;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Validacion {

    public boolean validName(String nombre) {
        return nombre.length() > 0 && nombre.length() < 25;
    }

    public boolean validNamePlanta(String name) {
        return name.length() > 1 && name.length() < 50;
    }

    public boolean validPrecio(int precio) {
        return precio > 0;
    }

    public boolean validStock(int stock) {
        return stock > -1;
    }

    public boolean validDesc(String desc) {
        return desc.length() > 0 && desc.length() < 1000;
    }

    public boolean comprobarSiExiste(String id_planta) {
        String query;
        try {
            Conexion coneX = new Conexion();
            Connection cnx = coneX.connection();
            query = "SELECT id_planta FROM PLANTA WHERE id_planta = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, id_planta);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
            stmt.close();
            cnx.close();
            return true;
            }else{
            stmt.close();
            cnx.close();
            return false;}      
        } catch (SQLException e) {
            System.out.println("Error SQL:" + e.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
            return false;
        }
    }
}
