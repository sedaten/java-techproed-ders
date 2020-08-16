package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
	E01 obj = new E01();

	System.out.println(obj.getSifre());//123456
	System.out.println(obj.getisim());
	System.out.println(obj.getpin());
	obj.setSifre(98765);
	System.out.println(obj.getSifre());//98765
	
	obj.setpin(6543);
	System.out.println(obj.getpin());
	obj.setisim("emre");
	System.out.println(obj.getisim());
	
	
	E03 ob = new E03();
	System.out.println(ob.getIsim());//kemal Dogru
	System.out.println(ob.getYas());//23
	
	ob.setBorc(2300.24f);//Borc degistirildi ama okuyamiyorum get yok
   
	ob.setYas((byte)  25);
	System.out.println(ob.getYas());//25
	
	
	
	
	
	}
	
}
