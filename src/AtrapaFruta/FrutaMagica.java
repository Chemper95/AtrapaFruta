package AtrapaFruta;

public class FrutaMagica extends Fruta{
	private final Efecto efecto;
	FrutaMagica(Efectos efecto){
		this.efecto = efecto;
	}
	
	public enum Frutas{
		Dragón, Dorada, Plateada, Harry_Potter, Venenosa;
	}
}


