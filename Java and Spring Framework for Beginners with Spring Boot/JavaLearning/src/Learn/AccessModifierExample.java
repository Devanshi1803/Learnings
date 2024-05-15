package Learn;

import Learn.AccessModifiers.DemoInDifferentPackage;

class DemoInSameFile extends DemoInDifferentPackage {
	int marks = 3;
	public int markspub = 6;
	protected int markspro = 4;
	private int markspri = 4;

	public void method() {
		// You can access marksprot here though it's protected and in different package.
		// the reason is this class extending DemoInDifferentPackage class.
		System.out.println(marksprot);
	}
}

public class AccessModifierExample {
	public static void main(String[] args) {
		DemoInDifferentPackage diffPackage = new DemoInDifferentPackage();
		DemoInSamePackage samePackage = new DemoInSamePackage();
		DemoInSameFile sameFile = new DemoInSameFile();

		// variable with no datatype mentioned -> default
		// System.out.println(diffPackage.marks); // not accessible
		System.out.println(samePackage.marks);
		System.out.println(sameFile.marks);

		// public variable
		// markspub is public variable -> accessible for all case
		System.out.println(diffPackage.markspub);
		System.out.println(samePackage.markspub);
		System.out.println(sameFile.markspub);

		// protected variable
		// markspro is protected variable -> not accessible for one case
		// System.out.println(diffPackage.markspro); // not accessible
		System.out.println(samePackage.markspro);
		System.out.println(sameFile.markspro);

		// private variable
		// markspri is private variable -> not accessible for all case
		// System.out.println(diffPackage.markspri); // not accessible
		// System.out.println(samePackage.markspri); // not accessible
		// System.out.println(sameFile.markspri); // not accessible

		// Note:
		// -> when you want to access something outside the package, always make it
		// public(not variables but methods).
		// -> make class as public and variables as private generally
		// -> make methods as protected if they are meant to be used inside subclasses
		// only, otherwise public.
		// check accessMod.png

	}

}
