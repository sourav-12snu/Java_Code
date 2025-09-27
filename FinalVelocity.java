import java.util.Scanner;

public class FinalVelocity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity(u):");
        double u = sc.nextDouble();
        System.out.print("Enter initial velocity(a):");

        double a = sc.nextDouble();
        System.out.print("Enter initial velocity(t):");
        double t = sc.nextDouble();

        double v = u +(a*t);
        System.out.println("Final Velocity of the car is: " + v + " m/s");
        sc.close();

    }
}
