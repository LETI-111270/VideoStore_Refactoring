package ficha3.video_store;

public class ChildrensPrice extends Price {
    public ChildrensPrice(boolean blueray) {
        super(blueray);
    }

    @Override
    public double getRentalAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        if (isBlueray())
            amount += 1.0;
        return amount;
    }

    @Override
    public int getFrequentRentalPoints(int daysRented) {
        return 1;
    }
}