package adapter;

public class Main {

	public static void main(String[] args) {
		ControlExterno control = new ControlExterno();
		MediaPlayerAdapter media = new MediaPlayerAdapter(control);
		media.play();
		media.stop();
	}

}
