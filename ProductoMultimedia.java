
/**
 * Write a description of class Multimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    protected String titulo;
    protected int anioSalida;
    
    /**
     * Constructor for objects of class Multimedia
     */
    public ProductoMultimedia(String titulo ,int anio)
    {
        super();
        this.titulo = titulo;
        anioSalida = anio;
    }
    
    public abstract String getNombre();
    
    public abstract int getAno();
    
    public abstract String getTitulo();
    
    public abstract double getPrecio();
    
    public abstract void comprado();
}
