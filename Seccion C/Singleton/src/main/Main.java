package main;

public class Main {

	public static void main(String[] args) {
		Thread usuario1 = new Thread(new Hilo1());
		Thread usuario2 = new Thread(new Hilo2());
		
		usuario1.start();
		usuario2.start();
	}

}
