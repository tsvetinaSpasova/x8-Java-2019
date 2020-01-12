package file.system;

//
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import java.util.Scanner;
import file.system.commands.*;

public class Terminal {
	
	Directory root;
	Directory currentDir;
	Map <String, Command> commands;
	
	
	public Terminal() {
		root = new Directory("\\home");
		root.setParent(root);
		currentDir = root;
		commands = new HashMap<>();
		commands.put("cat", new Cat());
		commands.put("cd", new Cd());
		commands.put("ls", new Ls());
		commands.put("write", new Write());
		commands.put("mkdir", new Mkdir());
		commands.put("create_file", new Create_file());
	}
	
	public Directory getDirectory() {
		return currentDir;
	}
	
	public void setDirectory(Directory dir) {
		currentDir = dir;
	}
		
	void execute ()  {
		String command = null;
		Scanner sc = new Scanner(System.in); 
		do { 
			System.out.print(currentDir.getPath() + "> ");
			command = sc.nextLine();
			String[] words = command.split(" ");
			
			if(commands.get(words[0]) == null) {
				if(!words[0].equals("exit")) {
					System.out.println("Wrong command!");
				}
			}
			else {
				System.out.println(commands.get(words[0]).execute(words, this));
			}
		}while(!command.equals("exit"));
		
		sc.close();
		
	}
	
	//HashMap<String, Command> wed;
	
}