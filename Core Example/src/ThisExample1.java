//this keyword
//1.this is a keyword that is used to remove confliction between 
//local variable and instance variable.

public class ThisExample1 {
	String name;

	void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		ThisExample1 t=new ThisExample1();
		System.out.println(t.name);
		t.setName("Deep Singh");
		System.out.println(t.name);
	}
}
