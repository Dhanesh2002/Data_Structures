package circularLined;

public class circularLinkedList<T> {
    Node head;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    circularLinkedList() {
        head = null;
    }

    public void insertAtEnd(T val, int c) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            Node tmp = head;
            while (tmp.next != head)
                tmp = tmp.next;
            tmp.next = newnode;
            newnode.next = head;
            if (c == 1)
                head = newnode;
        }
    }

    public void insertAtBeginning(T val) {
        insertAtEnd(val, 1);

    }

    public void display() {
        if (head == null)
            System.out.println("list is empty");
        else {
            Node tmp = head;
            System.out.println(tmp.data);
            while (tmp.next != head) {
                tmp = tmp.next;
                System.out.println(tmp.data);
            }
        }
    }

    public void deleteAtBeginning() {
        if (head == null)
            System.out.println("list is empty");
        else if (head.next == head)
             head = null;
         else {
            Node tmp = head;
            while (tmp.next != head) {
                tmp = tmp.next;
            }
            head = head.next;
            tmp.next = head;
        }
        }
        public void deleteAtEnd(){
            if (head == null)
                System.out.println("list is empty");
            else if (head.next == head)
                head = null;
            else{
                Node tmp=head;
                while(tmp.next.next!=head)
                    tmp=tmp.next;
                tmp.next=head;
            }

        }
    }
