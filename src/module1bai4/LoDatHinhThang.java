package module1bai4;
import java.text.DecimalFormat;

public class LoDatHinhThang extends LoDat
{
	/**
	 * @return the chieuCao
	 */
	public double getChieuCao() {
		return chieuCao;
	}

	/**
	 * @param chieuCao the chieuCao to set
	 */
	public void setChieuCao(double chieuCao) 
	{
		if(chieuCao>0)
			this.chieuCao = chieuCao;
		else
			this.chieuCao=0;
	}

	/**
	 * @return the dayLon
	 */
	public double getDayLon() {
		return dayLon;
	}

	/**
	 * @param dayLon the dayLon to set
	 */
	public void setDayLon(double dayLon)
	{
		if(dayLon>0)
			this.dayLon = dayLon;
		else
			this.dayLon=0;
	}

	/**
	 * @return the dayNho
	 */
	public double getDayNho() {
		return dayNho;
	}

	/**
	 * @param dayNho the dayNho to set
	 */
	public void setDayNho(double dayNho)
	{
		if(dayNho>0)
			this.dayNho = dayNho;
		else
			this.dayNho=dayNho;
	}

	private double dayLon,dayNho,chieuCao;
	
	public LoDatHinhThang(String maSo, double donGia,double dayLon,double dayNho,double chieuCao)
	{
		super(maSo, donGia);
		setDayLon(dayLon);
		setDayNho(dayNho);	
		setChieuCao(chieuCao);
	}

	@Override
	public double tinhDienTich()
	{
		return (getDayLon()+getDayNho())*getChieuCao()/2;
	}
	DecimalFormat df=new DecimalFormat("#,###");
	@Override
	public double tinhThanhTien() 
	{
		return tinhDienTich()*getDonGia()-tinhDienTich()*getDonGia()*10/100;
	}
	public String toString()
	{
		return String.format("%s %-10s %-10s",super.toString(),df.format(tinhDienTich()),df.format(tinhThanhTien()));
	}
}
