package file.system.commands;

import file.system.TextFile;
import file.system.Directory;
import file.system.Terminal;


//create_file < file_name > - creates an empty file
//with name inside the folder you are currently in.

public class Create_file implements Command{
	
	
	
	@Override
	public String execute(String[] words, Terminal terminal) {
		
		Directory dir = terminal.getDirectory();
		
		if(words.length != 2 || !words[1].contains(".")) {
			return "Wrong command!";
		}
		TextFile newFile = new TextFile (words[1], dir);
		dir.append(newFile);
		
		return "";
	}
}
