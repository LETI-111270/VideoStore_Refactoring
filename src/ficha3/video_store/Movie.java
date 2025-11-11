package ficha3.video_store;

public class Movie {
    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE, BEST};

    private String _title;
    private Price _price;
    private boolean _blueray;

    public Movie(String title, Code priceCode, boolean blueray) {
        _title = title;
        _blueray = blueray;

        switch(priceCode) {
            case REGULAR:
                _price = new RegularPrice(blueray);
                break;
            case CHILDRENS:
                _price = new ChildrensPrice(blueray);
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice(blueray);
                break;
            case BEST:
                _price = new BestPrice(blueray);
                break;
        }
    }

    public String getTitle() {
        return _title;
    }

    public Price getPrice() {
        return _price;
    }

    public boolean isBlueray() {
        return _blueray;
    }
}