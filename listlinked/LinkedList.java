package listlinked;


public class LinkedList<T>{
    class Node{
        T data;
        Node next; //reference
        Node(T data)
        {
            this.data=data;
            next=null;
        }
    }
     private Node head;

    LinkedList()
    {
        head=null;
    }
    public void insertAtBeginning(T val){
        Node newNode =new Node(val);
        if(head==null) {
            head = newNode;
        }
        else
        {
          newNode.next=head;
          head=newNode;
        }

    }
    public void dislpay()
    {
        if(head!=null)
        {
            Node tmp=head;
            while(tmp!=null)
            {
                System.out.println(tmp.data);
                tmp=tmp.next;

            }
        }
        else
            System.out.println("empty");
    }
    public void insertAtPosition(T val,int position)
    {
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        Node newNode=new Node(val);
        Node tmp=head;
        if(position==1)
        {
            insertAtBeginning(val);
            return;
        }
        for(int i=1;i<position;i++) {
            if (tmp == null) {
                System.out.println("position is out of limit");
                return;
            }
            tmp = tmp.next;
        }
        newNode.next=tmp.next;
        tmp.next=newNode;
    }
    public void insertAtEnd(T val)
    {
        if(head==null)
        {
            insertAtBeginning(val);
            return;
        }
        Node tmp=head;
        Node newNode=new Node(val);
        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }
        tmp.next=newNode;
    }
    public void deleteAtBeginning()
    {
        if(head!=null)
            head=head.next;
        else
            System.out.println("empty to delete");
    }
    public void deleteAtEnd()
    {
        if(head==null)
        {System.out.println("empty");
        return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node tmp=head;
        Node previous=tmp;
        while(tmp.next!=null) {
            previous=tmp;
            tmp = tmp.next;
        }
        previous.next=null;
        }
    public void deleteAtPosition(int position)
    {
        if(head==null)
        {
            System.out.println("list is empty");
           return;
             
        }
        if(position==1)
        {
            deleteAtBeginning();
            return;
        }
        Node tmp=head;
        Node previous=tmp;
        for(int i=1;i<position;i++)
        {
            if(tmp==null)
            {
                System.out.println("out of size");
                return;
            }
            previous=tmp;
            tmp=tmp.next;
        }
        previous.next=tmp.next;
    }
            public void reverseList()
            {
                Node previous=null;
                Node current=head;
                Node next;
                while(current!=null)
                {
                    next=current.next;
                    current.next=previous;
                    previous=current;
                    current=next;

                }
                  head=previous;

            }
}





