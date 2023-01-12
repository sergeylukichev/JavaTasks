import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SleepInTest {

    @Test
    public void sleepInTest() {
        boolean actual = SleepIn.sleepIn(false, true);
        assertEquals("Should sleep", true, actual);
    }
}
