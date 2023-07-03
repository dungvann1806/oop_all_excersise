package module1bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListLoDat 
{
	/**
	 * @return the list
	 */
	public ArrayList<LoDat> getList() //HashSet
	{
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<LoDat> list) {
		this.list = list;
	}

	private ArrayList<LoDat> list;
	public ListLoDat()
	{
		setList(new ArrayList<LoDat>());
	}
	public boolean them(LoDat l)
	{
		if(!list.contains(l))
		{
			list.add(l);
			return true;
		}
		return false;
	}
	public String layTieuDe()
	{
		return String.format("%-8s %-10s %-10s %-10s","Mã số","Đơn Giá","Diện tích","Thành tiền");
	}
	public String toString()
	{
		String s="";
		for(LoDat l:list)
		{
			s+=l.toString()+"\n";
		}
		return s;
	}
	public String layDanhSach(double X)
	{
		String s="";
		for(LoDat l:list)
		{
			if(l instanceof LoDatHinhChuNhat && l.tinhDienTich()>X)
			{
				s+=l.toString()+"\n";
			}
		}
		return s;
	}
	public void sapXepTheoDonGia()
	{
		Collections.sort(list, new Comparator<LoDat>()
		{
			public int compare(LoDat o1,LoDat o2)
			{
				Double d1=o1.getDonGia();
				Double d2=o2.getDonGia();
				return d2.compareTo(d1);
			}
		});
	}
	public void sapXepMa()
	{
		Collections.sort(list, new Comparator<LoDat>()
		{
			public int compare(LoDat o1,LoDat o2)
			{
				return o1.getMaSo().compareToIgnoreCase(o2.getMaSo());
			}
		});
	}
	public LoDat timThanhTienCaoNhat()
	{
		return Collections.max(list);
	}
}
