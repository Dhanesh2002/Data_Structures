package listlinked;

import java.util.Scanner;

public class demo {
    public static void main(String[] args)
    {
        int choice = -1,element,position;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<Integer>();
        while (choice != 0) {
            System.out.println("\n\n0.exit \n1.instert at beginning\n2.insert at end \n3.insert at position \n4.display\n5.delete beginning\n6.delete at end \n7.delete at position\n8.reverse the list");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("enter element to insert");
                    element=sc.nextInt();
                    list.insertAtBeginning(element);
                    break;
                case 2:System.out.println("enter element to insert");
                    element=sc.nextInt();
                    list.insertAtEnd(element);

                    break;
                case 3:System.out.println("enter element to insert");
                    element=sc.nextInt();
                    System.out.println("enetr the position to insert");
                    position=sc.nextInt();
                    list.insertAtPosition(element,position);

                    break;
                case 4:
                    list.dislpay();
                    break;
                case 5:
                    list.deleteAtBeginning();
                    System.out.println("element deleted");
                    break;
                case 6:
                    list.deleteAtEnd();
                    System.out.println("element deleted");
                    break;
                case 7:
                    System.out.println("enter the position to delete");
                    position=sc.nextInt();
                    list.deleteAtPosition(position);
                    break;
                case 8:
                    list.reverseList();
                    break;
                default:
                    System.out.println("enter a valid choice");


            }
        }





    }
}
