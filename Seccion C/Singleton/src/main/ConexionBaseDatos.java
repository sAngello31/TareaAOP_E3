package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ConexionBaseDatos {
	private static ConexionBaseDatos instancia;
	private String usuario;
	public static volatile boolean islog = false;
	
	private ConexionBaseDatos(String usuario){
		//Configuracion Conexion
		this.usuario = usuario;
	}
	
	public static synchronized ConexionBaseDatos getInstancia(String usuario) {
		if(instancia == null) {
			instancia = new ConexionBaseDatos(usuario);
			islog = true;
		}
		return instancia;
	}
	
	
	public synchronized void log() {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("log.txt",true));
			writer.println(this.usuario);
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
