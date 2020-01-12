package file.system;

import file.system.TextFile;

public class Main {
	public static void main(String[] args) {
		//TODO: change .contains() with method type()
		Terminal user = new Terminal();
		TextFile child = new TextFile("text.txt", user.getDirectory());
		child.write(1, "yes");
		user.getDirectory().append(child);
		user.execute();
		
//		Directory home = new Directory("\\home");
//		ObjFile ob = new Directory ("\\java", home);
//		System.out.println(ob.getName());
//		System.out.println(home.getName());
		
//		File f = new File("test.txt", home);
		
//		f.write();	
//		System.out.println(f.read());
		
//		System.out.println(f.getName());
//		System.out.println(f.getPath().getName());
//		f.append("Every thing is amazing");
//		f.append("God is good");
//		System.out.println(f.read());
	}
}
