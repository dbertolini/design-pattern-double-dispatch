
public class ObjetoNave implements Objeto{
	
	public void interactuar(Objeto objeto){
		objeto.interactuar(this);
	}
	
	public void interactuar(ObjetoAsteroide objeto){
		System.out.println("Nave - Asteroride = Colicionan");
	}
	
	public void interactuar(ObjetoNave objeto){
		System.out.println("Nave - Nave = Pelean");
	}
	
	public void interactuar(ObjetoEstacion objeto){
		System.out.println("Nave - Estacion = Se acoplan");
	}
}
