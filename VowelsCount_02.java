package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase(); // прави всички букви малки


        // гласни букви (A,a,E,e,I,i,O,o,U,u)
        printVowelsCount(text);
    }

    private static void printVowelsCount (String text){
        int count = 0; // брой гласни букви

        for(char symbol : text.toCharArray()){
            if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
                count++;
            }

        }
        System.out.println(count);
    }

}
