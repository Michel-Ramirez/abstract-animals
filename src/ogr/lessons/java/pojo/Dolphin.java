package ogr.lessons.java.pojo;

import ogr.lessons.java.inter.ISwiming;
import ogr.lessons.java.pojo.abs.Animal;

public class Dolphin extends Animal implements ISwiming {

	@Override
	public void verse() {
		System.out.println("Il verso del Delfino è: Cri Cri");
	}

	@Override
	public void eat() {
		System.out.println("Il Delfino mangia: Pesci");
	}

	@Override
	public void swim() {
		System.out.println("STO NUOTANDO!!");

	}

}
