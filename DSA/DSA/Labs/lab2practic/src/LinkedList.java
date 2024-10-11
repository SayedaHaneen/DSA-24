public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }


    }
    public void addfirst(int data)
    {
        Node node= new Node(data);
        if(Head ==null)
        {
            Head =tail=new Node(data);
            return;
        }
            node.next=Head;
        Head = new Node(data);
    }
    public void addlast(int data)
    {
        Node node= new Node(data);

        if(Head==null)
        {
            Head=tail=new Node(data);
            return;
        }
        tail.next=node;
        tail=node;

    }
    public void print()
    {
        Node temp =Head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int removefirst() {
        if(findSize()==0)
        {
            System.out.println("linked list is the empty");
            return Integer.MIN_VALUE;
        } else if (findSize()==1) {
            int val = Head.data;
            Head=tail=null;
            return val;
        }
        int val = Head.data;
        Head=Head.next;
        return val;

    }

    public int removelast()
    {
        if(findSize()==0)
        {
            System.out.println("empty linked list");
            return Integer.MIN_VALUE;
        } else if (findSize()==1) {
            int val =Head.data;
            Head=tail=null;
            return val;
        }

       Node prev = Head;
        for(int i =0;i<findSize()-2;i++)
        {
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        return val;


    }
  /*  public void search()
    {

    }*/
    public int findSize()
    {

        Node current = Head;
        int count =0;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;

    }





    public static Node Head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       /* ll.Head = new Node(2);
        ll.Head.next=new Node(5);*/
        ll.addfirst(45);
        ll.addfirst(95);
        ll.addlast(54);
        ll.addlast(85);
        System.out.println();
        ll.removefirst();
        ll.removelast();
        System.out.println(ll.findSize());
        ll.print();



    }

}
