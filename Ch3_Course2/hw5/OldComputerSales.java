package Ch3_course2_hw5;

public class OldComputerSales implements Priceable, Locatable {

	private double price;
	private double tax;

	OldComputerSales(double price, double tax) {
		this.price = price;
		this.tax = tax;
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
	public void getDepot() {
		String depotOldComp = "İzmit";
		System.out.println("Depot is in the " + depotOldComp);

	}

	@Override
	public void getPlace() {
		String placeOldComp = "Kocaeli";
		System.out.println("Depot Place is in the " + placeOldComp);

	}

	@Override
	public void showThePrice() {
		double showPrice = getPrice();
		System.out.println("Computer price is : " + showPrice);

	}

	@Override
	public void showTheTax() {
		double showTax = getTax();
		System.out.println("Computer price is : " + showTax);

	}

	@Override
	public void purchase() {
		System.out.println("Computer is being purchased.");

	}

}
