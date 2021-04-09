//Super Keyword
//1.super keyword is used
//to remove confliction between parent class and child class.
class Papa {
	String name = "papa";
}

public class Super1 extends Papa {
	String name = "Beta";

	void showName() {
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		new Super1().showName();
	}
}
