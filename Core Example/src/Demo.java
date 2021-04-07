import java.util.Scanner;

//Array
//Array is collection of similar data type.
//Array has fixed size.
//Array index always start from 0.
//Array length always start from 1.
//There are two types of Array:
//i)Single Dimenssion
//ii)Multi Dimenssion
//Single array always have single square bracket while multi having more than 1 square bracket.
//There are following way to initialize an array:
//1.int [] rolls=null;//null initialization
//2.int [] rolls={};//Empty initialization
//3.int [] rolls={1,2,3,4};//Value initialization
//4.int [] rolls=new int[10];//Size initialization

public class Demo {
	private int[] rolls = {};

	Demo(int size) {
		rolls = new int[size];
	}

	public void addRolls(int[] rolls) {
		this.rolls = rolls;
	}

	public void showRolls() {
		for (int i = 0; i < rolls.length; i++) {
			System.out.println(rolls[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter size of an array");
		int size = scanner.nextInt();
		Demo d = new Demo(size);

		int[] rolls = new int[size];

		for (int i = 0; i < rolls.length; i++) {
			System.out.println("Enter nums");
			rolls[i] = scanner.nextInt();
		}

		d.addRolls(rolls);

		d.showRolls();

	}
}
