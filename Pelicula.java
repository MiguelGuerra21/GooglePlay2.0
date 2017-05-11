
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
    
    public String getNombre(){
        return titulo;
    }
    
    public int getAno(){
        return anioSalida;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public String getTitulo(){
        return titulo;
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
    
    public double getPrecio(){
        double precioAMostrar = -1;
        if(getCalidad().equals("FullHD")){
            precioAMostrar = 10;
        }
        else{
            precioAMostrar = 5;
        }
        if(anioSalida < 2000){
            precioAMostrar = precioAMostrar/50;
        }
        vecesVendido++;
        return precioAMostrar;
    }
    
    public void comprado(){
        vecesVendido++;
    }
}
