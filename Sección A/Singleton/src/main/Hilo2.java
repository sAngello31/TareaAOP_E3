package main;

public class Hilo2 implements Runnable{

	@Override
	public void run() {
		ConexionBaseDatos conexion = ConexionBaseDatos.getInstancia("Angello");
		conexion.log();
		
	}

}
