package circularLined;

import listlinked.LinkedList;

import java.util.Scanner;

public class circularLinkedListMain {
    public static void main(String[] args) {
        int choice = -1, element, position;
        Scanner sc = new Scanner(System.in);
        circularLinkedList<Integer> list = new circularLinkedList<Integer>();
        while (choice != 0) {
            System.out.println("\n\n0.exit \n1.insert at beginning\n2.insert at end  \n3.display\n4.delete beginning\n5.delete at end ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("enter element to insert");
                    element = sc.nextInt();
                    list.insertAtBeginning(element);
                    break;
                case 2:
                    System.out.println("enter element to insert");
                    element = sc.nextInt();
                    list.insertAtEnd(element, 0);

                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    list.deleteAtBeginning();
                    System.out.println("element deleted");
                    break;
                case 5:
                    list.deleteAtEnd();
                    System.out.println("element deleted");
                    break;
                default:
                    System.out.println("enter a valid choice");


            }


        }
    }
}

