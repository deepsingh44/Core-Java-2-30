import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Tea t = new Tea();
		t.setName("Taj");
		t.setPrice(50);
		t.setQuantity(100);

		Milk m = new Milk();
		m.setName("Amul");
		m.setPrice(29);
		m.setQuantity(1);

		Sugar s = new Sugar();
		s.setName("Sugar");
		s.setPrice(38);
		s.setQuantity(1);

		TeaShop teaShop = new TeaShop(t, m, s);
		TeaService teaService = new TeaService(teaShop);

		Scanner scanner = new Scanner(System.in);
		String callback = "";
		float coffie = 0;
		float tea = 0;
		do {
			int count = 1;
			System.out.println("Press 1 for tea");
			System.out.println("Press 2 for coffie");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				tea = tea + count;
				teaService.makeTea();
				break;
			case 2:

				coffie = coffie + count;
				teaService.makeCoffie();
				break;
			}

			System.out.println("Do you want to continue?(Y/N)");
			callback = scanner.next();
		} while (callback.equalsIgnoreCase("Y"));
		System.out.println("Your Bill Is: ");
		if (tea > 0) {
			System.out.println("Number of Tea " + tea + " : Total " + (tea * 10));
		}
		if (coffie > 0) {
			System.out.println("Number of Coffie " + coffie + " : Total " + (coffie * 15));
		}
		System.out.println("You Have to Pay : " + ((tea * 10) + (coffie * 15)) + " Rs. only");
	}
}
