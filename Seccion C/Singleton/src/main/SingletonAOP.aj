package main;

public aspect SingletonAOP {
	 pointcut Instancesuccess() : call(* getInstancia*(..) ) ;
	    before() : Instancesuccess() {
	    	if(ConexionBaseDatos.islog == false) {
	    		System.out.println("**** Instance realize **** ");
	    	}
	    }
	 pointcut success() : call(* log*(..) );
	    after() : success() {
	     
	        System.out.println("**** User Logged ****");
	        System.out.println();
	    	
	    }   	
}
