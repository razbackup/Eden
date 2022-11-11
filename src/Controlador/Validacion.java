package Controlador;
public class Validacion {
    public boolean validName(String nombre){
        if (nombre.length() < 1 || nombre.length() > 25){
            return false;
        }
        return true;
    }
}
