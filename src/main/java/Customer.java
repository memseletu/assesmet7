import java.util.ArrayList;

public class Customer extends User{
    private int rewardPoint;
    private double accountable;
    private ArrayList<String> addresses;
    private Size size;
    private Product[] products;

    public Customer(String username, String password, int rewardPoint, double accountable, ArrayList<String> addresses, Size size, Product[] products) {
        super(username, password);
        this.rewardPoint = rewardPoint;
        this.accountable = accountable;
        this.addresses = addresses;
        this.size = size;
        this.products = products;

    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(int rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public double getAccountable() {
        return accountable;
    }

    public void setAccountable(double accountable) {
        if(accountable<0){
            System.out.println("negative balance cannot be printed");
        }else{
            this.accountable= accountable;
        }
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }




    public void useRewardPoints(int rewardPoint){
        System.out.println(this.rewardPoint);;

        }

    }

