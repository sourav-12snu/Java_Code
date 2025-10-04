import java.util.Scanner;

public class DoublyLL {

    class Node{
        int value;
        Node next;
        Node previous;
        Node(int value){
            this.value=value;
            this.next=null;
            this.previous=null;
        }

    }

    private Node head;





    public void insertAtHead(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }
        else {
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
    }





    public void insertAtTail(int value){
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.previous=temp;
    }





    private void insertAtPosition(int value,int position){
        if (position<=0){
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(value);

        if (position==1){
            insertAtTail(value);
            return;
        }

        Node temp = head;
        for (int i =0;i<=position-1&&temp!=null;i++){
            temp=temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }
        newNode.next=temp.next;
        newNode.previous=temp;
        if (temp.next!=null){
            temp.next.previous=newNode;
        }
        temp.next=newNode;


    }





    public void deleteAtBeginning(){
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
       head=head.next;
        if (head!=null){
            head.previous=null;
        }
    }





    public void deleteAtEnd(){
        if (head==null){
            System.out.println("List is empty!");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node temp = head;
        while (temp!=null){
            temp=temp.next;
        }
        temp.previous.next=null;
    }





public void deleteAtPosition(int index){
        if(index<=0||head==null){
            System.out.println("Invalid position or list is Empty");
            return;
        }

        if (index==1){
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 1;i<=index&&temp!=null;i++){
            temp=temp.next;
        }
        if (temp == null){
            System.out.println("Position out of range");
            return;
        }
        if (temp.next!=null){
            temp.next.previous=temp.next;

        }
        if (temp.previous!=null){
            temp.previous.next=temp.next;
        }

}





public void displayForward(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value);
            if (temp.next!=null){
                System.out.print(" <-> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }





    public void displayBackward(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        System.out.print("Backward: ");
        while (temp!=null){
            System.out.println(temp.value+" ");
            temp=temp.previous;
        }
        System.out.println();
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoublyLL dll = new DoublyLL();
        while (true){
            System.out.println("1.Insert At Head");
            System.out.println("2.Insert At Tail");
            System.out.println("3.Insert At Given Position");
            System.out.println("4.Delete At Beginning");
            System.out.println("5.Delete At End");
            System.out.println("6.Delete At Given Position");
            System.out.println("7.Display Forward ");
            System.out.println("8.Display Backward ");
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter data");
                    int val1 = sc.nextInt();
                    dll.insertAtHead(val1);
                    break;

                case 2:

                    System.out.println("Enter data");
                    int val2 = sc.nextInt();
                    dll.insertAtTail(val2);
                    break;

                case 3:
                    System.out.println("enter value");
                    int val3= sc.nextInt();
                    System.out.println("enter index");
                    int index1= sc.nextInt();
                    dll.insertAtPosition(val3,index1);
                    break;


                case 4:
                    dll.deleteAtBeginning();
                    break;


                case 5:
                    dll.deleteAtEnd();
                    break;

                case 6:
                    System.out.println("Enter index");
                    int index2= sc.nextInt();
                    dll.deleteAtPosition(index2);


                case 7:
                    dll.displayForward();
                    break;
                case 8:
                    dll.displayBackward();
                    break;
            }
        }

    }
}
