package module1bai2;

public class TextBook extends Sach {
	private Status status;

	public TextBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextBook(int id, String dateAdded, double unitprice, long quantity, String publisher) {
		super(id, dateAdded, unitprice, quantity, publisher);
		// TODO Auto-generated constructor stub
	}

	public TextBook(int id, String dateAdded, double unitprice, long quantity, String publisher, Status status) {
		super(id, dateAdded, unitprice, quantity, publisher);
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	public double getPrice() {
		if(status == Status.NEW) {
			return super.getUnitprice()*super.getQuantity();
		}
		return (super.getUnitprice()*super.getQuantity())/2;
	}
	public static TextBook inputTextBook() {
		int id = Input.intputInt("Enter Id:");
		String dateAdded = Input.intpuDate();
		double unitPrice = Input.intputDouble("Enter unit price:");
		long quatity = Input.intputLong("Enter Quatity:");
		String publisher = Input.intpuString("Enter Publisher:");
		Status status = Status.NEW;
		return new SachThamKhao(status,id,dateAdded,unitprice,quantity,publisher);	
	}

	@Override
	public String toString() {
		return String.format("%-10d%-20s%-10.2f%-20s%f",super.getId(),super.getDateAdded(),getPrice(),super.getQuantity(),super.getPublisher(),status==Status.NEW ? "moi":"cu");
	}
	
}
