import java.util.Scanner;

public class SinglyLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }




    private Node head;
    public void insertAtBeginning(int data){

        Node newNode = new Node(data);

        newNode.next=head;
        head=newNode;
    }





    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }



    public void insertAtPosition(int index,int data){
        Node newNode = new Node(data);
        if (index==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index-1 && temp != null; i++){
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
       newNode.next= temp.next;
        temp.next=newNode;

    }



public void deleteFromBeginning(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        head=head.next;
}




public void deleteFromEnd(){
    if (head==null){
        System.out.println("List is Empty");
        return;
    }
    if (head.next==null){
        head=null;
        return;
    }
    Node temp = head;
    while (temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
}





public void deleteFromPosition(int index){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        if (index==1){
            head=head.next;
        }
        Node temp=head;
    for (int i = 1; i < index - 1 && temp != null; i++) {
        temp = temp.next;
    }
    if (temp==null||temp.next==null){
        System.out.println("Invalid Position");
        return;
    }
    temp.next=temp.next.next;

}




    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();

    }







    public int countNodes() {
        int count = 0; Node temp = head; while (temp != null) {
            count++; temp = temp.next;
        }
        return count;
    }





    public void search(int element){
        Node temp = head;
        int index=1;
        while (temp!=null){
            if (temp.data==element){
                System.out.println("Elements "+element+"found at index"+index);
                return;
            }
            temp=temp.next;
            index++;
        }
        System.out.println("Element " + element + " not found!");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyLL list = new SinglyLL();
        while (true){
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4.Delete At Beginning");
            System.out.println("5.Delete At End");
            System.out.println("6.Delete At GivenPosition");
            System.out.println("7.Display the element");
            System.out.println("8.Count Nodes");
            System.out.println("9.Search Element");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice){


                case 1: System.out.println("Enter Data");
                int val1= sc.nextInt();
                list.insertAtBeginning(val1);
                break;


                case 2:System.out.println("Enter Data");
                    int val2= sc.nextInt();
                    list.insertAtEnd(val2);
                    break;


                case 3: System.out.print("Enter value: ");
                int val3 = sc.nextInt();
                System.out.print("Enter position: ");
                int index1 = sc.nextInt();
                list.insertAtPosition(index1,val3);
                break;



                case 4:
                    list.deleteFromBeginning();
                    break;


                case 5:
                    list.deleteFromEnd();
                    break;

                case 6:
                    System.out.println("Enter index");
                    int index2= sc.nextInt();
                    list.deleteFromPosition(index2);
                    break;


                case 7:
                    list.display();
                    break;

                case 8 :
                    System.out.println("Total Nodes:"+list.countNodes());
                    break;

                case 9:
                    System.out.println("Enter Element To Search");

                    int val4= sc.nextInt();
                    list.search(val4);
                    break;





            }
        }
    }

}
