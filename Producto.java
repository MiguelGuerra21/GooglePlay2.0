
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    protected int vecesVendido;
    
    /**
     * Constructor for objects of class Producto
     */
    public Producto()
    {
        vecesVendido = 0;
    }
    
    public abstract String getNombre();
    
    public abstract double getPrecio();
    
    public abstract void comprado();
}
