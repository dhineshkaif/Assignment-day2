package week1.mobile;

public class Mymobile {
	public void Makecall() {
		System.out.println("make a call");
	}

	public void sendMessage(){
		System.out.println("sendtext");
	}

	public void shareDocument(){
		System.out.println("share");
	}

	public static void main(String[] args) {
	  Mymobile oneplus = new Mymobile();
         oneplus.Makecall();
         oneplus.sendMessage();
         oneplus.shareDocument();
	}

}
