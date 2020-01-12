package file.system.commands;

import file.system.Directory;
import file.system.Terminal;

//write < file_name > < line_number > < line_content > -
//writes into a file with given name into its < line_number >
//the < line_content >. By default it appends into the line,
//if (-overwrite) is given then replaces the line content.
//Example: start program, mkdir test, cd test, create_file f.txt, 
//write f.txt 2 hello, cat f.txt - displays the first line as empty 
//line and on second line is written hello.

public class Write implements Command{
	
	//TODO exceptions
	
	@Override
	public String execute(String[] words, Terminal terminal){
		
		Directory dir = terminal.getDirectory();
		
		if(words.length >= 4) {
			StringBuilder text = new StringBuilder();
			for(int i = 3; i <words.length; i++) {
				text.append(words[i] + " ");
			}
			dir.getFiles().get(words[1]).write(Integer.parseInt(words[2]),text.toString());
			return "";
		}
		else {
			return "Wrong command!";
		}
	}
	
//	boolean validName(String word) {
//		
//		if(user.getDirectory().getList().containsKey(word)) {
//			return true;
//		}
//
//		return false;
//		
//	}
}
