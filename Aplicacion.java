
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    private String nombre;
    private double espacioQueOcupa;
    private Categoria categoria;

    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre ,double espacioQueOcupa ,Categoria categoria)
    {
        super();
        this.nombre = nombre;
        this.espacioQueOcupa = espacioQueOcupa;
        this.categoria = categoria;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getTamanoEnMB(){
        return espacioQueOcupa;
    }
    
    public String getCategoria(){
        String categoriaAMostrar = "";
        switch(categoria){
            case JUEGOS :
                categoriaAMostrar = "Juegos";
                break;
            case COMUNICACIONES:
                categoriaAMostrar = "Comunicaciones";
                break;
            case PRODUCTIVIDAD:
                categoriaAMostrar = "Productividad";
            case MULTIMEDIA:
                categoriaAMostrar = "Multimedia";
                break;
        }
        return categoriaAMostrar;
    }
    
    public double getPrecio(){
        double precioAMostrar = 0.99;
        if(vecesVendido >= 2){
            switch(categoria){
                case JUEGOS:
                    precioAMostrar = 5.00;
                    break;
                case PRODUCTIVIDAD:
                    precioAMostrar = 10.00;
                    break;
                case COMUNICACIONES:
                    precioAMostrar = 2.00;
                    break;
                case MULTIMEDIA:
                    precioAMostrar = 2.00;
                    break;
            }
        }
        return precioAMostrar;
    }
    
    public void comprado(){
        vecesVendido++;
    }
}
