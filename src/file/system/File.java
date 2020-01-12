package file.system;

public abstract class File implements InterfaceFile{
	
	private String name;

	private Directory parent;
	
	File(){
		name = new String();
	}
	
	File(String name, Directory parent){
		this.name = name; 
		this.parent = parent;
	}
	
	File(String name){
		this.name = name; 
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override

	public Directory getParent() {
		return parent;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setParent(Directory dir) {
		this.parent = dir;
	}
	
	public String getPath() {
		if(name.equals("\\home")) {
			return name;
		}
		return parent.getPath().concat("\\" + name);
	}
}
