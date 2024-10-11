public class Queue {
    public static class QueueArr {

        public static int[] arr;
        public static int size;
        public static int rear;
        public static int front;

        QueueArr(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public static boolean Isempty() {
            return rear == -1 && front == -1;
        }

        public static void Enqueue(int data) {
            if (Isfull()) {
                System.out.println("your array is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static boolean Isfull() {
            return (rear + 1) % size == front;
        }

        public static int Dequeue() {
            int result = arr[front];
            if (Isempty()) {
                System.out.println("empty nothing to delete");
                return -1;
            }
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int Peek() {
            if (Isempty()) {
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }


    }

    public static void main(String[] args) {


        QueueArr q = new QueueArr(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        System.out.println(q.Isempty());
        System.out.println(q.Isfull());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());

    }
}