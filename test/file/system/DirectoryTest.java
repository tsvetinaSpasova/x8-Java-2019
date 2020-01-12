package file.system;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirectoryTest {

	@Test
	void constructors_Test() {
		Directory dir = new Directory ("\\home");
		assertEquals("\\home", dir.getName());
	}
	
	
	@Test
	void mkdir_Test() {
		Directory dir = new Directory ("\\home");
 		dir.mkdir("\\new");
		assertEquals("\\new", dir.getFiles().get("\\new").getName());
		
	}
	
	
	
	
}
