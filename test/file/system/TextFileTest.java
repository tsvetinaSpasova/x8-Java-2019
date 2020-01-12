package file.system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TextFileTest {

	@Test
	void constructor_CreateObject_Equals() {
		Directory d = new Directory("\\home");
		TextFile f = new TextFile("file.txt", d );
		assertEquals("file.txt", f.getName());
		assertEquals("\\home", f.getParent().getName());
	}
	
	@Test
	void appendAndRead_Check_Equals() {
		
		Directory d = new Directory("\\home");
		TextFile f = new TextFile("test.txt", d);
		f.append("Every thing is amazing");
		assertEquals("Every thing is amazing", f.read());
	}
}
