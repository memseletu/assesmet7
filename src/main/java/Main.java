import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Admin admin = new Admin("memseletu", "12345");
        ArrayList<String> addresses = new ArrayList<>();
             addresses.add("Newark Delware");
             addresses.add("mainstreet De");

      Product product1 = new Product("jeans", 59.00, Size.M);
      Product product2 = new Product("dress", 200,Size.X);
      Product [] customerProducts = {product1};
      Customer customer1= new Customer("memseletu", "234",20, 10.00, addresses, Size.M, customerProducts);
      Customer customer2 = new Customer("abdel", "856",30,10.00, addresses, Size.X, customerProducts);
      Customer customer3 = new Customer("jam", "947y5", 10, 200.00, addresses, Size.S, customerProducts);

      customer2.setRewardPoint(1000);
    }

}
