import com.andrewkravets.smartling.test.BeerCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BeerCalculatorTest {
    BeerCalculator beerCalculator;

    @Before
    public void init() {
        beerCalculator = new BeerCalculator();
    }

    @Test
    public void gotBeerTest() {

        assertTrue(beerCalculator.gotBeer(6, 3, 1));
        assertTrue(beerCalculator.gotBeer(3, 0, 1));
        assertTrue(beerCalculator.gotBeer(6, 3, 2));
        assertFalse(beerCalculator.gotBeer(7, 3, 1));
        assertFalse(beerCalculator.gotBeer(1, 0, 1));

    }
}
