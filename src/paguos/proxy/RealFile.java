package paguos.proxy;

public class RealFile implements File {
	
	private String fileName;

	public RealFile(String fileName) {
		this.fileName = fileName;
		open();
	}

	@Override
	public void save() {
		System.out.println("SAVING: " + fileName);
	}

	@Override
	public void open() {
		System.out.println("OPENING: " + fileName);
	}

	@Override
	public void write() {
		System.out.println("WRITING: " + fileName);
	}

}
