package ficha3.v9;

public class NewReleasePrice extends Price {
    public NewReleasePrice(boolean blueray) {
        super(blueray);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double amount = 3.0 * daysRented;

        if (isBlueray())
            amount += 1.0;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}