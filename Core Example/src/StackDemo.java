
public class StackDemo {
	int[] stack;
	int index;

	public StackDemo(int size) {
		stack = new int[size];
		index = stack.length - 1;
	}

	public void push(int item) {
		if (index == -1) {
			System.out.println("Stack is full");
		} else {
			stack[index--] = item;
		}
	}

	public void show() {
		for (int i = 0; i < stack.length; i++) {
			if(stack[i]!=0) {
				System.out.println(stack[i]);
			}
		}
	}

	public void pop() {
		if(index!=stack.length-1) {
			System.out.println(stack[++index]);
			stack[index] = 0;
		}else {
			System.out.println("please add item in stack");
		}
	}

}
