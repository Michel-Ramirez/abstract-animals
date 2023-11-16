package ogr.lessons.java;

import ogr.lessons.java.inter.IFlying;
import ogr.lessons.java.inter.ISwiming;
import ogr.lessons.java.pojo.Dog;
import ogr.lessons.java.pojo.Dolphin;
import ogr.lessons.java.pojo.Eagle;
import ogr.lessons.java.pojo.Sparrow;
import ogr.lessons.java.pojo.abs.Animal;

public class Main {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.sleep();
		d.verse();
		d.eat();

		// d.swim();

		System.out.println("\n-----------------\n");

		Sparrow s = new Sparrow();
		s.sleep();
		s.verse();
		s.eat();

		// s.fly();

		System.out.println("\n-----------------\n");

		Dolphin dolph = new Dolphin();
		dolph.sleep();
		dolph.verse();
		dolph.eat();

		// dolph.swim();

		System.out.println("\n-----------------\n");

		Eagle e = new Eagle();
		e.sleep();
		e.verse();
		e.eat();

		// e.fly();

		System.out.println("\n-----------------\n");

		Animal[] animals = new Animal[4];

		animals[0] = d;
		animals[1] = s;
		animals[2] = dolph;
		animals[3] = e;

		System.out.println("\n-------------------\n");

		for (int x = 0; x < animals.length; x++) {

			if (animals[x] instanceof IFlying) {
				((IFlying) animals[x]).fly();
				System.out.println();
			} else if (animals[x] instanceof ISwiming) {
				((ISwiming) animals[x]).swim();
				System.out.println();
			} else {
				System.out.println("Quancuno non sa nuotare ne volare");
				System.out.println();
			}
		}

	}

}
