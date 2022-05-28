package lab4e3;

public abstract class Item {
	private int idNum;
	private String title;
	private int numOfCopy;
	
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumOfCopy() {
		return numOfCopy;
	}
	public void setNumOfCopy(int numOfCopy) {
		this.numOfCopy = numOfCopy;
	}
	
	public Item() {
		
	}
	public Item(int idNum, String title, int numOfCopy) {
		super();
		this.idNum = idNum;
		this.title = title;
		this.numOfCopy = numOfCopy;
	}
	@Override
	public String toString() {
		return "Item [idNum=" + idNum + ", title=" + title + ", numOfCopy=" + numOfCopy + "]";
	}
	
	abstract public void checkIn();
	abstract public void checkOut();
	abstract public void addItem();


}
