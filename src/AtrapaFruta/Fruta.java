package AtrapaFruta;

public class Fruta extends Elemento{
	
	protected String nombre;
	protected int puntos;
	
	public Fruta(int PosicionX, int PosicionY, int ancho, int largo, String imagen, String nombre, int puntos, char simbolo) {
		super(PosicionX, PosicionY, ancho, largo, imagen, simbolo);
		this.nombre = nombre;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void mostrarDatos() {
		System.out.println("Tipo de fruta: "+this.nombre+ "Puntos: "+this.puntos);
	}
	

}
