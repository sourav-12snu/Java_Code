import java.util.Scanner;

public class CollinearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates of 3 points
        System.out.print("Enter x1 and y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();


        int area = 1/2*(x1 * (y2 - y3) +x2 * (y3 - y1) + x3 * (y1 - y2));

        if (area == 0) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        sc.close();
    }
}
