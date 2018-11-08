package RegistroMusicaSwing;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoMusicaTest {
    
    public CalculoMusicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testClasificacion() 
    {
        System.out.println("clasificacion");
        String tipo = "pop";
        CalculoMusica instance = new CalculoMusica();
        String expResult = "Musica tipica de EU";
        String result = instance.clasificacion(tipo);
        assertEquals(expResult, result);
        if(!result.equals(expResult))
        {    
        fail("The test case is a prototype.");
        }
    }

  
    @Test
    public void testPrecioenvio() {
        System.out.println("costo envio");
        double precio = 5.0;
        CalculoMusica instance = new CalculoMusica();
        double expResult = 6.8;
        double result = instance.precioenvio(precio);
        assertEquals(expResult, result, 0.0);
        if(result != expResult)
        {    
        fail("The test case is a prototype.");
        }
    }
    
}
