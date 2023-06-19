package module1bai2;

public class SachThamKhao  extends Sach{
	private float tax;

	public SachThamKhao(int id, String dateAdded, double unitprice, long quantity, String publisher, float tax) {
		super(id, dateAdded, unitprice, quantity, publisher);
		this.tax = tax;
	}

	public SachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SachThamKhao(int id, String dateAdded, double unitprice, long quantity, String publisher) {
		super(id, dateAdded, unitprice, quantity, publisher);
		// TODO Auto-generated constructor stub
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}
	public double getPrice() {
		return 	(super.getUnitprice()*super.getQuantity()+(super.getUnitprice()*super.getQuantity()*tax/100));
	}
	public static SachThamKhao inputSachThamKhao() {
		int id = Input.intputInt("Enter Id:");
		String dateAdded = Input.intpuDate();
		double unitPrice = Input.intputDouble("Enter unit price:");
		long quatity = Input.intputLong("Enter Quatity:");
		String publisher = Input.intpuString("Enter Publisher:");
		float tax = Input.inputFloat("Enter Tax:");
		return new SachThamKhao(tax,id,dateAdded,unitprice,quantity,publisher);			
	}

	@Override
	public String toString() {
		return String.format("%-10d%-20s%-10.2f%-20s%f",super.getId(),super.getDateAdded(),super.getUnitprice(),super.getQuantity(),super.getPublisher());
	}
	
}
