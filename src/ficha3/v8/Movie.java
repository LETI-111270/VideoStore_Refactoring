package ficha3.v8;

public class Movie {

    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};
	
	private String _title;
	private Code _priceCode;
    Price _price;
	
	public Movie(String title, Code priceCode) {
		_title = title;
		_priceCode = priceCode;
        _price = new Price(priceCode);
	}

	public String getTitle() {
		return _title;
	}

}
