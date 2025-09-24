public class Customer {
    String name;
    SuperMarket superMarket;
    int amount;

    public String Customer() {
        return name = "John Doe";
    }

    public String goToSuperMarket (){
        return "Joppie's Hokkie";
    }


    public void buyItem(String productName, int amount) {

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