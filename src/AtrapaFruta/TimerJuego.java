package AtrapaFruta;

import java.util.Timer;
import java.util.TimerTask;

public class TimerJuego extends TimerTask {
	private final TimerJuego ventana;
	TimerJuego(TimerJuego timerJuego){
		this.ventana = timerJuego;
	}
	
	public void run() {
		Timer timer = new Timer();
		timer.schedule(new TimerJuego(this), 0, 150);
	}

}
