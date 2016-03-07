package paguos.proxy;

public class Test {

	public static void main(String[] args) {
		
		File proxyFile= new ProxyFile("text.html");
		
		proxyFile.write();
		proxyFile.write();
		proxyFile.save();

	}

}
