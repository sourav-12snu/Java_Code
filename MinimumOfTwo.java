import java.util.Scanner;

public class MinimumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if(num1<num2){
            System.out.print("Minimum number is: " + num1);
        } else if (num1 > num2) {

            System.out.println("Minimum number is: " + num2);
        }
        else {
            System.out.println("Both numbers are equal");
        }

        sc.close();
    }
}
