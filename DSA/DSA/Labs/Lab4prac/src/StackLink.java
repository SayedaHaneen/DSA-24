public class StackLink {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static boolean Isempty()
    {
        return Head==null;
    }

    public static void Push(int data)
    {
        Node newnode= new Node(data);
        if(Isempty())
        {
            Head=newnode;
        }
        newnode.next=Head;
        Head=newnode;

    }

    public static int Pop()
    {
        if(Isempty())
        {
            System.out.println("empty bro");
            return -1;
        }
        int top = Head.data;
        Head=Head.next;
        return top;
    }

    public static int Peek()
    {
        if(Isempty())
        {
            System.out.println("empty bro");
            return -1;
        }
        return Head.data;
    }

    public static void main(String[] args) {
        StackLink s = new StackLink();
        s.Push(1);
        s.Pop();
        System.out.println(s.Isempty());
       /* System.out.println(s.Peek());
        System.out.println(s.Pop());
        System.out.println( s.Isempty());*/

       /* while(!s.Isempty())
        {
            System.out.println(s.Peek());
            s.Pop();
        }*/
    }


}
