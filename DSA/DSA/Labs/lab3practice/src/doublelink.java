public class doublelink {
    public class Node {
        String name ;
        Node next;
        Node prev;
        Node(String name)
        {
            this.name=name;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;
    public void insertFirst(String name )
    {
        Node newnode = new Node(name)
                if(head == null )
                {
                    head=newnode;
                    head.next=null;
                    head.prev=null;
                }
                else{
                    newnode.next=head;
                    newnode.prev=head.prev;
                    head.prev=newnode;
                    head=newnode;
                }
    }
    public void insertFirstOb(Node node)
    {
        if(head==null)
        {
            head=node;
            head.prev=head;
            head.next=head;

        }
        else{
            node.next=head;
            node.prev=head.prev;
            head.prev.next=node;
            head.prev=node;
            head=node;
        }

    }
    public void insertEnd(String name)
    {
        Node newnode = new Node(name);
        if(head==null)
        {
            head=newnode;
            head.prev=head;
            head.next=head;
        }
        else{
            newnode.prev=head.prev;
            newnode.next=head;
            head.prev.next=newnode;
            head.prev=newnode;
        }

    }
    public void insertEndOb(Node node)
    {
        if(head==null)
        {
            head=node;
            head.prev=head;
            head.next=head;
        }
        else{
            node.prev=head.prev;
            node.next=head;
            head.prev.next=node;
            head.prev=node;
        }


    }
    public void insertaftername(String name, Node node)
    {
        Node current =head;
        do {
            if(current.name.equals(name))
            {
                node.prev=current;
                node.next=current.next;
                current.next.prev=node;
                current.next=node;
                return;
            }
            current =current.next;

        }while(current!=head);
    }
    public void insertbeforename(String name , Node node)
    {
        Node temp = head;
        while (temp != null && !temp.name.equals(name)) {
            temp = temp.next;
        }
        if (temp != null) {
            node.prev = temp.prev;
            node.next = temp;
            if (temp.prev != null) {
                temp.prev.next = node;
            } else {
                head = node;
            }
            temp.prev = node;


        }
    public void makecircular()
    {
        if (head == null)
        {
            return;
        }
        Node Temp = head;
        while (Temp.next != null) {
            Temp = Temp.next;
        }
        Temp.next = head;
        head.prev = Temp;
    }
    public void printall()
    {
        if (head == null)
        {return;}
        Node TTemp = head;
        do {
            System.out.print(TTemp.name + " ");
            TTemp = TTemp.next;
        } while (TTemp != head);
        System.out.println();
    }

    }

    public static void main(String[] args) {

        doublelink list = new doublelink();
        list.insertFirst("Node1");
        list.insertEnd("Node2");
        list.insertEnd("Node3");
        list.insertaftername("Node1", new Node("Node1.5"));
        list.insertbeforename("Node3", new Node("Node2.5"));
        list.makecircullar();
        list.printall();

    }


}