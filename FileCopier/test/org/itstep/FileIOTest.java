package org.itstep;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileIOTest {

	@Test
	public void testCopyFile() {
		String fromPath = "C:\\test\\cats.jpg";
		String toPath = "D:\\test2\\cats2.jpg";
		
		FileIO fileIO = new FileIO();
		fileIO.copyFile(fromPath, toPath);
		
		byte[] bytes = fileIO.readDataFromFile(toPath);
		assertTrue(bytes.length > 0);
		
		
		File file = new File(toPath);
		file.delete();
	}

	@Test
	public void testCopyTextFile() {
		
	}

}
