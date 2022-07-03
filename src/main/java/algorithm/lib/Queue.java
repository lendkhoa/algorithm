package algorithm.lib;

/**
 * Implementation of a Queue
 * Enqueue, dequeue, isEmpty, isFull, Peek
 */
public class Queue {

    private int[] arr;
    int front = -1;
    int rear = -1;
    int capacity = 0;

    public Queue(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    /**
     * Check if the queue is full. If not add the new element to queue
     * @param i the new element to add
     */
    public void enqueue(int i) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            arr[rear] = i;

            System.out.println("Inserted " + i);
        }
    }

    /**
     * Check if the queue is empty. If not return the value pointed by front
     * @return value: the value pointed by the front index
     */
    public int dequeue() {
        int element;
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = arr[front];
            if(front >= rear) {
                front = -1;
                rear = -1;
                // queue only has one element, reset after remove
            } else {
                front+=1;
            }
        }
       return element;
    }

    private boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    private boolean isEmpty() {
        return front == -1;
    }
}
