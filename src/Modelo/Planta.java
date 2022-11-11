package Modelo;

/**
 *
 * @author Vicente
 */
public class Planta {
    protected int id_producto;
    protected String nombre,descripcion;
    protected char clasificacion;
    protected int precio;

    public Planta() {
    }

    public Planta(int id_producto, String nombre, String descripcion, char clasificacion, int precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(char clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
