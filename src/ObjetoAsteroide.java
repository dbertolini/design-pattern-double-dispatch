
public class ObjetoAsteroide implements Objeto{
	public void interactuar(Objeto objeto){
		objeto.interactuar(this);
	}
	
	public void interactuar(ObjetoAsteroide objeto){
		System.out.println("Asteroide - Asteroride = Colicionan");
	}
	
	public void interactuar(ObjetoNave objeto){
		System.out.println("Asteroide - Nave = Colicionan");
	}
	
	public void interactuar(ObjetoEstacion objeto){
		System.out.println("Asteroide - Estacion = Colicionan");
	}
}
