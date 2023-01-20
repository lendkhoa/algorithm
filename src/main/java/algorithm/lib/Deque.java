package algorithm.lib;

/**
 * Deque is a type of queue that allows insertion and removal of elements at front and rear
 * There are two types of deque:
 * + Input restricted deque: input at a single end but allow deletion at both ends
 * + Output restricted deque: output at a single end but allow input at both ends
 */

public class Deque {
    int[] array;
    int front;
    int rear;
    int size;

    public Deque(int size) {
        this.size = size;
        array = new int[size];
        front = -1;
        rear = 0;
    }

    public void insertFront(int element) {
        if(isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        array[front] = element;
    }

    void insertrear(int key) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        else if (rear == size - 1)
            rear = 0;

        else
            rear = rear + 1;

        array[rear] = key;
    }

    void deletefront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    void deleterear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    private boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    private boolean isEmpty() {
        return (front == -1);
    }


    int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return array[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return array[rear];
    }


    public void printDeque() {
        System.out.println("\n Front index: " + front);
        System.out.println("\n Rear index: " + rear);
        for(int i: array) {
            System.out.print(i + " ");
        }
    }
}
