package file.system;

public interface InterfaceTextFile extends InterfaceFile {
	
	public String read ();
	public void append(String text);
	public void replaceLine(int numOfLine, String text);
	
}
