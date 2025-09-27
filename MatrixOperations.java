import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns for Matrix A: ");
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        System.out.print("Enter rows for Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns for Matrix B: ");
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        if (r1 == r2 && c1 == c2) {
            int[][] sub = new int[r1][c1];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sub[i][j] = A[i][j] - B[i][j];
                }
            }
            System.out.println("\nMatrix Subtraction (A - B):");
            printMatrix(sub);
        } else {
            System.out.println("\nMatrix subtraction NOT possible (different sizes).");
        }


        if (c1 == r2) {
            int[][] mul = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            System.out.println("\nMatrix Multiplication (A × B):");
            printMatrix(mul);
        } else {
            System.out.println("\nMatrix multiplication NOT possible (A columns != B rows).");
        }

        sc.close();
    }

   
    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + "\t");

            }
            System.out.println();
        }
    }
}
