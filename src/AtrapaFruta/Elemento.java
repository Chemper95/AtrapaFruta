package AtrapaFruta;

public class Elemento {

	protected int posicionX;
	protected int posicionY;
	protected int WIDTH;
	protected int HEIGHT;
	protected int imagen;
	protected int simbolo;
	
	public Elemento(int posicionX, int posicionY, int WIDTH, int HEIGHT, int imagen, int simbolo) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.imagen = imagen;
		this.simbolo = simbolo;
	}

	
	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	
	
	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	
	
	public int getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	
	
	public int getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}
 
	
	
	public int getImagen() {
		return imagen;
	}

	public void setImagen(int Imagen) {
		imagen = Imagen;
	}

	
	public int getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(int Simbolo) {
		simbolo = Simbolo;
	}

	
	
	
	public void mostrarDatos() {
	}
	

	
}
