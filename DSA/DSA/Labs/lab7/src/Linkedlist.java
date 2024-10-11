public class Linkedlist {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next= null;
        }
    }
    static Node Head;

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.Head = new Node(1);
        list.Head.next= new Node(2);
        list.Head.next.next = new Node(3);
        list.Head.next.next.next = new Node(4);
        list.Head.next.next.next.next = new Node(5);

        Linkedlist.comparetime();




    }

    public static void printlinkedlistiterative()
    {
        Node temp = Head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printlinkedlistRecursive(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.data);
        printlinkedlistRecursive(node.next);
    }
    public static void comparetime()
    {
        long startTime, endTime;

        // Time for iterative approach
        startTime = System.nanoTime();
        printlinkedlistiterative();
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        // Time for recursive approach
        startTime = System.nanoTime();
        printlinkedlistRecursive(Head);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        System.out.println("Time taken by iterative approach: " + iterativeTime + " ns");
        System.out.println("Time taken by recursive approach: " + recursiveTime + " ns");

    }


}
