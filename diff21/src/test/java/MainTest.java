import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MainTest {
    @Test
    public void diff21lessThan21Test() { //expecting a diff (11)
        int actual = Main.diff21(10);
        assertEquals("Should be equal", 11, actual);
    }

    @Test
    public void diff21moreThan21Test() { //expecting double of 30-21=9, so, 18.
        int actual = Main.diff21(30);
        assertEquals("Should be equal", 18, actual);
    }
}
