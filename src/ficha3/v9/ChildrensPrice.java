package ficha3.v9;

public class ChildrensPrice extends Price {
    public ChildrensPrice(boolean blueray) {
        super(blueray);  // Chama o construtor da classe pai
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        if (isBlueray())  // Método herdado da classe Price
            amount += 1.0;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}