package paguos.composite;

public class Test {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("George V", "King", 70);
		
		Person p2 = new Person("George VI", "King", 56);
		Person p3 = new Person("Henry", "Prince / Duke of Gloucester", 74);
		Person p4 = new Person("George", "Prince / Duke of Kent", 39);
		
		p1.add(p2,p3,p4);
		
		Person p5 = new Person("Elizabeth II", "Queen", 89);
		p2.add(p5);
		
		Person p6 = new Person("Richard", "Prince / Duke of Gloucester", 71);
		p3.add(p6);
		
		Person p7 = new Person("Edward", "Prince / Duke of Kent", 80);
		Person p8 = new Person("Alexandra", "Princess", 79);
		Person p9 = new Person("Michael", "Prince", 73);
		
		p4.add(p7,p8,p9);
		
		//Print the family three
		
		System.out.println(p1);
		
		for(Person child: p1.getChildren()){
			System.out.println(child);
			
			for(Person child1: child.getChildren()){
				System.out.println(child1);
			}
		}
		
	}

}
