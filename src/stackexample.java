import javax.swing.*;
import java.util.*;
class stackexample {
    public static void main(String[] args) {
        Stack st=new Stack(3);
       st.push(10);
       st.push(20);
       st.push(30);
       st.peek();
       st.display();
       st.pop();
    }
}
class Stack {
    int arr[];
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = val;
            System.out.println("inserted elemts are=" + arr[top]);
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("peek value is " + arr[top]);
        }
    }

    void display()

    {
        if (top == -1) {
            System.out.println("[]");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("array elements="  +arr[i]);
            }
        }
    }
    void pop()
    {
        if (top == -1) {
            System.out.println("under flow");
        }
        else
            top--;
    }
}
