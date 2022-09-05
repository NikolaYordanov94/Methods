package Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String typeOfOperator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        switch (typeOfOperator){
            case"*":
                System.out.println(printMultiplicationOfNumbers(a, b));
                break;

            case"+":
                System.out.println(printSumOfNumbers(a, b));
                break;

            case"/":
                System.out.println(printDivisionOfNumbers(a, b));
                break;

            case"-":
                System.out.println(printSubtractionOfNumbers(a, b));
                break;

        }
    }
    public static int printMultiplicationOfNumbers (int a, int b){

        return a * b;
    }
    public static int printDivisionOfNumbers (int a, int b){

        return a / b;
    }
    public static int printSumOfNumbers (int a, int b){

        return a + b;
    }
    public static int printSubtractionOfNumbers (int a, int b){

        return a - b;
    }
}
