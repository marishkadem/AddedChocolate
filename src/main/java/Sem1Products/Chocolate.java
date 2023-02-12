package Sem1Products;

public class Chocolate extends Product{
    int percentageOfCocoa;

    public Chocolate(String name, double price, int percentageOfCocoa) {
        super(name, price);
        this.percentageOfCocoa = percentageOfCocoa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", percentageOfCocoa: %s", this.percentageOfCocoa);
    }
}
