import java.util.Scanner;

public class Lab_04_Part2_SalesTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double doublePrice;
        double doubleTax = 1.05;
        double doubleTotal;

        System.out.println("What is the price of your item?");

        doublePrice = scan.nextDouble();

        doubleTotal = doublePrice * doubleTax;

        System.out.println("The price of your item, including tax, is $" + doubleTotal + ".");
    }
}