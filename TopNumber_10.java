package MethodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            //сумата от цифрите да се дели на 8
            // да съдържа поне една нечетна цифра
            if(isSumDigitsDivisibleBy8(number) && isContainsOddDigit(number)){
                System.out.println(number);
            }

        }
    }

    //метод който проверява дали сумата от цифрите се дели на 8
    // да върне true ако това е валидно

    private static boolean isSumDigitsDivisibleBy8 (int number){

        int sumDigits = 0;

        while(number > 0){
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number /= 10;
        }
        return sumDigits % 8 == 0;
    }

    //метод, който проверява дали имаме поне една нечетна цифра в числото
    // true - ако имаме поне 1 нечетна цифра в числото

    private static boolean isContainsOddDigit (int number){
        while (number > 0){
            int lastDigit = number % 10;

            if(lastDigit % 2 == 1){

                return true;
            }

            number /= 10;
        }
        return false;
    }
}
