
public class TeaService {
	private TeaShop teaShop;

	public TeaService(TeaShop teaShop) {
		this.teaShop = teaShop;
	}

	public void makeTea() {
		if (teaShop.getTea() == null) {
			System.out.println("purchase tea");
		} else if (teaShop.getMilk() == null) {
			System.out.println("purchase milk");
		} else if (teaShop.getSugar() == null) {
			System.out.println("purchase sugar");
		} else {
			System.out.println("enjoy tea....");
		}

	}
	
	public void makeCoffie() {
		if (teaShop.getTea() == null) {
			System.out.println("purchase tea");
		} else if (teaShop.getMilk() == null) {
			System.out.println("purchase milk");
		} else if (teaShop.getSugar() == null) {
			System.out.println("purchase sugar");
		} else {
			System.out.println("enjoy coffie....");
		}

	}
}
