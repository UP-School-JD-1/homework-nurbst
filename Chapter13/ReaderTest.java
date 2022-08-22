package Ch13;

public class ReaderTest {
	public static void main(String[] args) {

		Author author1 = new Author("Zülfü Livaneli");

		Book book1 = new Book(author1, "Elia İle Yolculuk", 120 , BookType.LITERATURE, false, 40);
		book1.author = author1;

		Reader reader1 = new Reader("Nur", 25, 'K');

		reader1.book = book1;

		System.out.println("Name: " + reader1.readerName + "\nAge: " + reader1.readerAge + "\nSex: " + reader1.sex);

		System.out.println("");

		System.out.println("\nBook : " + book1.title + "\nBook's Author : " + author1.authorName + "\nHard Cover : "
				+ book1.isHardCover + "\nType : " + reader1.book.bookType + "\nPage : " + reader1.book.page
				+ "\nCurrent Page : " + reader1.book.currentPage);

	}
}