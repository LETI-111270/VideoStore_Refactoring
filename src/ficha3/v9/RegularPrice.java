package ficha3.v9;


public class RegularPrice extends Price {
    public RegularPrice(boolean blueray) {
        super(blueray);  // Chama o construtor da classe pai
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double amount = 2.0;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        if (isBlueray())  // Método herdado da classe Price
            amount += 1.0;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}