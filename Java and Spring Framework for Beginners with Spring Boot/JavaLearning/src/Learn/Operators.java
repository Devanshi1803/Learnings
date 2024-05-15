package Learn;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// operators
		int a = 7;
		int b = 5;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a ^ b); // 111 ^ 101 => 010 (XOR)
		System.out.println(a % b);
		System.out.println("--------------");
		System.out.println(a++);
		System.out.println(7 & b); // 111 & 101 => 101
		System.out.println(a | b); // 1000 | 101 => 1101
		// https://www.geeksforgeeks.org/shift-operator-in-java/
		// >> : right most digits will be lost
		// << : zeros will come at the end
		System.out.println("--------------");
		System.out.println(a);
		System.out.println(a << 1); // 1000 -> 10000
		System.out.println(0b111 << 1); // 111 -> 1110
		System.out.println(a >> 1); // 1000 -> 100
		System.out.println(a << 2); // 1000 -> 100000
		System.out.println(0b111 << 2); // 111 -> 11100
		System.out.println(a >> 2); // 1000 -> 10

		// Relational operator -> o/p is boolean
		// >,<,==,!=
		System.out.println('a' > 'b');
		System.out.println('a' < 'b');
		System.out.println('a' == 'b');
		System.out.println('a' != 'b');
		System.out.println((byte) 'a');
		a = 3;
		b = 6;
		System.out.println((~a & b) | (a & ~b));
		// logical operators
		// &&, ||, !
		int x = 5;

		int y = 10;

		int z = (x++ > 5 && y-- < 10) ? x-- : y;
		System.out.println(x);
		int i = 100;

		int j = 300;

		while (++i < --j)
			;

		System.out.println(i);

	}

}
