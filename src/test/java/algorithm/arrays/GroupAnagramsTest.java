package algorithm.arrays;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class GroupAnagramsTest {
    @Test
    public void test1() {
        GroupAnagrams task = new GroupAnagrams();
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> actual = task.groupAnagrams(input);
        List<List<String>> expected = Arrays.asList(
            Arrays.asList("bat"),
            Arrays.asList("nat", "tan"),
            Arrays.asList("ate", "eat", "tea"));
        expected.sort((list1, list2) -> String.join("", list1).compareTo(String.join("", list2)));
        actual.sort((list1, list2) -> String.join("", list1).compareTo(String.join("", list2)));
        assertEquals(expected, actual);
    }
}
