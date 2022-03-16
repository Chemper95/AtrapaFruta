package AtrapaFruta;

import java.util.ArrayList;

public class Escenario{
	protected int ancho;
	protected int alto;
	protected ArrayList<Elemento> elementos;
	protected Personaje personaje;
	

	public void Escenarios(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
		this.elementos = new ArrayList<Elemento>();
	}
	
	public void agregarFruta(int posicionX, int posicionY, int ancho, int alto, String imagen, String nombre, int puntos, char simbolo) {
		elementos.add(new Fruta(posicionX, posicionY, ancho, alto, imagen, nombre, puntos, simbolo));
	}
		
	public void agregarPersonaje() {
	}
	
	public enum Escenarios{
		Escenario_1, Escenario_2, Escenario_3, Escenario_4;
	}
	
	public void Escenario_1() {
		this.agregarPersonaje();
		
	}
	public void Escenario_2() {
		this.agregarPersonaje();
		
	}
	public void Escenario_3() {
		this.agregarPersonaje();
		
	}
	public void Escenario_4() {
		this.agregarPersonaje();
		
	}
}
