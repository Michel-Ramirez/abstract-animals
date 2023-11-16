package ogr.lessons.java.pojo;

import ogr.lessons.java.inter.IFlying;
import ogr.lessons.java.pojo.abs.Animal;

public class Eagle extends Animal implements IFlying {

	@Override
	public void verse() {
		System.out.println("Il verso del Aquila è: IIIII.... IIIII...");
	}

	@Override
	public void eat() {
		System.out.println("L'Aquila mangia Carcasse e topi");
	}

	@Override
	public void fly() {
		System.out.println("Sto Volando!");

	}

}
