package module1bai4;
import java.text.DecimalFormat;

public class LoDatHinhChuNhat extends LoDat
{
	/**
	 * @return the chieuDai
	 */
	public double getChieuDai() {
		return chieuDai;
	}

	/**
	 * @param chieuDai the chieuDai to set
	 */
	public void setChieuDai(double chieuDai)
	{
		if(chieuDai>0)
			this.chieuDai = chieuDai;
		else
			this.chieuDai=0;
	}

	/**
	 * @return the chieuRong
	 */
	public double getChieuRong() {
		return chieuRong;
	}

	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(double chieuRong)
	{
		if(chieuRong>0)
			this.chieuRong = chieuRong;
		else
			this.chieuRong=0;
	}

	private double chieuDai,chieuRong;
	public LoDatHinhChuNhat(String maSo, double donGia,double chieuDai,double chieuRong) 
	{
		super(maSo, donGia);
		setChieuDai(chieuDai);
		setChieuRong(chieuRong);
	}

	@Override
	public double tinhDienTich()
	{
		return getChieuDai()*getChieuRong();
	}

	@Override
	public double tinhThanhTien()
	{
		return tinhDienTich()*getDonGia();
	}
	DecimalFormat df=new DecimalFormat("#,###");
	public String toString()
	{
		return String.format("%s %-10s %-10s",super.toString(),df.format(tinhDienTich()),df.format(tinhThanhTien()));
	}

}
