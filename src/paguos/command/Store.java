package paguos.command;

import java.util.LinkedList;
import java.util.List;

public class Store {
	
	private List<Order> orders;
	
	public Store(){
		orders = new LinkedList();
	}
	
	public void takeOrders(Order...orders){
		for(Order o: orders)
			this.orders.add(o);
	}
	
	public void executeOrders(){
		for(Order o: orders)
			o.execute();
		orders.clear();
	}

}
