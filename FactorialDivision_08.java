package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        //факториел на първото число
        //факториел на второто число
        // факт на първото / факт на второто -> %.2f

        long fact1 = calculateFactorial(number1);
        long fact2 = calculateFactorial(number2);

        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);

    }
    // long защото факториела може да стане голямо число
    private static long calculateFactorial (int number){
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
