package Learn;

public class ThisKeyword {

	// when object of this class gets created, it will be stored inside heap memory
	// with it's instance variables name and value.
	private int i;
	private int j;

	public int getI() {
		return i;
	}

	// if a local variable has the same name as an instance variable within a class,
	// then local variable hides the instance variable

	// when someone creates object of ThisKeyword class in main method -> object
	// gets created in heap memory at address 'add1' and also that address gets
	// stored in stack memory of main method against object name.
	// when setI method will be called by the created object, one stack memory will
	// be assigned for setI() method and param_i will be stored inside stack.
	// i -> stored inside object of ThisKeyword's heap memory.
	// param_i -> stored inside stack memory of setI method.
	public void setI(int param_i) {
		i = param_i;
	}

	public int getJ() {
		return j;
	}

	// one i in heap & other in stack -> which one to update?
	// if you do j = j, it won't work.
	// By default local variable will be considered. the one we are passing as
	// parameter is local to setI method's stack and the one we want a value to be
	// assigned is instance variable. so, when we do j= j, setI's stack memory
	// assigns value to itself and instance variable doesn't get affected.
	// so, 'this' keyword helps to point instance variable of calling object.
	public void setJ(int j) {
		this.j = j;
	}

}
