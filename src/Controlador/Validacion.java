package Controlador;
public class Validacion {
    public boolean validName(String nombre){
        return nombre.length() > 0 && nombre.length() < 25;
    }
    public boolean validNamePlanta(String name){
        return name.length() > 1 && name.length() < 50;
    }
    
    public boolean validPrecio(int precio){
        return precio > 0;
    }
    
    public boolean validStock(int stock){
        return stock > -1;
    }
    
    public boolean validDesc(String desc){
        return desc.length() > 0 && desc.length() < 1000;
    }
}
