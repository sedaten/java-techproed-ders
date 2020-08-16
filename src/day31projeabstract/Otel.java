package day31projeabstract;

public abstract class Otel {
/*
1) abstract class'i final yapamayiz cunku final class'larin child class'lari olamaz; halbuki biz 
abstract class'lari child class'lari olsun ve child class'lari bazi seyleri yapmaya mecbur biraksin diye olustururuz.
Bu celiskiden dolayi Java abstract class'larin final olmasina musaade etmez, Compile Time Error verir.
2)abstract methodlar da final olamazlar. Cunku final olursa override edilemezler, 
halbuki biz abstrackt methodlari override yapmak icin olustururuz.
3)abstract methodlar da private olamazlar. Cunku private olursa override edilemezler, 
halbuki biz abstrackt methodlari override yapmak icin olustururuz.
 */
	
	public abstract void kahvalti();
	
	public void wifi() {
		System.out.println("Wifi var");
	}
    public void cay() {
    	System.out.println("7/24 Cay servisi");
    }
}
