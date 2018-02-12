package paguos.command;

public class Test {
	
	public static void main(String[] args) {
		
		Product iPad = new Product("iPad Air", 399);
		Product iPhone = new Product("iPhone 6", 599);
		Product beatsSolo = new Product("Beats Solo", 150);
		
		Store appleStore = new Store();
		
		//Buying Orders
		
		Order o1 = new BuyProduct(iPad, 10);
		Order o2 = new BuyProduct(iPhone, 15);
		Order o3 = new BuyProduct(beatsSolo, 5);
		
		//Selling Orders
		
		Order o4 = new SellProduct(iPad, 2);
		Order o5 = new SellProduct(iPhone, 3);
		Order o6 = new SellProduct(beatsSolo, 4);
		
		appleStore.takeOrders(o3,o2,o1, o5,o6,o4);
		appleStore.executeOrders();
		
	}

}
