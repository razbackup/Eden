package Modelo;

/**
 *
 * @author Vicente
 */
public class Planta {

    private int id_producto;
    private String nombre, descripcion;
    private int clasificacion;
    private int precio, stock, cantidad;
    private String nombre_clasi;

    public Planta(int cantidad, String nombre_clasi) {
        this.cantidad = cantidad;
        this.nombre_clasi = nombre_clasi;
    }

    public Planta() {
    }

    public Planta(int id_producto, String nombre, String descripcion, char clasificacion, int precio, int stock) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_clasi() {
        return nombre_clasi;
    }

    public void setNombre_clasi(String nombre_clasi) {
        this.nombre_clasi = nombre_clasi;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public void kill_id_Planta(Planta planta){
        planta.setId_producto(-99);
    }

}
