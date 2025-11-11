package ficha3.video_store;

public class RegularPrice extends Price {
    public RegularPrice(boolean blueray) {
        super(blueray);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double amount = 2.0;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        if (isBlueray())
            amount += 1.0;
        return amount;
    }

    @Override
    public int getFrequentRentalPoints(int daysRented) {
        return 1;
    }
}