package Learn;

class calculator {
	// num is instance variable
	int num = 5;

	// a and b are local variables
	public int add(int a, int b) {

		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}

public class Stack_AND_Heap_JVM_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// what happens in memory when you create variable/store variable ?
		// JVM maintains Stack(sequence -> last in first out) and Heap(open space)
		// every method will have its own stack
		// stack will have key and value -> variable name: variable value

		// <data, c, result> -> all will be stored with value in stack of main but when
		// it comes to result
		// it doesn't know what is the value of that variable. at that time we call add
		// method. and it will create new stack for add method. as we can see
		// add method also has two variable. those variables will have the same value as
		// the values passed in the parameters. post that method will be executed and
		// return value
		// will be stored in stack of main as value of result variable.
		// once add method execution is completed, it will be gone from the stack area.
		// now what about variable c and the instance variable num? -> stored inside
		// heap
		// when we say new calculator()-> object of calculator will be created inside
		// heap with all its instance variables name and value & all method
		// declarations. That is calculator object residing in heap will have num
		// variable with its value and add method declaration. variable c will reside in
		// main stack but will have value equals to address of newly created calculator
		// object
		
		// as main stack's c variable will have address to object of heap, we can say
		// there is link between stack and heap

		int data = 10;
		calculator c = new calculator();
		calculator c1 = new calculator();
		int result = c.add(2, 4);
		c.num = 10; 
		// for every new calculator(), new memory will be assigned in heap.
		// and that is why changing num of c won't affect num of c1
		System.out.println(c.num);
		System.out.println(c1.num);
	}

}
