package adapter;

import java.util.Calendar;

public aspect AdapterAOP {
	Calendar cal = Calendar.getInstance();
    String mensaje="";
    
	declare parents: MediaPlayerAdapter implements MediaPlayer;
	
	pointcut EncendidoExitoso(): call(* play*(..) ) ;
	after() : EncendidoExitoso() {   
		mensaje="Se prendió de forma exitosa, fecha: " + cal.getTime();
    	System.out.println(mensaje);  
    	System.out.println("-----------");  
    }
	
	pointcut ApagadoExitoso(): call(* stop*(..) ) ;
	after() : ApagadoExitoso() {   
		mensaje="Se apagó de forma exitosa, fecha: " + cal.getTime();
    	System.out.println(mensaje);  
	}	
}
