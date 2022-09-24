package Ch3_course2_hw5;

import java.util.Date;

public class Factory {

	public static void main(String[] args) {
		FoodProduct food = new FoodProduct("1", "Fineapple", 4, 50, new Date(2022, 9, 17), 7);
		ClothProduct cloth = new ClothProduct("1", "Pants", "Woman", "L", 200, 30);
		Gift gift = new Gift("35674", "Watch");
		ConsultancyProduct consultancy = new ConsultancyProduct("9867", "Maintenance", 65, 268);
		OldComputerSales sale = new OldComputerSales(6000, 250);

		food.showThePrice();
		food.showTheTax();
		food.getPlace();
		System.out.println();

		cloth.showThePrice();
		cloth.getDepot();
		cloth.purchase();
		System.out.println();

		gift.getPlace();
		gift.prepare();
		System.out.println();

		consultancy.getDescription();
		consultancy.showThePrice();
		System.out.println();

		sale.showThePrice();
		sale.purchase();

	}

}