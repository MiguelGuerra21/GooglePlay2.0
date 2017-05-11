
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
        int contador1 = 0;
        int contador2 = 0;
        boolean encontrado1 = false;
        boolean encontrado2 = false;
        while(contador1 < usuarios.length && encontrado1 == false){
            if(usuarios[contador1] != null && usuarios[contador1].getNombreCuenta().equals(emailComprador)){
                while(contador2 < productos.length && encontrado2 == false){
                    if(productos[contador2] != null && productos[contador2].getNombre().equals(idProducto)){
                        usuarios[contador1].comprarProducto(productos[contador2]);
                        precioMostrar = productos[contador2].getPrecio();
                        productos[contador2].comprado();
                        encontrado2 = true;
                    }
                    contador2++;
                }
                encontrado1 = true;
            }
            contador1++;
        }
        return precioMostrar;
    }
}
