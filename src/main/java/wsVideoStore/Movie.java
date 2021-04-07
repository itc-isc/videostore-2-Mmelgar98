package wsVideoStore;

public abstract class Movie
{
	public static final byte REGULAR = 0;
	public static final byte NEW_RELEASE = 1;
	public static final byte CHILDRENS = 2;
	private String title;
	private byte priceCode;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

	public byte getPriceCode () {
		return priceCode;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}