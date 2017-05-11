
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private String email;
    private Producto[] productos;
    private int index;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String email)
    {
        this.email=email;
        productos = new Producto[10];
        index = 0;
    }
    
    public String getNombreCuenta()
    {
        return email;
    }
    
    public void comprarProducto(Producto productoAComprar){
        productos[index] = productoAComprar;
        index++;
    }
}
