package file.system.commands;

import file.system.Directory;
import file.system.Terminal;

//mkdir < dir_name > - creates a directory inside your
//imaginary file system, in the location you are currently
//located, so if you start you app and type "mkdir my-new-dir"
//it creates "/home/my-new-dir" as a directory which is empty, 
//leaves you in the directory you are and then with cd my-new-dir 
//locates you inside that newly created directory

public class Mkdir implements Command{

	
	@Override
	public String execute(String[] words, Terminal terminal) {
		
		Directory dir = terminal.getDirectory();
		
		if(words.length == 2 && !words[1].contains(".")) {
			dir.mkdir(words[1]);
			return "";
		}
		return "Wrong command";
	}
}
