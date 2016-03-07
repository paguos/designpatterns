package paguos.proxy;

public class ProxyFile  implements File{
	
	private RealFile realFile;
	private String fileName;
	
	public ProxyFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void save() {
		if(realFile == null){
			realFile = new RealFile(fileName);
		}
		realFile.save();
	}

	@Override
	public void open() {
		if(realFile == null){
			realFile = new RealFile(fileName);
		}
		realFile.open();
	}

	@Override
	public void write() {
		if(realFile == null){
			realFile = new RealFile(fileName);
		}
		realFile.write();
	}

}
