

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HeaterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HeaterTest
{
    /**
     * Default constructor for test class HeaterTest
     */
    public HeaterTest()
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

    @Test
    public void testGetOperator()
    {
        Heater heater1 = new Heater();
        assertEquals(15, heater1.getTemperature(), 0.1);
    }

    @Test
    public void testWarmer()
    {
        Heater heater1 = new Heater();
        heater1.warmer();
        assertEquals(20, heater1.getTemperature(), 0.1);
    }

    @Test
    public void testCooler()
    {
        Heater heater1 = new Heater();
        heater1.cooler();
        assertEquals(10, heater1.getTemperature(), 0.1);
    }

    @Test
    public void testMax()
    {
        Heater heater1 = new Heater(5, 25);
        assertEquals(15, heater1.getTemperature(), 0.1);
        heater1.warmer();
        assertEquals(20, heater1.getTemperature(), 0.1);
        heater1.warmer();
        assertEquals(25, heater1.getTemperature(), 0.1);
        heater1.warmer();
        assertEquals(25, heater1.getTemperature(), 0.1);
    }
    
    @Test
    public void testChangeIncrement()
    {
        Heater heater = new Heater();
        heater.setIncrement(3);
        heater.warmer();
        assertEquals(18, heater.getTemperature(), 0.1);
    }
    
    @Test
    public void testMaxValueWithIncrement()
    {
        Heater heater = new Heater(10,20);
        heater.setIncrement(2);
        heater.cooler();//13
        heater.cooler();
        heater.cooler();
        assertEquals(11, heater.getTemperature(), 0.1);
    }
}




