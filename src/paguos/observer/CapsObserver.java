package paguos.observer;

public class CapsObserver extends Observer{
	
	public CapsObserver(Subject subject){
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Upper Case Chars: " + countUpperCase());
		System.out.println("Lower Case Chars: " + countLowerCase());
	}
	
	private int countLowerCase(){
		String str = subject.getState();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(Character.isLowerCase(str.charAt(i)))
				count++;
		}
		return count;
	}
	
	private int countUpperCase(){
		String str = subject.getState();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++){
			if(Character.isUpperCase(str.charAt(i)))
				count++;
		}
		return count;
		
	}

}
