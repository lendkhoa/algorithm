package algorithm.twoPointers;

import static org.junit.Assert.*;

import org.junit.Test;
public class TrapWaterTest {
    @Test
    public void trapWaterTest1() {
        TrapWater problem = new TrapWater();
        int[] crossSection = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, problem.maxVolume(crossSection));
    }
}
