package module1bai4;
import java.text.DecimalFormat;
import java.util.Objects;

public abstract class LoDat implements Comparable<LoDat>//sort min max
{
	@Override
	public int hashCode() {
		return Objects.hash(maSo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoDat other = (LoDat) obj;
		return Objects.equals(maSo, other.maSo);
	}
	/**
	 * @return the maSo
	 */
	public String getMaSo() {
		return maSo;
	}
	/**
	 * @param maSo the maSo to set
	 */
	public void setMaSo(String maSo)
	{
		if(maSo.trim().equals(""))
			this.maSo="NULL";
		else
			this.maSo = maSo;
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) 
	{
		if(donGia>0)
			this.donGia = donGia;
		else
			this.donGia=0;
	}
	protected String maSo;
	protected double donGia;
	public LoDat(String maSo, double donGia) 
	{		
		setDonGia(donGia);
		setMaSo(maSo);
	}
	
	DecimalFormat df=new DecimalFormat("#,###");
	public String toString()
	{
		return String.format("%-8s %-10s",maSo,df.format(donGia));
	}
	public abstract double tinhDienTich();
	public abstract double tinhThanhTien();
	public int compareTo(LoDat l)
	{
		return (this.tinhThanhTien()>l.tinhThanhTien()) ? 1:-1;
	}
}
