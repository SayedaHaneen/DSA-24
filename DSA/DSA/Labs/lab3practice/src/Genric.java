class SinglyNode<T> {
    T data;
    SinglyNode<T> next;

    SinglyNode(T data) {
        this.data = data;
        this.next = null;
    }
}


class SinglyLinkedList<T> {
    private SinglyNode<T> head;

    public void add(T data) {
        SinglyNode<T> newNode = new SinglyNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            SinglyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        SinglyNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void delete(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        SinglyNode<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

// Node class for doubly linked list
class DoublyNode<T> {
    T data;
    DoublyNode<T> next;
    DoublyNode<T> prev;

    DoublyNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Doubly linked list class
class DoublyLinkedList<T> {
    private DoublyNode<T> head;

    public void add(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void display() {
        DoublyNode<T> current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void delete(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        DoublyNode<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                return;
            }
            current = current.next;
        }
    }
}
