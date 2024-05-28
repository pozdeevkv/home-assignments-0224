import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson02.NodImpl;


public class NodImplTest {

    NodImpl nod = new NodImpl();

    @Test(expected = IllegalArgumentException.class)
    public void calculateTwoZero() {
        nod.calculate(0, 0);
    }


    @Test(expected = IllegalArgumentException.class)
    public void calculateOneZero() {
        nod.calculate(0, 5);
    }


    @Test
    public void calculateMinus() {
        Assert.assertEquals(nod.calculate(-10, 2), 2);
    }

    @Test
    public void calculate3And22() {
        Assert.assertEquals(nod.calculate(3, 22), 1);
    }

    @Test
    public void calculate2And10() {
        Assert.assertEquals(nod.calculate(2, 10), 2);
    }
}
