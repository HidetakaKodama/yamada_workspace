package Ex2_A4;

public class FantasyNovel extends Book{
	public int shohan;

	public FantasyNovel(String genre, String language, int shohan) {
		super(genre, language);
		this.shohan = shohan;
	}

	public void bookInfo() {
		System.out.println("この本は" + this.language + "で書かれています。");
		System.out.println("この本は" + this.shohan + "年に書かれました。");
	}
}
