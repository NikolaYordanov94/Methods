package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvenAndOdds(num));


    }


    private static int getMultipleOfEvenAndOdds (int num){

        int sumOfAllOddDigits = 0;
        int sumOfAllEvenDigits = 0;

        while (Math.abs(num) > 0){

            int currentDigit = Math.abs(num % 10);

            if(currentDigit % 2 == 0){
               sumOfAllEvenDigits += currentDigit;

            }else{
                sumOfAllOddDigits += currentDigit;
            }

            num /= 10;
        }
        return sumOfAllEvenDigits * sumOfAllOddDigits;
    }
}
