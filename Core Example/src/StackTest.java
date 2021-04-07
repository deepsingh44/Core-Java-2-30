
public class StackTest {
	public static void main(String[] args) {
		StackDemo stackDemo = new StackDemo(4);
		/*stackDemo.push(10);
		stackDemo.push(20);
		stackDemo.push(30);
		stackDemo.push(40);
		stackDemo.push(50);*/
		
		//stackDemo.show();
		
		stackDemo.pop();
		stackDemo.pop();
		System.out.println("********************");
		stackDemo.show();
		
	}

}
