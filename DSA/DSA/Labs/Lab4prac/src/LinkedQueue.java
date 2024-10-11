public class LinkedQueue {

    public static class Node{

        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public static boolean Isempty()
    {
        return head==null&&tail==null;
    }
    public static void Enqueue(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public static int Dequeue()
    {      int result = head.data;
        if(Isempty())
        {
            System.out.println("empty bro");
            return -1;
        }
        if(tail==head)
        {
            tail=head=null;
        }
        head=head.next;
        return result;

    }
    public static int peek()
    {
        if(Isempty())
        {
            System.out.println("empty bro");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {

        LinkedQueue l = new LinkedQueue();
        l.Enqueue(1);
        l.Enqueue(2);
        l.Enqueue(3);
        l.Enqueue(4);
        l.Enqueue(5);

        System.out.println(l.Isempty());
        System.out.println(l.Dequeue());
        System.out.println(l.Dequeue());
        System.out.println(l.peek());


    }

}
