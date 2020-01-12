package file.system;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TextFile extends File implements InterfaceTextFile{

	private Map<Integer, String> content;
	
	public TextFile(){
		super();
		content = new HashMap<>();
	
	}
	
	public TextFile(String name, Directory parent){
		super(name, parent);
		content = new HashMap<>();
		content.put(1, "");
	}

	@Override
	public void append (String text) {
		int max = Collections.max(content.keySet());
		content.put(++max, text);
	}

	@Override
	public void replaceLine(int numOfLine, String text) {
		content.replace(numOfLine, text);	
	}

	@Override
	public String read() {
		StringBuilder temp = new StringBuilder();
		int max = Collections.max(content.keySet());
		
		for(int line = 1; line <= max; line++) {
			temp.append(content.get(line));
			temp.append(System.getProperty("line.separator"));
		}
		String result = temp.toString();
		return result;
	}

	

	@Override
	public void write(int numOfLine, String text) {
		content.put(numOfLine, text);
	}
	
	
}
 