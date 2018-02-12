package paguos.command;

public class BuyProduct implements Order {
	
	private Product product;
	private int quantity;
	
	public BuyProduct(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	@Override
	public void execute() {
		product.sell(quantity);
	}

}
