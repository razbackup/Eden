package Modelo;
import BD.Conexion;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Conexion connect = new Conexion();
        System.out.println(connect.connection());
    }
}
