package bai3;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tamgiac [] tg = new tamgiac[5];
		tg[0] = new tamgiac();
		tg[1] = new tamgiac();
		tg[2] = new tamgiac();
		tg[3] = new tamgiac();
		tg[4] = new tamgiac();
		
		tg[0].tgMD();
		tg[1].tgMD();
		tg[2].tgMD();
		tg[3].tgMD();
		tg[4].tgMD();
		
		tg[0].setTG(2, 3, -4);
		
		tg[0].tinhCV();
		tg[0].tinhDT();
		tg[0].traveKTG();
		
		tg[1].setTG(2, 3, 7);
		
		tg[1].tinhCV();
		tg[1].tinhDT();
		tg[1].traveKTG();
		
		tg[2].setTG(2, 3, 4);
		
		tg[2].tinhCV();
		tg[2].tinhDT();
		tg[2].traveKTG();
		
		tg[3].setTG(2, 3, 3);
		
		tg[3].tinhCV();
		tg[3].tinhDT();
		tg[3].traveKTG();
		
		tg[4].setTG(3, 3, 3);
		
		tg[4].tinhCV();
		tg[4].tinhDT();
		tg[4].traveKTG();
		
		tg[0].setMc(2);
		tg[0].tinhCV();
		tg[0].tinhDT();
		tg[0].traveKTG();
		
		
		
		System.out.println(tg[0].toString());
		System.out.println(tg[1].toString());
		System.out.println(tg[2].toString());
		System.out.println(tg[3].toString());
		System.out.println(tg[4].toString());
		
		
		System.out.println(tg[0].toString());

	}

}
