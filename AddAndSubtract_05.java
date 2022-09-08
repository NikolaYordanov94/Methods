package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(returnSubtract(n1, n2, n3));
    }

    private static int returnSum (int n1, int n2){

        return  n1 + n2;
    }

    private static int returnSubtract (int n1, int n2, int n3){

        return returnSum(n1, n2) - n3;
    }
}
