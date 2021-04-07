
public class TeaShop {
	private Tea tea;
	private Milk milk;
	private Sugar sugar;

	public TeaShop(Tea tea, Milk milk, Sugar sugar) {
		this.sugar = sugar;
		this.milk = milk;
		this.tea = tea;
	}

	public Tea getTea() {
		return tea;
	}

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public Sugar getSugar() {
		return sugar;
	}

	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

}
