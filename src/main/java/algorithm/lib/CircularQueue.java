package algorithm.lib;

/**
 * Implementation of Circular queue
 * Application: CPU scheduling, memory management, Traffic management
 */
public class CircularQueue {
   int capacity;
   int front;
   int rear;
   int[] arr;

   public CircularQueue(int capacity) {
       this.capacity = capacity;
       this.arr = new int[capacity];
       front = -1;
       rear = -1;
   }

   public void enqueue(int e) {
       if(isFull()) {
           System.out.println("Circular queue is full");
           System.exit(-1);
       } else {
           if (front == -1) {
               front = 0;
           }
           rear = (rear + 1) % capacity;
           arr[rear] = e;
       }
   }

    // Removing an element
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % capacity;
            }
            return (element);
        }
    }

   private boolean isFull() {
       if(front == 0 && rear == capacity - 1) {
           return true;
       }
       return front == rear + 1;
   }

   private boolean isEmpty() {
       return front == -1;
   }
}
