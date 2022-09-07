package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeIntegers(n1, n2, n3);

    }

    private static void printSmallestOfThreeIntegers (int n1, int n2, int n3){

        if(n1 <= n2 && n1 <= n3){
            System.out.println(n1);
        }else if(n2 <= n1 && n2 <= n3){
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}
