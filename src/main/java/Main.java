import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Product bread = new Product("Brood", 1.99, 20);
        Product fruit = new Product("Fruit", 13.75, 26);
        Product toiletPaper = new Product("Toilet Papier", 1, 50);
        Product cheese = new Product("Kaas", 3.95, 2);
        System.out.println("Products loaded!");

        SuperMarket superMarket = new SuperMarket();
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Other stuff loaded!");

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine().trim();

        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        Customer.goToSuperMarket();
        Customer.buyItem(productName, amount);
    }


}
