package file.system.commands;

import file.system.Directory;
import file.system.Terminal;

//ls - lists the files in the directory you are located currently
//ls --sorted desc - list the files in the current directory sorted descending by size

public class Ls implements Command {
	
	//TODO exceptions
	
	
	@Override
	public String execute(String[] words, Terminal terminal) {
		
		Directory dir = terminal.getDirectory();
		
		if(words.length == 1) {
			return this.ls(words, dir);
		}
		return "Invalid command";
	}
	
	String ls(String[] words, Directory dir) {
		
		return dir.getNames();
	}
	
	
	//TODO this method
	String lsSorted(String[] words, Directory dir) {
		return " ";
	}

}
