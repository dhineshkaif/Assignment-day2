package week1.day2;

public class Mobile {

	public void Makecall() {
		System.out.println("make a call");
	}

	public void Sendtext() {
		System.out.println("sendtext");
	}

	public void Browsingdata() {
		System.out.println("browsing");
	}

	public static void main(String[] args) {

		Mobile iphone = new Mobile();
		iphone.Makecall();
		iphone.Sendtext();
		iphone.Browsingdata();

	}

}
