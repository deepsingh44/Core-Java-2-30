//How to achieve inheritance
//using extends keyword or implements keyword 
//always create instance of child class.
//We can create reference variable of parent class to achieve loose coupling.
//Always loaded parent class first

class DD {
	DD(int i) {
		System.out.println("DADA");
	}
}

class Pen extends DD {
	Pen() {
		super(10);
		System.out.println("Papa");
	}
}

//is-a relationship
class BP extends Pen {
	BP() {
		super();
		System.out.println("Child");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		new BP();
	}
}
