package algorithm.lib;

/**
 * Custom stack
 * push, pop, isEmpty, size, printStack
 */
public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }


    /**
     * Push an integer to stack. Exit when full
     * @param i the integer
     */
    public void push(int i) {
        if(isFull()) {
            System.out.println("The stack is full");
            System.exit(-1);
        }
        arr[++top] = i;
    }

    /**
     * Pops the top element in the stack
     * @return value the top value
     */
    public int pop() {
        if(isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return arr[top--];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
