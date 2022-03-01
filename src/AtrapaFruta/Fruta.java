package AtrapaFruta;

public class Fruta extends Elemento{
	
	protected int nombre;
	protected int puntos;
	
	public Fruta(int nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	

}
