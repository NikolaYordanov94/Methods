package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        while(!n.equals("END")){

            int input = Integer.parseInt(n);
            int lastDigit = 0;
            int reverse = 0;
            int currentInput = input;

            while (input >= 1){

                lastDigit = input % 10;
                reverse = reverse * 10 + lastDigit;
                input /= 10;
            }
            if(reverse == currentInput){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

            n = scanner.nextLine();
        }

    }
}
