import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // initialize variables
        Scanner userInput = new Scanner(System.in);
        double itemPrice = 0;
        double shippingPrice = 0;
        double totalPrice = 0;
        final double SHIPPING_RATE = 0.02;

        //ask initial question
        System.out.print("What is the price of your item?: ");
        itemPrice = userInput.nextDouble();

        //simple if else to determine costs for user
        if (itemPrice >= 100) {
            totalPrice = itemPrice;
            System.out.println("Your shipping was free so your total cost was $" + totalPrice);
        }
        else {
            shippingPrice = itemPrice * SHIPPING_RATE;
            totalPrice = itemPrice + shippingPrice;
            System.out.println("Your shipping costs $" + shippingPrice + " and your total cost is $" + totalPrice);

        }
    }
}