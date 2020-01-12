package file.system.commands;


import file.system.Directory;
import file.system.Terminal;
import file.system.TextFile;


//cat < file_name > - displays the file contents

//TODO exceptions

public class Cat implements Command {
	
	public Cat(){
		
	}
	
	@Override
	public String execute(String[] words, Terminal terminal) {
		Directory dir = terminal.getDirectory();
		if(words.length  == 2) {
			
			if(dir.getFiles().get(words[1]) != null) {
				if(words[1].contains(".")) {
					TextFile file = (TextFile) dir.getFiles().get(words[1]); //if file not found throw exception
					return file.read();
				}
				else {
					return "The file doesn't exist!";
				}
			}
			else {
				return "The file doesn't exist!";
			}
		}
		// TODO if this name is a name of directory, write a message 
		//throw exception
		
		return "Wrong command";
	}

	

}
