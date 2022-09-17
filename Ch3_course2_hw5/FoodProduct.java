package Ch3_course2_hw5;

import java.util.Date;

public class FoodProduct extends Product implements Locatable {

	protected Date productionDate;
	protected int life;

	public FoodProduct(String sku, String description, double tax, double price, Date productionDate, int life) {
		super(sku, description, tax, price);
		this.productionDate = productionDate;
		this.life = life;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public void getDepot() {
		String depotFood = "Bayrampaşa";
		System.out.println("Depot is in the:" + depotFood);

	}

	@Override
	public void getPlace() {
		String placeFood = "Istanbul";
		System.out.println("Depot place is in the " + placeFood);

	}

}