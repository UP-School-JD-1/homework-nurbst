package Ch8_course2_hw2;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BookComparator {
	public static void main(String[] args) {
		Book book1 = new Book("1984", "George", "Orwell", 352);
		Book book2 = new Book("Simyaci", "Paulo", "Coelho", 184);
		Book book3 = new Book("Gece Yarisi Kutuphanesi", "Matt", "Haig", 283);
		
		book1.printInfo();
		System.out.println();
		book2.printInfo();
		System.out.println();
		book3.printInfo();
		System.out.println();
		

		Comparator<Book> comparatorByPageNumber = (b1, b2) -> b1.getPages() - b2.getPages();

		BinaryOperator<Book> maxPageNumberOperator = BinaryOperator.maxBy(comparatorByPageNumber);

		System.out.println("\n--- Comparing " + book1.getPages() + " and " + book2.getPages() + "---");
		System.out.println("Max Page Number ---" + maxPageNumberOperator.apply(book1, book2).getPages());

		System.out.println("\n--- Comparing " + book3.getPages() + " and " + book2.getPages() + "---");
		System.out.println("Max Page Number ---" + maxPageNumberOperator.apply(book2, book3).getPages());

	}
}