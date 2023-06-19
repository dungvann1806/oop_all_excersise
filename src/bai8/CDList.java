package bai8;

public class CDList {
	private CD[] list;

	public CDList(int n) {
		list = new CD[n];
	}

	public boolean addList(int maCD, String tuaCD, int soBaiHat, double giaThanh) throws Exception {
		for (int i = 0; i < list.length; i++) {

			if (list[i] == null) {
				list[i] = new CD(maCD, tuaCD, soBaiHat, giaThanh);
				return true;
			} else if (maCD == list[i].getMaCD()) {
				throw new Exception("Lỗi: Mã trùng!");
			}

		}
		throw new Exception("Lỗi: Mảng đầy!");
	}

	public int demSoCD() {
		int temp = 0;
		for (CD i : list) {
			if (i != null)
				temp++;
		}
		return temp;
	}

	public boolean xoaCD(int maCD) {
		int i = 0, temp = 0;
		while (list[i] != null) {
			if (list[i].getMaCD() != maCD) {
				list[temp] = list[i];
				temp++;
			}
			i++;
		}
		if (temp == i)
			return false;
		else {
			list[--i] = null;
			return true;
		}
	}

	public double tinhTongGiaThanhCD() {
		double tong = 0;
		for (CD i : list) {
			if (i != null)
				tong += i.getGiaThanh();
		}
		return tong;
	}

	public boolean searchCD(int maCD) {
		for (CD i : list) {
			if (i != null)
				if (i.getMaCD() == maCD)
					return true;
		}
		return false;
	}

	public void sortByPrice() {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] != null) {
				for (int j = i + 1; j < list.length; j++) {
					if (list[j] != null) {
						if (list[i].getGiaThanh() < list[j].getGiaThanh()) {
							CD temp = list[i];
							list[i] = list[j];
							list[j] = temp;
						}
					}
				}
			}
		}
	}

	public void sortByName() {
		
		
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] != null) {
				for (int j = i + 1; j < list.length; j++) {
					if (list[j] != null) {
						if (list[i].getTuaCD().compareTo(list[j].getTuaCD()) > 0) {
							CD temp = list[i];
							list[i] = list[j];
							list[j] = temp;
						}
					}
				}
			}
		}
	}

	public String toString() {
		String ds = "";
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null)
				ds += list[i] + "\n";
		}

		return String.format("Danh sách đĩa CD \n%s", ds);
	}

}
