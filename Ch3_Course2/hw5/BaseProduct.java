package Ch3_course2_hw5;

public abstract class BaseProduct {

	protected String sku;
	protected String description;

	public BaseProduct(String sku, String description) {
		this.sku = sku;
		this.description = description;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}