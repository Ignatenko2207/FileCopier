package org.itstep;

public class FCRunner {

	public static void main(String[] args) {
//		String fromPath = "C:\\test\\cats.jpg";
//		String toPath = "D:\\test2\\cats2.jpg";
//		FileIO fileIO = new FileIO();
//		fileIO.copyFile(fromPath, toPath);
//		System.out.println("File copied!");
		
		String fromPath2 = "C:\\test\\tempParsedFile.txt";
		String toPath2 = "D:\\test2\\tempParsedFile.txt";
		FileIO.copyTextFile(fromPath2, toPath2);
		//fileIO.copyTextFile(fromPath2, toPath2);
		System.out.println("File copied!");
	}

}
