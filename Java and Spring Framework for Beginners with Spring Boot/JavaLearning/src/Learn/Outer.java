package Learn;

class Am {

	public void run() {

		System.out.println("I am running");

	}

}

class Outer {

	static Am obj = new Am() {
	};

	public static void main(String[] args) {

		obj.run();

	}

}