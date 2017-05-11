
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private String email;
    //private Producto[] productos;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String email)
    {
        this.email=email;
    }
    
    public String getNombreCuenta()
    {
        return email;
    }
}
