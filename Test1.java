

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test1
{
    private GooglePlay googlePl1;
    private Usuario usuario1;
    private Libro libro1;
    private Aplicacion aplicaci1;

    /**
     * Default constructor for test class Test
     */
    public Test1()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        googlePl1 = new GooglePlay();
        usuario1 = new Usuario("mikirati@hotmail.es");
        libro1 = new Libro("no culpes al karma", 2017, 79, false);
        aplicaci1 = new Aplicacion("spotify", 23.2, Categoria.MULTIMEDIA);
        googlePl1.addProducto(libro1);
        googlePl1.addProducto(aplicaci1);
        googlePl1.addUsuario(usuario1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
