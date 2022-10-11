import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class App {

    public static void PrintAllPrintableObjects(Iprint[] iprint){
        for(int x = 0; x<iprint.length; x++){
           iprint[x].print();

        }
    }
    public static void consumeConsumables(Consumeable[] consumeables){
        for(int x = 0; x< consumeables.length; x++){
            consumeables[x].consume();
        }
    }

    public static void getTotalPriceOfCustomer(Customer customer){
        double total = 0;
        for(Product p : customer.getProducts()){
            total= total+ p.getPrice();
        }


    }

    public static String getSecondaryAddressofCustomer(Customer customer){
        return customer.getAddresses().get(1);
    }

    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> products){
        Collections.sort(products, new ReverseSort());

    }

//    public static ArrayList<Double> getListOfProductPricesGreaterThanPriceofProducrGiven(ArrayList<Product> products, Product myProduct){
//
//    }
//
    public static void addSibleProductToDirectoryTiedToCustomerByNameThePrint(Map<String, Product> Customer, Product product){

    }
}
