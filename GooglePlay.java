
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private Usuario[] usuarios;
    private Producto[] productos;
    private int indexUsuarios;
    private int indexProductos;
    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new Usuario[10];
        productos = new Producto[10];
        indexUsuarios = 0;
    }
    
    public void addUsuario(Usuario usuarioElegido)
    {
        usuarios[indexUsuarios] = usuarioElegido;
        indexUsuarios++;
    }
    
    public void addProducto(Producto productoElegido){
        productos[indexProductos] = productoElegido;
        indexProductos++;
    }
    
    public int getNumeroUsuarios(){
        int usuariosTotales = 0;
        for(Usuario usuario : usuarios){
            if(usuario != null){
                usuariosTotales++;
            }
        }
        return usuariosTotales;
    }
    
    public int getNumeroProductos(){
        int productosTotales = 0;
        for(Producto producto : productos){
            if(producto != null){
                productosTotales++;
            }
        }
        return productosTotales;
    }
    
    public double comprar(String emailComprador ,String idProducto){
        double precioMostrar = -1;
        for(Usuario usuario : usuarios){
            if(usuario != null && usuario.getNombreCuenta().equals(emailComprador)){
                for(Producto producto : productos){
                    if(producto != null && producto.getNombre().equals(idProducto)){
                        usuario.comprarProducto(producto);
                        precioMostrar = producto.getPrecio();
                        producto.comprado();
                    }
                }
            }
        }
        return precioMostrar;
    }
}
