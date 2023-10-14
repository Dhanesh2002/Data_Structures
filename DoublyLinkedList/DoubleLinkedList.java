package DoublyLinkedList;

public class DoubleLinkedList {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node previous;
        Node(int val)
        {
            data=val;
            next=null;
            previous=null;
        }

    }
    DoubleLinkedList()
    {
        head=null;
        tail=null;
    }
    public void insertAtBeginning(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            head.previous=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertAtEnd(int val){

        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.previous=tail;
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void insertAtPosition(int val,int position)
    {
        Node newnode=new Node(val);
        if(position==1)
        {
            insertAtBeginning(val);
            return;
        }
        else{
            Node tmp=head;
            for( int i=2;i<position;i++){
                tmp=tmp.next;
                if(tmp==null) {
                    System.out.println("wrong position");
                    return;
            }
            }
            /*if(tmp==head){
                insertAtBeginning(val);
                return;
            }*/
            if(tmp==tail)
            {
                insertAtEnd(val);
                return;
            }
            System.out.println("i val:"+tmp.data);
            newnode.next=tmp.next;
            newnode.previous=tmp;
            tmp.next=newnode;
            tmp=newnode.next;
            tmp.previous=newnode;


        }

    }
    public void displayFront()
    {
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        Node tmp=head;
        int i=1;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }
    public void displayReverse(){
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        System.out.println("elements in reverse");
        Node tmp=tail;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.previous;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        else{
            tail=tail.previous;
            tail.next=null;
        }

    }
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
         if(head==tail){
            head=null;
            tail=null;
            return;
        }
         head=head.next;
         head.previous=null;
    }
    public void deleteAtPosition(int position)
    {
        if(head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        if(position==1){
            deleteAtBeginning();
            return;
        }
        else{
            Node tmp=head;
            Node prev=tmp;

            for(int i=1;i<position;i++)
            {
                prev=tmp;
              tmp=tmp.next;
              if(tmp==null)
              {
                  System.out.println("out of size");
                  return;
              }
            }
            if(tmp==tail)
            {
                deleteAtEnd();
                return;
            }
            prev.next=tmp.next;
            tmp=tmp.next;
            tmp.previous=prev;



        }


    }
}
