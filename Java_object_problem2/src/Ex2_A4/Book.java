package Ex2_A4;

public class Book{
	protected String genre;
	protected String language;

	public Book(String genre, String language){
		this.genre = genre;
		this.language = language;
	}

	public void bookInfo() {
		System.out.println("この本のジャンルは" + this.genre + "です。");
		System.out.println("この本は" + this.language + "で書かれています。");
	}
}
