package constructor;

public class Book {
	//객체 생성
	private String title;
	private String author;
	private int page;
	
	//디폴트 생성자
	public Book() {

	}
	//생성자 변수 선언
	public Book(String title, String author, int page) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
	}


	//getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	//toString

	@Override
	public String toString() {
		return title + "의 저자는 " + author + "이고" + page + "페이지로 구성됨";
	}
	
	

}
