package ogr.lessons.java.pojo;

import ogr.lessons.java.pojo.abs.Animal;

public class Dog extends Animal {

	@Override
	public void verse() {
		System.out.println("Il verso del cane è: Bau Bau");
	}

	@Override
	public void eat() {
		System.out.println("Il cane mangia: Cibo per cani e carne");
	}

}
