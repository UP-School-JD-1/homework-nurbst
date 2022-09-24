package Ch3_course2_hw5;

public class Product extends BaseProduct implements Priceable {

	double price;
	double tax;

	public Product(String sku, String description, double tax, double price) {
		super(sku, description);
		this.tax = tax;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public void showThePrice() {
		double showPrice = getPrice();
		System.out.println(getDescription() + " price is : " + showPrice);

	}

	@Override
	public void showTheTax() {
		double showTax = getTax();
		System.out.println(getDescription() + " price is : " + showTax);

	}

	@Override
	public void purchase() {
		System.out.println(getDescription() + " is being purchased.");

	}

}