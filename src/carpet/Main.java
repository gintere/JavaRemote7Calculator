package carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor size:");
        System.out.println("Please enter floor length");
        double length = scanner.nextDouble();
        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        Floor floor = new Floor(width, length);

        System.out.println("Please enter carpet price per sqm");
        double cost = scanner.nextDouble();
        Carpet carpet = new Carpet(cost);

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("That will cost you: " + calculator.getTotalCost());
    }

}
