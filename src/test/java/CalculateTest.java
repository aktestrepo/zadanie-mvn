import org.junit.Assert;
import org.junit.Test;


/**
 * Created by akosinski on 2016-11-17.
 */
public class CalculateTest {

    @Test
    public void add() throws Exception {
        //given
        //when
        int actual = new Calculate().add(1, 2);

        //then
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void sub() throws Exception {
        //given
        //when
        int actual = new Calculate().sub(3, 2);

        //then
        Assert.assertEquals(actual, 1);
    }
}