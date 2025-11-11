package ficha3.v9;

public class Movie {
    public enum Code {REGULAR, CHILDRENS, NEW_RELEASE};

    private String _title;
    Price _price;

    public Movie(String title, Code priceCode) {
        _title = title;

        // Criar a instância correta de Price baseada no código
        switch(priceCode) {
            case REGULAR:
                _price = new RegularPrice(false); // ou true se for bluray
                break;
            case CHILDRENS:
                _price = new ChildrensPrice(false); // ou true se for bluray
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice(false); // ou true se for bluray
                break;
        }
    }

    public String getTitle() {
        return _title;
    }

    public Price getPrice() {
        return _price;
    }
}