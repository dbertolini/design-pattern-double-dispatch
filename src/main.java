
public class main {

	public static void main(String[] args){
		Objeto nave = new ObjetoNave();
		Objeto asteroide = new ObjetoAsteroide();
		Objeto estacion = new ObjetoEstacion();
		
		//nave.interactuar(asteroide);
		estacion.interactuar(nave);
	}
}
