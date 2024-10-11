class Nodes {
    int data;
    Nodes next;

    Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}

public class lenght {


    public static void main(String[] args) {
        lenght ll = new lenght();
        System.out.println("hello");
        ll.addfirst(56);
        ll.addfirst(56);
        ll.addfirst(89);
        ll.addfirst(58);
        System.out.println(ll.getLength());
    }
    Nodes head;

    public int getLength() {
        Nodes current = head;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }


    public void addfirst(int data)
    {
        Nodes addnode = new Nodes(data);
        if(head==null)
        {
            head= new Nodes(data);
        }
        head.next=addnode;
        head=addnode;


    }

}

