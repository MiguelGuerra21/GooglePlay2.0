
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    private int duracion;
    private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo, int anio ,int duracion ,int calidad)
    {
        super(titulo , anio);
        this.duracion = duracion;
        this.calidad = calidad;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getAno(){
        return anioSalida;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public String getCalidad(){
        String calidadAMostrar = "";
        switch(calidad){
            case 1080:
                calidadAMostrar = "FullHD";
                break;
            default:
                calidadAMostrar = "HD";
                break;
        }
        return calidadAMostrar;
    }
}
