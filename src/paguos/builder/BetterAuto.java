package paguos.builder;

import java.util.LinkedList;
import java.util.List;

public class BetterAuto {
    	
		private final String name; //required
		private double price;
		private int year;
		private Color color;
		private double maxSpeed;
		private List<Owner> owners;
		
		public BetterAuto(AutoBuilder builder){
			this.name = builder.name;
			this.price = builder.price;
			this.year = builder.year;
			this.color = builder.color;
			this.maxSpeed = builder.maxSpeed;
			this.owners = builder.owners;
		}
		
		static class AutoBuilder{
			
			private final String name; //required
			private double price;
			private int year;
			private Color color;
			private double maxSpeed;
			private List<Owner> owners;
			
			public AutoBuilder(String name){
				this.name = name;
				owners = new LinkedList();
			}
			
			public AutoBuilder price(double price){
				this.price = price;
				return this;
			}
			
			public AutoBuilder year(int year){
				this.year = year;
				return this;
			}
			
			public AutoBuilder color(Color color){
				this.color = color;
				return this;
			}
			
			public AutoBuilder maxSpeed(double maxSpeed){
				this.maxSpeed = maxSpeed;
				return this;
			}
			
			public AutoBuilder owners(Owner...owners){
				for(Owner o: owners)
					this.owners.add(o);
				return this;
			}
			
			public AutoBuilder build() throws Exception{
				if(owners.size() > 0){
					return this;
				}else{
					throw new Exception("We need at least one owner!");
				}
			}
			
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}

		public double getMaxSpeed() {
			return maxSpeed;
		}

		public void setMaxSpeed(double maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public List<Owner> getOwners() {
			return owners;
		}

		public void setOwners(List<Owner> owners) {
			this.owners = owners;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "BetterAuto [name=" + name + ", price=" + price + ", year=" + year + ", color=" + color
					+ ", maxSpeed=" + maxSpeed + ", owners=" + getOwnersString() + "]";
		}
		
		public String getOwnersString(){
			String str = "";
			for(Owner o: owners)
				str += o.toString() + " ";
			return str;
		}

}
