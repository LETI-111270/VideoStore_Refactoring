package ficha3.v9;

public abstract class Price {
    private boolean blueray;

    public Price(boolean blueray) {
        this.blueray = blueray;
    }

    public boolean isBlueray() {
        return blueray;
    }

    public abstract double getRentalAmount(int daysRented);

    public abstract int getFrequentRenterPoints(int daysRented);
}