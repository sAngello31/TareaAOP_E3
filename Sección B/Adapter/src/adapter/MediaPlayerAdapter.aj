package adapter;

public aspect MediaPlayerAdapter {
	declare parents: ControlExterno implements MediaPlayer;
	
	public void ControlExterno.play(){
		empezarReproduccion();
	}
	
	public void ControlExterno.stop(){
		detenerTransmision();
	}
	
}
