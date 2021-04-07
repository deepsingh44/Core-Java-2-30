import java.util.Scanner;

public class ShopTest {

	public float getPriceById(Products[] products, int id) {
		float unit = 0.0f;
		for (int i = 0; i < products.length; i++) {
			Products p = products[i];
			if (p.getId() == id) {
				unit = p.getPrice();
			}
		}
		return unit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Electronic e1 = new Electronic();
		e1.setName("Bulb");
		e1.setPrice(45);
		e1.setQuantity(20);
		e1.setId(1);

		Electronic e2 = new Electronic();
		e2.setName("Fan");
		e2.setPrice(450);
		e2.setQuantity(5);
		e2.setId(2);

		Men m1 = new Men();
		m1.setId(3);
		m1.setName("Tshirt");
		m1.setPrice(350);
		m1.setQuantity(10);

		Men m2 = new Men();
		m2.setId(4);
		m2.setName("Jeans");
		m2.setPrice(1350);
		m2.setQuantity(10);

		Products[] products = new Products[4];
		products[0] = e1;
		products[1] = e2;
		products[2] = m1;
		products[3] = m2;

		for (int i = 0; i < products.length; i++) {
			Products p = products[i];
			System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getQuantity());
		}

		System.out.println("Enter product id");
		int id = scanner.nextInt();
		System.out.println("enter quantity of this id");
		int quantity = scanner.nextInt();
		// call a service to get price by id
		float unitprice=new ShopTest().getPriceById(products, id);
		System.out.println("Your bill is : " + (quantity * unitprice));

	}
}
