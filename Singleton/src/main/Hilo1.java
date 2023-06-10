package main;

public class Hilo1 implements Runnable{

	@Override
	public void run() {
		ConexionBaseDatos conexion = ConexionBaseDatos.getInstancia("Sofia");
		conexion.log();
	}

}
