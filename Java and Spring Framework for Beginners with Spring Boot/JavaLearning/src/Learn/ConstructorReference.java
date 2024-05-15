package Learn;

import java.util.Arrays;
import java.util.List;
class SimpleClass{
	private String name;
	private int id;
	public SimpleClass(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "SimpleClass [name=" + name + ", id=" + id + "]";
	}
	
}
public class ConstructorReference {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("devanshi", "shreya", "mishri");
		List<SimpleClass> listOfObjects = names.stream().map(name -> new SimpleClass(name)).toList();
		for(SimpleClass sc : listOfObjects) {
			System.out.println(sc.getName());
		}
		System.out.println("----");

		List<SimpleClass> listOfObjects1 = names.stream().map(SimpleClass::new).toList();
		for(SimpleClass sc : listOfObjects1) {
			System.out.println(sc.getName());

		}

	}
}
