package paguos.proxy;

public class Test {

	public static void main(String[] args) {
		
		File proxyFile= new ProxyFile("text.html");
		
		proxyFile.open();
		proxyFile.write();
		proxyFile.save();
		proxyFile.write();
		proxyFile.save();

	}

}
