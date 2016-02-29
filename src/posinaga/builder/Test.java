package posinaga.builder;

import posinaga.builder.BetterAuto.AutoBuilder;

public class Test {
	
	public static void main(String[] args) {
		Owner o1 = new Owner("Tony");
		Owner o2 = new Owner("Sam");
		Owner o3 = new Owner("Matt");
		
		Auto auto =  new Auto("Nisan Lift", 25000, 2015, "Red",180);
		
		BetterAuto betterAuto;
		try {
			betterAuto = new BetterAuto(new AutoBuilder("Tesla Model S")
					.color(Color.White)
					.maxSpeed(300)
					.price(70000)
					.year(2014)
					.owners(o1,o2)
					.owners(o3)
					.build());
		} catch (Exception e) {}
	}

}
