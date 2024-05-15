package Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bike implements Comparable<Bike> {
	int i;

	public Bike(int i) {
		this.i = i;
	}

	@Override
	public int compareTo(Bike o) {
		// TODO Auto-generated method stub
		return this.i - o.i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}

class BikeComparator implements Comparator<Bike>{

	@Override
	public int compare(Bike o1, Bike o2) {
		// TODO Auto-generated method stub
		return o1.i - o2.i;
	}
	
}

public class ComparableAndComparator {
	public static void main(String[] args) {
		List<Bike> bikes = new ArrayList<Bike>();
		bikes.add(new Bike(10));
		bikes.add(new Bike(2));

		for (Bike bike : bikes) {
            System.out.println(bike.getI());
        }
		Collections.sort(bikes);
		System.out.println("After sorting using comparable");

		for (Bike bike : bikes) {
            System.out.println(bike.getI());
        }
		
		List<Bike> bikesList = new ArrayList<Bike>();
		bikesList.add(new Bike(11));
		bikesList.add(new Bike(3));

		for (Bike bike : bikesList) {
            System.out.println(bike.getI());
        }
		Collections.sort(bikesList, new BikeComparator());
		System.out.println("After sorting using comparator");

		for (Bike bike : bikesList) {
            System.out.println(bike.getI());
        }
		
		List<Bike> bikesListNew = new ArrayList<Bike>();
		bikesListNew.add(new Bike(12));
		bikesListNew.add(new Bike(41));

		for (Bike bike : bikesListNew) {
            System.out.println(bike.getI());
        }
		Collections.sort(bikesListNew, new Comparator<Bike>() {

			@Override
			public int compare(Bike o1, Bike o2) {
				// TODO Auto-generated method stub
				return o1.i%10 - o2.i%10;
			}
		} );
		System.out.println("After sorting based on last digit using anonymous comparator");

		for (Bike bike : bikesListNew) {
            System.out.println(bike.getI());
        }
		
	}
}
