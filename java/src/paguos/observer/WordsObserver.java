package paguos.observer;

public class WordsObserver extends Observer {
	
	public WordsObserver(Subject subject){
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Words: " + countWords());

	}
	
	private int countWords(){
		String str = subject.getState();
        int count = 1;
        
        if(str.isEmpty())
        	return 0;
        
        for (int i = 0 ;i <= str.length() - 1 ; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
                count++;
        }
        return count;
    }

}
