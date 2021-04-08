//this() is used to call local constructor chaining.
//this() must be used inside constructor only.
//this() must be the first statement.
public class ThisConstructor {
	int size;

	public ThisConstructor(int size) {
		this.size = size;
	}

	public ThisConstructor() {
		// new ThisConstructor(10);
		this(10);
	}

	public static void main(String[] args) {
		ThisConstructor t = new ThisConstructor(100);
		System.out.println(t.size);

	}

}
