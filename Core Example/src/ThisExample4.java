//this keyword
//4.We can pass this keyword as an argument.

//Note :
//this keyword can never used inside static context.

class A {

	void address(ThisExample4 t) {
		System.out.println(t.name);
		System.out.println(t);
	}

}

public class ThisExample4 {
	String name = "Deep Singh";

	void takeMyAddress() {
		new A().address(this);
	}

	public static void main(String[] args) {
		ThisExample4 tt = new ThisExample4();
		/*
		 * System.out.println(tt); new A().address(tt);
		 */
		tt.takeMyAddress();
	}
}
