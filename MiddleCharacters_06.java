package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // метод който принтира средния символ
        // нечетна дължина на текста - 1 среден символ
        // четна дължина на текста - 2 средни символа

        printMiddleCharacters(text);
    }

    private static void printMiddleCharacters (String text){
        //нечетна дължина
        if(text.length() % 2 == 1){
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }else{
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;

            System.out.println(text.charAt(indexFirstMiddleCharacter) + "" + text.charAt(indexSecondMiddleCharacter));

        }
    }
}
