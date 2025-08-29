import java.util.*;

class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();
        q.display();
        q.dequeue();
        q.display();
    }
}

class Queue {
    int arr[];
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    void enqueue(int val) {
        if (rear == size) {
            System.out.println("Queue is full");
        } else {
            arr[rear++] = val;
            System.out.println("Inserted element: " + val);
        }
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Removed element: " + arr[front]);
            // Shift elements to the left
            for (int i = 0; i < rear - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }
    }

    void peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Peek value is: " + arr[front]);
        }
    }

    void display() {
        if (front == rear) {
            System.out.println("[]");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
