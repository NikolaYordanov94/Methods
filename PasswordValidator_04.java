package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        //1.валидираме дължината
        if(!isValidLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        //2. валидиране съдържанието на паролата

        boolean isPasswordContentValid = isValidContent(password);
        if(!isPasswordContentValid){
            System.out.println("Password must consist only of letters and digits");
        }

        // 3. брой цифри
        boolean isPasswordCountDigitsValid = isValidCountDigits(password);

        if(!isPasswordCountDigitsValid){
            System.out.println("Password must have at least 2 digits");
        }

        if(isPasswordContentValid && isPasswordContentValid && isPasswordCountDigitsValid){
            System.out.println("Password is valid");
        }

    }


    //метод за валидиране на дължината
    private static boolean isValidLength(String password){
        if(password.length() >= 6 && password.length() <= 10){
            return true;
        }else{
            return false;
        }

    }

    //метод за валидиране на съдържанието

    private static boolean isValidContent (String password){

        //валидно съдържание ако имаме само букви или цифри
        //невалидно ако срещнем нещо различно от буква или цифра
        for (char symbol : password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    //метод, който валидира брой на цифрите

    private static boolean isValidCountDigits(String password){
        int countDigits = 0; //брой на цифрите

        for (char symbol : password.toCharArray()) {
            if(Character.isDigit(symbol)){
                countDigits++;
            }
        }
        if(countDigits >= 2){
            return true;
        }else{
            return false;
        }
    }
}
