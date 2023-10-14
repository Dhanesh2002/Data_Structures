import java.util.*;
//array_list_dynamic
class array {
    int size;
    int capacity;
    int[] arr;

    array() {
        size = 0;
        capacity = 3;
        arr = new int[capacity];
    }

    public void add(int element) {
        if(size==capacity-1)
            size_expand();
        arr[size++] = element;
        System.out.println("element inserted");
    }
    public void add(int element,int position)
    {
        arr[position]=element;
        System.out.println("element inserted");
    }

    public void display() {

        if (size == 0) {
            System.out.println("no elements in array");
        } else {
            System.out.println("elements are :");
            for (int i = 0; i < size; i++) {

                System.out.print(arr[i] + " ");
            }
        }
    }

    public void deletee() {
        if (size == 0)
            System.out.println("array is empty");
        else {
            size--;
            System.out.println("element deleted");
        }
        }
        public void size_expand()
        {
         capacity=capacity*2;
         arr=java.util.Arrays.copyOf(arr,capacity);
         System.out.println("capacity increased "+capacity);
        }
        public void delete_position(int position)
        {
            if(size==0||position>size)
                System.out.println("array is empty or out of size");
            else
            {
                for(int i=position;i<size;i++)
                    arr[i]=arr[i+1];
                System.out.println("element deleted!");
                size--;
            }
        }
        public void insert_position(int position)
        {
            if(position>size)
            {
                System.out.println("it is not a valid position");
                return;
            }
            for(int i=size;i>=position;i--)
                arr[i+1]=arr[i];
            size++;

        }

    }

    public class ArrayList {

        public static void main(String[] args) {
            int choice = -1, element,position;
            array obj1 = new array();

            Scanner sc = new Scanner(System.in);
            while (choice != 0) {
                System.out.println("\n\n0.exit \n1.instert at end\n2.delete at end\n3.print all elements\n4.dellete at position\n5.insert at position");
                choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        System.out.println("enter the element to insert ");
                        element = sc.nextInt();
                        obj1.add(element);
                        break;
                    case 2:
                        obj1.deletee();
                        break;
                    case 3:
                        obj1.display();
                        break;
                    case 4:
                        System.out.println("enter position to delete");
                        position=sc.nextInt();
                        obj1.delete_position(position);
                        break;
                    case 5:
                        System.out.println("enter position to enter");
                        position=sc.nextInt();
                        obj1.insert_position(position);
                        System.out.println("enter element to insert");
                        element=sc.nextInt();
                        obj1.add(element,position);
                        break;
                    default:
                        System.out.println("enter a valid choice");


                }
            }
        }
    }

