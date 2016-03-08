package paguos.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {
	
	List<Observer> observers;
	private String state;
	
	public Subject(String state) {
		observers = new LinkedList();
		setState(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("\nCurrent State: " + state + "\n");
		notifyObservers();
	}
	
	public void removeObserver(Observer observer){
        observers.remove(observer);
    }
	
	public void registerObserver(Observer...observers){
		for(Observer o: observers)
			this.observers.add(o);
	}
	
	public void notifyObservers(){
		for(Observer o: observers)
			o.update();
	}

}
