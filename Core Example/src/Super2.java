//Super Keyword
//2.we can never use super keyword as a 
//return statement or as an arguments.

//Note : we can never use super keyword inside static context.

class DadaPapa{
	String name = "DadaPapa";
}
class Dada extends DadaPapa{
	String name = "Dada";
}

class Papa1 extends Dada {
	String name = "papa";
}

public class Super2 extends Papa1 {
	String name = "Beta";

	void showName() {
		System.out.println(name);
		System.out.println(super.name);
		Dada d=this;//upcasting
		System.out.println(d.name);
		DadaPapa p=this;
		System.out.println(p.name);
	}

	public static void main(String[] args) {
		new Super2().showName();
	}
}
