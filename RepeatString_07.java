package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatStringNTimes(textInput, n));

    }

    public static String repeatStringNTimes (String toRepeat, int n){
        String result = "";

        for (int i = 1; i <= n; i++) {

            result += toRepeat;
        }

        return result;
    }
}
