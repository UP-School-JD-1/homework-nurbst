package Ch3_course2_hw5;

public class Gift extends BaseProduct implements Locatable {

	public Gift(String sku, String description) {
		super(sku, description);
	}

	@Override
	public void getDepot() {
		String depotGift = "Kesan";
		System.out.println("Depot is in the " + depotGift);

	}

	@Override
	public void getPlace() {
		String placeGift = "Edirne";
		System.out.println("Depot Place is in the " + placeGift);

	}

	public void prepare() {
		System.out.println("Gift is preparing.");
	}

}