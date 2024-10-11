class CircularTail {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Display the list
    public void display() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Delete a node
    public void delete(int key) {
        if (head == null) return;

        Node current = head, prev = null;

        // If the node to be deleted is the head
        if (current.data == key) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            return;
        }

        // Search for the node to be deleted
        do {
            prev = current;
            current = current.next;
        } while (current != head && current.data != key);

        // If the node was not found
        if (current == head) return;

        // Unlink the node
        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }
    }

    // Search for a node
    public boolean search(int key) {
        if (head == null) return false;
        Node current = head;
        do {
            if (current.data == key) return true;
            current = current.next;
        } while (current != head);
        return false;
    }
}
