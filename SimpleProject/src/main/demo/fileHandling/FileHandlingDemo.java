package main.demo.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileHandlingDemo {
//	Stream -> Logical reference to input source

	/**
	 * 1. Byte Stream -> Read and write Bytes 2. Char Stream -> Read and write 1
	 * Char (1 Char = Bytes) 3. Buffered Stream -> Wrapper for Byte or Char Stream
	 * 4. Object Stream -> Read and write all Objects
	 **/

	public static void main(String[] args) {
//		fileInputStream();
//		fileOutputStream();
//		fileInputStream();
		fileReader();
		fileWritter();
		fileReader();
	}

	private static void fileInputStream() {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\manm\\git\\javademos\\SimpleProject\\src\\file1");
		int ch;
		try {
			FileInputStream fis = new FileInputStream(file);
			System.out.println("File Opened for read");
//			System.out.println("-----------");
			System.out.println("Data:");
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}
			fis.close();
			System.out.println("\n-----------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void fileOutputStream() {
		File file = new File("C:\\Users\\manm\\git\\javademos\\SimpleProject\\src\\file1");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			System.out.println("File Opened for write");
//			System.out.println("-----------");
			Random random = new Random();
			int num = random.nextInt() % 10;
			String data = "Writting from program updated " + num;
			fos.write(data.getBytes());
			System.out.println("File Writtend Successfully");
			fos.close();
			System.out.println("-----------");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void fileReader() {
		File file = new File("C:\\Users\\manm\\git\\javademos\\SimpleProject\\src\\file1");
		int ch ;
		try {
			FileReader fr = new FileReader(file);
			System.out.println("File Opened for read");
//			System.out.println("-----------");
			System.out.println("Data:");
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			fr.close();
			System.out.println("\n-----------");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void fileWritter() {
		File file = new File("C:\\Users\\manm\\git\\javademos\\SimpleProject\\src\\file1");
		try {
			FileWriter fos = new FileWriter(file);
			System.out.println("File Opened for write");
//			System.out.println("-----------");
			Random random = new Random();
			int num = random.nextInt() % 10;
			String data = "Writting from program updated " + num;
			fos.write(data);
			System.out.println("File Writtend Successfully");
			fos.close();
			System.out.println("-----------");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
