/**
 * Created by deepdoradla on 15/03/2016.
 */

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

    Fizz fizz = new Fizz();

    @BeforeClass
    public void setUpBeforeClass()
    {
        //This method will run once before all the tests are initiated. All expensive processes go here

    }

    @Before
    public void setUpBeforeEachTest()
    {
        //This method will be used if there is any setup instructions like initiating variables etc

    }

    @Test
    public void testBuzz()
    {
        //Test for buzz
        String result = fizz.checkFizzBuzz(5);
        assertEquals("Buzz",result);

    }

    @Test
    public void testFizz()
    {
        //test for fizz
        String result = fizz.checkFizzBuzz(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void testFizzBuzz()
    {
        //test for fizz
        String result = fizz.checkFizzBuzz(15);
        assertEquals("FizzBuzz",result);
    }


}
