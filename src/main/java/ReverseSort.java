import java.util.Comparator;

public class ReverseSort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.compareTo(o2);
    }
}