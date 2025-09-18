public class SuperMarket {
    Product bread;
    Product fruit;
    Product cheese;
    Product toiletPaper;


    public SuperMarket() {

    }

    public static void buyItem(Product product, int orderAmount) {
        String itemName = product.name;
        double itemPrice = product.price;
        int itemStock = product.amount;
        int order = orderAmount;

        if (itemStock > order) {
            System.out.println("You bought " + order + " " + itemName + " for " + itemPrice * order + " euro");
            } else {
                System.out.println("You cannot buy " + order + " " + itemName + ", we only have " + itemStock + itemName + " left.");
            }
        System.out.println("buyItem completed!");
        }

        public void buyBread (int amount){
            buyItem(this.bread, amount);
        }

        public void buyFruit (int amount){
            buyItem(this.fruit, amount);
        }

        public void buyCheese (int amount){
            buyItem(this.cheese, amount);
        }

        public void buyToiletPaper (int amount){
            buyItem(this.toiletPaper, amount);
        }

}