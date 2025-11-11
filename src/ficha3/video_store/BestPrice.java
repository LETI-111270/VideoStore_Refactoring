package ficha3.video_store;

public class BestPrice extends Price {
    public BestPrice(boolean blueray) {
        super(blueray);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double amount = 4.0;
        if (isBlueray())
            amount += 2.0;
        return amount;
    }

    @Override
    public int getFrequentRentalPoints(int daysRented) {
        return 3;
    }
}