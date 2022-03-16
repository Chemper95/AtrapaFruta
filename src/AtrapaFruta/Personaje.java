package AtrapaFruta;

import java.util.ArrayList;

public class Personaje extends Elemento{
	
	protected int velocidad;
	protected int Desaparecer;
	protected ArrayList<Fruta> frutas;

	public Personaje(int posicionX, int posicionY, int ancho, int alto, String imagen, int velocidad, char simbolo) {
		super(posicionX, posicionY, ancho, alto, imagen, simbolo);
		this.velocidad = velocidad;
		this.frutas = new ArrayList<Fruta>();
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void mostrarDatos() {
		System.out.println("Personaje: "+"Posicion" +this.posicionX+ "," +this.posicionY);
	}
	
	public void saltar() {
	}
	
	public void avanzar() {
		this.posicionX += this.velocidad;
	}
	
	public void cogerFruta() {
	}
	
	public void choca() {
	}
	
	public void mostrarFruta() {
	}
	
	
}
