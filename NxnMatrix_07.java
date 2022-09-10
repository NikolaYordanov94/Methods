package MethodsExercise;

import java.util.Scanner;

public class NxnMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxNMatrix(n);
    }

    private static void printNxNMatrix(int n){

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
        }
    }
}
