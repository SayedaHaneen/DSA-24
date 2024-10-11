class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }

}
public class LinkedReverse {

    Node Head;
    public void reverse()
    {
        Node prev = null;
        Node curr= Head;
        Node next= null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head= prev;


    }


    public void Print()
    {
        Node temp = Head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        LinkedReverse ll = new LinkedReverse();
        ll.Head=new Node(1);
        ll.Head.next = new Node(2);
        ll.Head.next.next= new Node(3);

        ll.Print();
        ll.reverse();
        System.out.println();
        ll.Print();

    }

}
