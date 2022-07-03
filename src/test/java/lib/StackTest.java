package lib;

import static org.junit.Assert.*;
import org.junit.Test;
import algorithm.lib.Stack;

public class StackTest {
    @Test
    public void testPushingFullStack() {
        Stack myStack = new Stack(4);
        for(int i = 0; i < 4; i++) {
            myStack.push(i);
        }
        assertEquals(myStack.size(), 4);
    }
}
