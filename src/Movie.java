public class Movie  {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
	private int _priceCode;

	public Movie(String name, int priceCode) {
		_title = name;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void  setPriceCode(int newPrice){
		_priceCode = newPrice;
		
	}
	
	public String getTitle(){
		return _title;		
	}

	double getCharge(int daysRented) {
		double thisAmount = 0;
		switch (getPriceCode()) {
			case REGULAR:
				thisAmount += 2;
				if (daysRented > 2)
					thisAmount += (daysRented - 2) * 1.5;
				break;
			case NEW_RELEASE:
				thisAmount += daysRented * 3;
				break;
			case CHILDRENS:
				thisAmount += 1.5;
				if (daysRented > 3)
					thisAmount += (daysRented - 3) * 1.5;
				break;
		}
		return thisAmount;
	}

	public int getFrequentRenterPoints(int _daysRented) {
		// add bonus for a two day new release rental
		int points = 1;
		if ((getPriceCode() == NEW_RELEASE) && _daysRented > 1) {
			points = 2;
		}
		return points;

	}
	
}
