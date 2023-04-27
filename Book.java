package advancelibrarysystem;

public class Book {
    private String name;
	private String author;
	private int copy;
	
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	public int getCopy() {
		return copy;
	}
	public void setCopy(int newCopy) {
		this.copy = newCopy;
	}
}
