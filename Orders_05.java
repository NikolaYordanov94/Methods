package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfProduct = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        printCalculatedTotalPrice(typeOfProduct, quantity);
    }

    public static void printCalculatedTotalPrice (String typeOfProduct, int quantity){

        double calculatedTotalPrice = 0;
        double singlePrice = 0;

        switch (typeOfProduct){
            case"coffee":
                singlePrice = 1.50;
                break;
            case"water":
                singlePrice = 1.00;
                break;
            case"coke":
                singlePrice = 1.40;
                break;
            case"snacks":
                singlePrice = 2.00;
                break;
        }
        calculatedTotalPrice = singlePrice * quantity;
        System.out.printf("%.2f", calculatedTotalPrice);
    }
}
