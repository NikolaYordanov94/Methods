package Methods;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNumberSign(n);

    }

    public static void printNumberSign (int n){

        if(n == 0){
            System.out.printf("The number %d is zero.", n);
        }else if (n < 0){
            System.out.printf("The number %d is negative.", n);
        }else{
            System.out.printf("The number %d is positive.", n);
        }

    }
}
