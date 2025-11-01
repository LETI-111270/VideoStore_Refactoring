package ficha3.v7;

public class Movie {

    static int getFrequentRenterPoints(Rental each, int frequentRenterPoints) {
        // add frequent renter points
        frequentRenterPoints++;

        // add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Code.NEW_RELEASE) && each.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    double getRentalAmount(Rental rental) {
        double thisAmount = 0;

        // determine amounts for each line
        switch (rental.getMovie().getPriceCode())
        {
            case REGULAR:
                thisAmount += 2;
                if (rental.getDaysRented() > 2)
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case NEW_RELEASE:
                thisAmount += rental.getDaysRented() * 3;
                break;
            case CHILDRENS:
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3)
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};
	
	private String _title;
	private Code _priceCode;
	
	public Movie(String title, Code priceCode) {
		_title = title;
		_priceCode = priceCode;
	}

	public String getTitle() {
		return _title;
	}

	public Code getPriceCode() {
		return _priceCode;
	}

}
