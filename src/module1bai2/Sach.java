package module1bai2;

public class Sach {
	private int id;
	private String dateAdded;
	protected double unitprice;
	protected long quantity;
	private String publisher;
	public Sach(int id, String dateAdded, double unitprice, long quantity, String publisher) {
		super();
		this.id = id;
		this.dateAdded = dateAdded;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.publisher = publisher;
	}
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String toString() {
		return String.format("%-10d%-20s%-10.2f%-10d%-20s",id,dateAdded,unitprice,quantity,publisher);
	}

}
