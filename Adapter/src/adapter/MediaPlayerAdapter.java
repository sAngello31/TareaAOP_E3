package adapter;

public class MediaPlayerAdapter implements MediaPlayer {
	
	private ControlExterno control;
	
	public MediaPlayerAdapter(ControlExterno control) {
		this.control = control;
	}

	@Override
	public void play() {
		control.empezarReproduccion();
		
	}

	@Override
	public void stop() {
		control.detenerTransmision();
		
	}

}
