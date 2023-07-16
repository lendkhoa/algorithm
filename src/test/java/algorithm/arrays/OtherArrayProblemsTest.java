package algorithm.arrays;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class OtherArrayProblemsTest {
    @Test
    public void containsDuplicateTest1() {
        OtherArrayProblems agent = new OtherArrayProblems();
        int[] nums = new int[]{1,2,3,1};
        assertEquals(true, agent.containsDuplicateHashSet(nums));
    }

    @Test
    public void containsDuplicateTest2() {
        OtherArrayProblems agent = new OtherArrayProblems();
        int[] nums = new int[]{1,2,3,4};
        assertEquals(false, agent.containsDuplicateHashSet(nums));
    }

    @Test
    public void containsDuplicateTest3() {
        OtherArrayProblems agent = new OtherArrayProblems();
        int[] nums = new int[]{-1, 3, 5, 9, 0, -1};
        assertEquals(true, agent.containsDuplicateHashSet(nums));
    }

    @Test
    public void containsDuplicateTest4() {
        OtherArrayProblems agent = new OtherArrayProblems();
        int[] nums = new int[]{-1, 3, 5, 9, 0, -1};
        assertEquals(true, agent.containsDuplicateSort(nums));
    }
}
