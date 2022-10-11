public class Battery extends Product implements Consumeable{

    public Battery(String name, double price, Size size) {
        super(name, price, size);
    }

    @Override
    public void consume() {

    }
}
