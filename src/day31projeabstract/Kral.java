package day31projeabstract;

public class Kral extends Otel {

	public static void main(String[] args) {
	Kral krl = new Kral();
		krl.cay();
		krl.kahvalti();
		krl.wifi();
		}
	@Override
	public void kahvalti() {
		System.out.println("kahvalti var");
		
	}
	@Override
	public void cay() {
		System.out.println("Cay ic");
	}
	 
	 }
	 
