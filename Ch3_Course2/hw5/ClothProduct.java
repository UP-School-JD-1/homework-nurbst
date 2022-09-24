package Ch3_course2_hw5;

public class ClothProduct extends Product implements Locatable {

	protected String sex;
	protected String size;

	public ClothProduct(String description, String sku, String sex, String size, double price, double tax) {
		super(description, sku, price, tax);
		this.sex = sex;
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void getDepot() {
		String depotCloth = "Merkez";
		System.out.println("Depot place is in the " + depotCloth);

	}

	@Override
	public void getPlace() {
		String placeCloth = "Edirne";
		System.out.println("Depot place is in the " + placeCloth);

	}

}