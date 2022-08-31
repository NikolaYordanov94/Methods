package Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradesCorresponding(grade);

    }

    public static void printGradesCorresponding (double grade){

        if(grade <= 6.00 && grade >= 5.50){
            System.out.println("Excellent");
        }else if (grade <= 5.49 && grade >= 4.50){
            System.out.println("Very good");
        }else if(grade <= 4.49 && grade >= 3.50){
            System.out.println("Good");
        }else if(grade <= 3.49 && grade >= 3.00){
            System.out.println("Poor");
        }else{
            System.out.println("Fail");
        }
    }
}
