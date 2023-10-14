package DoublyLinkedList;

import listlinked.LinkedList;

import java.util.Scanner;

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        int choice = -1, element, position;
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        while (choice != 0) {
            System.out.println("\n\n0.exit \n1.instert at beginning\n2.insert at end \n3.insert at position \n4.display Front\n5.display from back\n6.delete at Start \n7.delete at end\n8.deleter at position");
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
                    list.insertAtEnd(element);

                    break;
                case 3:
                    System.out.println("enter element to insert");
                    element = sc.nextInt();
                    System.out.println("enetr the position to insert");
                    position = sc.nextInt();
                    list.insertAtPosition(element, position);

                    break;
                case 4:
                    list.displayFront();
                    break;
                case 5:
                    list.displayReverse();
                    break;
                case 6:
                    list.deleteAtBeginning();
                    break;

                case 7:
                    list.deleteAtEnd();
                    break;
                case 8:
                     System.out.println("enter the position to delete");
                     position = sc.nextInt();
                     list.deleteAtPosition(position);
                     break;
                default:
                    System.out.println("enter a valid choice");


            }
        }
    }
}