class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal {
}

class BabyDog extends Dog {
}

public class Overload {

	void add(Dog dog) {
		System.out.println("hello1");
	}

	void add(BabyDog d) {
		System.out.println("hello2");
	}
	
	void add(Lion d) {
		System.out.println("hello3");
	}

	public static void main(String[] args) {
		//Overload o = new Overload();
		//o.add(null);
		//System.out.println(null);

	}
}
