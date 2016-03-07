package paguos.observer;

public class Test {
	
	public static void main(String[] args) {
		Subject subject = new Subject("Hello World");
		
		new CapsObserver(subject);
		new LengthObserver(subject);
		new WordsObserver(subject);
		
		subject.notifyObservers();
		
		subject.setState("Testing the Observer Design Pattern");
		
		subject.setState("");
		

	}

}
