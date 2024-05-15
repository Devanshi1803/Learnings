package Learn;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Stu implements Serializable {
	private static final long serialVersionUID = 1L; // Adding serialVersionUID

	String name;
	int age;

	public Stu(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class OperationsIO {
	public static void main(String[] arf) {
		String filename = "output.txt";
		
		// 1
		// Create a File object with the file name
		System.out.println("---1---");

		File file = new File(filename);
		String absolutePath = file.getAbsolutePath();
		System.out.println("Absolute Path of " + filename + ": " + absolutePath);
		try (PrintWriter writer = new PrintWriter(filename)) {

			writer.println("Hello, PrintWriter!");
			writer.printf("Formatted: %d, %s%n", 42, "value");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// 2
		System.out.println("---2---");

		String s = "\u0041\u0042\u0043\u0044\n" + "\u0905\u0906\u0907\u0908\n" + "\u266A\u266B\n" + "\u263A\n"
				+ "\u0627\u0628\u0629\u062A\n" + "\u4E00\u4E8C\u4E09\u4E96";
		byte[] codes = s.getBytes(); // load s as raw bytes

		// Open InputStreamReader with a character decoder as per UTF-8
		try (InputStreamReader isr = new InputStreamReader(new ByteArrayInputStream(codes), StandardCharsets.UTF_8)) {
			int c;
			while ((c = isr.read()) != -1)
				System.out.print((char) c); // will print according to settings in IDE
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// 3 -> Binary data -Object Streams
		System.out.println("---3---");

		// Writing objects to a file using ObjectOutputStream
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("studentsbinary.bin"))) {
			// Creating and writing objects to the file
			Stu student1 = new Stu("Alice", 20);
			Stu student2 = new Stu("Bob", 22);

			outputStream.writeObject(student1);
			outputStream.writeObject(student2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Reading objects from the file using ObjectInputStream
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("studentsbinary.bin"))) {

			// Reading objects from the file
			Stu student1 = (Stu) inputStream.readObject();
			Stu student2 = (Stu) inputStream.readObject();

			System.out.println(student1.name + " " + student1.age);
			System.out.println(student2.name + " " + student2.age);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 4 -> Binary data -Random Access Files
		System.out.println("---4---");

		try (RandomAccessFile rafile = new RandomAccessFile("records.txt", "rw")) {
			// Writing records to the file
			// Assuming each record has a fixed size of 20 bytes (for simplicity)
			String record1 = "Record 1 data";
			String record2 = "Record 2 data";

			rafile.writeBytes(String.format("%-20s", record1));
			rafile.writeBytes(String.format("%-20s", record2));

			// Reading specific records from the file
			int recordSize = 20;
			rafile.seek(recordSize * 1); // Move to the second record (index starts at 0)
			byte[] buffer = new byte[recordSize];
			rafile.read(buffer);

			String retrievedRecord = new String(buffer);
			System.out.println("Retrieved Record: " + retrievedRecord.trim()); // Trim to remove whitespace padding

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 5 -> check pdf in JavaLearning folder. 
//		System.out.println("---5---");
//
//		// println() is method of printStream class, out is object of printStream which is created as static variable inside System class. (System.out.println)
//		// same way read() is method of InputStream class, and 'in' object of InputStream class is defined inside System class. (System.in.read)
//		try {
//			int num = System.in.read(); // read() reads char by char. so for larger number it won't work -> solution: bufferedReader(check below code)
//			System.out.println(num - 48);  // read() gives you ASCII value
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		// 6- read number using bufferedReader
		System.out.println("--6---");

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		try {
			System.out.println("Enter number"); 
			int num = Integer.parseInt(bf.readLine());
			System.out.println(num); 
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		// following block will give error as bf is already closed. 
//		try {
//			System.out.println(bf.read());
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		
		//7- reading using scanner 
//		System.out.println("--7---");

//		Scanner sc = new Scanner(System.in);
//		String num = sc.nextLine();
//		System.out.println(num);
//
//		// try with resources
//		// try can be used without catch block and with finally
//		try{
//			System.out.println("inside try block");
//		}
//		finally{
//			System.out.println("Inside finally block & no catch block");
//		}
//		
		//8-> object inside try block
//		System.out.println("--8---");
//
//		try(InputStreamReader inTry = new InputStreamReader(System.in);
//				BufferedReader bfTry = new BufferedReader(in);) {
//			System.out.println("Enter number"); 
//			int numTry = Integer.parseInt(bfTry.readLine());
//			System.out.println(numTry); 
//		} catch (NumberFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			// no need to close bufferedReader as when you declare objects inside try as declared above, it gets closed automatically
//			// all the objects created inside try brackets will get closed automatically due to closable interface
//		}
		
		//9-> 
		StringBuilder sb = new StringBuilder();
		System.out.println("---9---");

	    try (BufferedReader input = new BufferedReader(new FileReader(filename))) {
	        String st;
	        while ((st = input.readLine()) != null) {
	            sb.append(st).append("\n");
	            System.out.println("->"+st);
	        }
	    } catch (IOException e) {
	        System.out.println(e.getMessage());
	    }
	    System.out.println(sb.toString());

		
	}
}
