package day25encapsulation;

public class E03 {

	private byte yas = 23;
	private float borc = 6500.0f;
	private String isim = "kemal Dogru";
	private boolean zengin = true;
	
	
	public static void main(String[] args) {
		

	}

	public byte getYas() {
		return yas;
	}

	public void setYas(byte yas) {
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setBorc(float borc) {
		this.borc = borc;
	}
//Java booleanlar icin getter methodu yaparken  "is" ile baslatir. 
	public boolean isZengin() {
		return zengin;
	}

	public void setZengin(boolean zengin) {
		this.zengin = zengin;
	}

}
