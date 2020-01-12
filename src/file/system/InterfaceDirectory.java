package file.system;

import java.util.Map;

public interface InterfaceDirectory extends InterfaceFile {

	public Map<String, File> getFiles ();
	public void append(File child);
	public void mkdir(String name);
	public String getNames();
}
