
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class LinkedList {
        Node head;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public int search(int key) {
            Node current = head;
            int index = 0;
            while (current != null) {
                if (current.data == key) {
                    return index; // Return the index of the found element
                }
                current = current.next;
                index++;
            }
            return -1; // Element not found
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.add(45);
            ll.add(54);
            System.out.println(ll.search(54));
        }
    }


