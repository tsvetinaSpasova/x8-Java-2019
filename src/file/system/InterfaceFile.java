package file.system;

public interface InterfaceFile {
	
	public String getName();
	public Directory getParent();
	public void write(int numLine, String text);
}
