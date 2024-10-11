class Stack
{
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility function to add an element x in the stack and check for stack overflow
    public void push(int x)
    {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Utility function to pop top element from the stack and check for stack underflow
    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Utility function to return top element in a stack
    public int top()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        System.out.println("Stack is empty");
        return -1;
    }

    // Utility function to return the size of the stack
    public int size()
    {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == -1;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull()
    {
        return top == capacity - 1;
    }
}
