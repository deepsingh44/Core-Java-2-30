//this keyword
//2.this keyword is used to hold address of current instance.

public class ThisExample2 {
	void show() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisExample2 t = new ThisExample2();
		System.out.println(t);
		t.show();
		System.out.println("**********");
		ThisExample2 t1 = new ThisExample2();
		System.out.println(t1);
		t1.show();
		
	}
}
