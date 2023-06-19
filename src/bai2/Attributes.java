package bai2;

public class Attributes {
	private int id;
	private String name;
	private float pointLT;
	private float pointTH;
	
	public void getId(int id) {
		if(id < 0)
			this.id = 0;
		else 
			this.id = id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPointLT() {
		return pointLT;
	}
	public void setPointLT(float pointLT) {
		if( pointLT >=0 && pointLT <=10)
			this.pointLT = pointLT;
		else
			this.pointLT = 0;
	}
	public float getPointTH() {
		return pointTH;
	}
	public void setPointTH(float pointTH) {
		if( pointTH >=0 && pointTH <=10)
			this.pointTH = pointTH;
		else
			this.pointTH = 0;
	}
	public Attributes(int id, String name, float pointLT, float pointTH) {
		super();
		this.id = id;
		this.name = name;
		this.pointLT = pointLT;
		this.pointTH = pointTH;
	}
	public float getPointTB() {
		return (pointLT+pointTH)/2;
	}
	public Attributes() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("%-5s %-30s %10.2f %10.2f %10.2f",id,name,pointLT,pointTH,getPointTB());
	}
	
}
