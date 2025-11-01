package ficha3.v8.v7;

public class Price {

        private Movie.Code _priceCode;

        public Price(Movie.Code priceCode) {
            this._priceCode = priceCode;
        }

    static int getFrequentRenterPoints(Rental each, int frequentRenterPoints) {
        // add frequent renter points
        frequentRenterPoints++;

        // add bonus for a two day new release rental
        if ((each.getMovie()._price.getCode() == Movie.Code.NEW_RELEASE) && each.getDaysRented() > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    double getRentalAmount(Rental rental) {
        double thisAmount = 0;

        // determine amounts for each line
        switch (rental.getMovie()._price.getCode())
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

    public Movie.Code getCode() {
        return _priceCode;
    }
}
