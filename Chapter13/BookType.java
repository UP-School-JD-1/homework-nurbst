package Ch13;

public enum BookType {

	FICTION("Kurgu"), SCIENTIFIC("Bilim Kurgu"), CLASSICS("Klasik"),FANTASY("Fantastik"),LITERATURE("Edebiyat");

	private String description;

	private BookType(String description) {

		this.description = description;

	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;

	}
}