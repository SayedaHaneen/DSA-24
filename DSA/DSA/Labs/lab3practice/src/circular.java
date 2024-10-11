public class circular {


    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
    Node head;
    public void addlast(int data)
    {
        Node newndoe =new Node(data);

        if(head==null)
        {
            head=newndoe;
            newndoe.next=head;
        }

        else{
            Node n=head;
            while(n.next!=head)
            {
                n=n.next;
                n.next=newndoe;
            }
        }



    }

    public static void main(String[] args) {
        circular cc = new circular();
        cc.addlast(56);
        cc.addlast(98);
        cc.addlast(89);
        cc.addlast(65);
    }


}
