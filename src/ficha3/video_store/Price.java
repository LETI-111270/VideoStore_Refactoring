package ficha3.video_store;

public abstract class Price {
    private boolean blueray;

    public Price(boolean blueray) {
        this.blueray = blueray;
    }

    public boolean isBlueray() {
        return blueray;
    }

    // Métodos com nomes conforme diagrama
    public abstract double getRentalAmount(int daysRented);
    public abstract int getFrequentRentalPoints(int daysRented);
}