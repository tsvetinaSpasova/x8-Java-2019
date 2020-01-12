package file.system;


import java.util.HashMap;
import java.util.Map;


public class Directory extends File implements InterfaceDirectory{

	private Map<String, File> children;	
	
	public Directory(){
		super();  
		children = new HashMap<>();
	}
	
	
	public Directory(String name){
		super(name);
		children = new HashMap<>();
	}
	
	
	Directory(String name, Directory parent){
		super(name, parent);
		children = new HashMap<>();
	}
	

	@Override
	public Map<String, File> getFiles() {
		return children;
	}

	@Override
	public void append(File child) {
		children.put(child.getName(), child);
	}


	@Override
	public void mkdir(String child) {
		Directory newDir = new Directory(child);
		newDir.setParent(this);
		children.put(child, newDir);
	}


	@Override
	public String getNames() {
		return children.keySet().toString();

	}


	@Override
	public void write(int numLine, String text) {
		//TODO throw new DirectoryException();
	}
	
	public void setChildren(Map<String, File> newChildren) {
		this.children = newChildren;
	}
	
	public void setDir(Directory dir) {
		this.setName(dir.getName());
		this.setParent(dir.getParent());
		this.setChildren(dir.getFiles());
		
	}
	
	//Directory(String name)
	
}
