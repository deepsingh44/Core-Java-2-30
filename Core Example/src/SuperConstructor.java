//super()
//1.super() is used to initialized parent class property.
//or super() is used to call parent class constructor. 

//Note :
//super() must be call inside constructor and that 
//must be the first statement.

class DadaG{
	String name;

	DadaG(String name) {
		this.name = name;
	}
}
class PapaG extends DadaG {
	String name;

	PapaG(String name,String ppname) {
		super(ppname);
		this.name = name;
	}
}

public class SuperConstructor extends PapaG {
	String name;

	public SuperConstructor(String name,String pname,String dname) {
		super(pname,dname);
		this.name = name;
	}

	void showAllName() {
		System.out.println(name);
		System.out.println(super.name);
		DadaG d=this;
		System.out.println(d.name);
	}
	
	public static void main(String[] args) {
		SuperConstructor sp = new SuperConstructor("Deep Singh","Papa Name","Dada Name");
		sp.showAllName();
		/*System.out.println(sp.name);
		PapaG p=sp;
		System.out.println(p.name);
		DadaG pp=sp;
		System.out.println(pp.name);*/
	}
}
