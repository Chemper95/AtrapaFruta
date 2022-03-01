package AtrapaFruta;

import java.util.Timer;
import java.util.TimerTask;

public class TimerJuego extends TimerTask {
	private final Ventana ventana;
	TimerJuego(Ventana ventana){
		this.ventana = ventana;
	}
	public void run() {
		Timer timer = new Timer();
		timer.schedule(new TimerJuego(this), 0, 200);
	}

}
