//this keyword
//3.We can return this keyword as a return type.

public class ThisExample3 {

	ThisExample3 a() {
		System.out.println("a");
		return this;
	}

	ThisExample3 b() {
		System.out.println("b");
		return this;
	}

	ThisExample3 c() {
		System.out.println("c");
		return this;
	}

	public static void main(String[] args) {
		new ThisExample3().a().b().c();
		
		/*ThisExample3 tt=new ThisExample3();
		tt.a();
		tt.b();
		tt.c();*/
		
	}
}
