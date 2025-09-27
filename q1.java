import java.util.Scanner;

class q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        Long num1 = sc.nextLong();
        System.out.print("Enter the 2nd number:");
         Long num2 = sc.nextLong();
        Long sum = num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is " +sum);

    }
}