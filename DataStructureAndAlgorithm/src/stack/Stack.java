package stack;


public class Stack {

    /*
    Operations in Stack
    1. Push: Add an item in the stack
    2. Pop: Removes the item from stack
    3. Peek: Returns the top element
    4. isEmpty: Returns true if the stack is empty
    5. isFull: Returns true if the stack is full
     */
    public static final int MAX_SIZE = 100;
    int[] arr;
    int top = -1;

    Stack() {
        // initialize the array
        arr = new int[MAX_SIZE];
    }

    boolean isEmpty() {
        // check if the stack is empty
        return top == -1;
    }

    boolean isFull() {
        // check if the stack has reached the max limit
        return top == MAX_SIZE - 1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        // increment the counter and then push the element
        ++top;
        arr[top] = x;
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        int x = arr[top];
        // decrement the top counter as we
        // have popped the element from stack
        top--;
        return x;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(70);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
