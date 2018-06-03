abstract class Price {
	abstract int getPriceCode();

	abstract public double getCharge(int daysRented);
}

class ChildrensPrice extends Price {
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double thisAmount = 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
}

class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}
}

class RegularPrice extends Price {
	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double thisAmount = 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;

		return thisAmount;
	}
}