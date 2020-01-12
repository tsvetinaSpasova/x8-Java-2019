package file.system.commands;

import file.system.Directory;
import file.system.Terminal;

//cd < location > - by default you should be located at /home 
//and this directory should be empty and in "/" folder there 
//should be only one directory called home which is empty. 
//The "cd" operation moves inside a directory < location > in
//the current folder. So the following sequence should work - 
//start your console app, "cd .." - that goes back 
//(cd . goes where you are currently, so does nothing)
//and you are in "/" and then "cd home" goes in "/home"

public class Cd implements Command {
	
	@Override
	public String execute(String[] words, Terminal terminal) {
		Directory dir = terminal.getDirectory();
		
		if(dir.getFiles().get(words[1]) != null) {
			if(words[1].contains(".")) {
				return "Invalid directory";
			}
			else {
				terminal.setDirectory((Directory)dir.getFiles().get(words[1]));
				return "";
			}
		}
		
		if(words[1].equals("..")) {
			terminal.setDirectory(dir.getParent());
			return "";
		}
		
		if(words[1].equals(".")) {
			return "";
		}
		
		return "Wrong command";
	}
	
	
}
