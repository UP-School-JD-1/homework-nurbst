package Ch13;

public class Book {

	Author author;
	String title;
	int page;
	BookType bookType;
	boolean isHardCover;
	int currentPage;

	public Book(Author nAuthor, String nTitle, int nPage, BookType bookType, boolean nIsHardCover, int nCurrentPage) {
		this.author = nAuthor;
		this.title = nTitle;
		this.page = nPage;
		this.bookType = bookType;
		this.isHardCover = nIsHardCover;
		this.currentPage = nCurrentPage;
	}

	public Book() {

	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

}