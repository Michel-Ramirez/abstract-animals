package ogr.lessons.java.pojo;

import ogr.lessons.java.inter.IFlying;
import ogr.lessons.java.pojo.abs.Animal;

public class Sparrow extends Animal implements IFlying {

	@Override
	public void verse() {
		System.out.println("Il verso dell'uccello è: CipCip");
	}

	@Override
	public void eat() {
		System.out.println("l'uccello mangia: Insetti e vermi");
	}

	@Override
	public void fly() {
		System.out.println("Sto VOLANDO!");

	}

}
