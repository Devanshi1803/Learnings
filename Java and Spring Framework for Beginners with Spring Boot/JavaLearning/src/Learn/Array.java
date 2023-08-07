package Learn;
import java.lang.String;
class Student{
	String name; 
	int id; 
}
public class Array {
	public static void main(String[] args) {
		
		//1D array
		int arr1[] = new int[4];
		int arr2[] = { 1, 2, 3, 4 };
		arr1[1] = 3;
		// arr1[4] = 1; //runtime error
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i] + " " + arr1[i]);
		}
		
		//2D array
		int arr3[][] = new int[3][];

		// int arr4[][] = new int[][4]; //not allowed
		int arr5[][] = new int[3][4];
		for (int i = 0; i < arr5.length; i++) {
			arr3[i] = new int[4];
			for (int j = 0; j < arr5[i].length; j++) {
				// arr3[i][j] = 1;
				arr5[i][j] = (int) (Math.random() * 10);
				System.out.print(arr3[i][j] + "-" + arr5[i][j] + " ");
			}
			System.out.println();
		}

		for (int i[] : arr5) {
			for (int j : i) {
				// arr3[i][j] = 1;
				// j = (int)(Math.random()*10);
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//Jagged array 
		System.out.println("jagged array-------");
		int arr6[][] = new int[3][]; // jagged array -> internal array size can vary
		arr6[0] = new int[3];
		arr6[1] = new int[2];
		arr6[2] = new int[1];
		for (int i[] : arr6) {
			for (int j : i) {
				j = (int) (Math.random() * 10);
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//drawbacks of array
		//->memory location used by array in heap is contiguous
		//->once you define size of array -> it can not be expanded
		//->searching and inserting takes time because of traversal 
		
		//Array of Objects
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.id = 1;
		s2.id = 2;
		s3.id = 3;
		s1.name = "a";
		s2.name = "b";
		s3.name = "c";
		Student s[] = new Student[3];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		//This will help to print details of all students in one go
		
		//for each loop -> works with array kind of data
		System.out.println("foreach loop/enhanced for loop-------");

		for(Student i : s){
			System.out.println(i.name);
		}

	}
}
