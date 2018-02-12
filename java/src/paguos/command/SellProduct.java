package paguos.command;

public class SellProduct implements Order {
	
	private Product product;
	private int quantity;
	
	public SellProduct(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	@Override
	public void execute() {
		product.sell(quantity);
	}

}
