public class Customer {
    String name;
    SuperMarket superMarket;
    int amount;

    public Customer() {
        name = "John Doe";
    }

    public void goToSuperMarket (SuperMarket superMarket){
        this.superMarket = superMarket;
    }


    public static void buyItem(String productName, int amount) {

        if (productName == "bread") {
            superMarket.buyBread(amount);
        } else if (productName == "fruit") {
            superMarket.buyFruit(amount);
        } else if (productName == "cheese") {
            superMarket.buyCheese(amount);
        } else if (productName == "toiletPaper") {
            superMarket.buyToiletPaper(amount);
        } else {
        System.out.println("Product NOT Found!");
        }
    }


}