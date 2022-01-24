
public class ObjetoEstacion implements Objeto{

	public void interactuar(Objeto objeto) {
		objeto.interactuar(this);
	}

	public void interactuar(ObjetoAsteroide objeto) {
		System.out.println("Estacion - Asteroride = Colicionan");
	}

	public void interactuar(ObjetoNave objeto) {
		System.out.println("Estacion - Nave = Se acoplan");
	}

	public void interactuar(ObjetoEstacion objeto) {
		System.out.println("Estacion - Estacion = Colicionan");
	}

}
