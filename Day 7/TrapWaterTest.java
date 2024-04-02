import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrapWaterTest {

    @Test
    public void testTrapWater() {
        TrapWater trapWater = new TrapWater();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, trapWater.trap(height));
    }

    @Test
    public void testTrapWaterEmptyArray() {
        TrapWater trapWater = new TrapWater();
        int[] height = {};
        assertEquals(0, trapWater.trap(height));
    }

    @Test
    public void testTrapWaterNoWaterTrapped() {
        TrapWater trapWater = new TrapWater();
        int[] height = {1, 2, 3, 4, 5};
        assertEquals(0, trapWater.trap(height));
    }

    @Test
    public void testTrapWaterAllWaterTrapped() {
        TrapWater trapWater = new TrapWater();
        int[] height = {5, 4, 3, 2, 1};
        assertEquals(0, trapWater.trap(height));
    }
}
