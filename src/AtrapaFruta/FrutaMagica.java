package AtrapaFruta;

public class FrutaMagica extends Fruta{
	private final Efecto efecto;
	FrutaMagica(Efectos efecto){
		this.efecto = efecto;
	}
	
	public enum Frutas{
		Drag�n, Dorada, Plateada, Harry_Potter, Venenosa;
	}
}


