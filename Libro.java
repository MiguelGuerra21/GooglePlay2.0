
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int numeroPaginas;
    private boolean ficcion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String titulo, int anio ,int numeroPag ,boolean ficcion)
    {
        super(titulo , anio);
        numeroPaginas = numeroPag;
        this.ficcion = ficcion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAno(){
        return anioSalida;
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public boolean getFiccion(){
        return ficcion;
    }
}
