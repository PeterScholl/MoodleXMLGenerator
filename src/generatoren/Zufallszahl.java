package generatoren;

public class Zufallszahl extends Generator {

	public Zufallszahl() {
		super("Zufallszahl(ganz)", "Erzeugt eine Zufallszahl", Generator.INTEGER);
		this.inputtypen = new String[] {
				Generator.INTEGER,
				Generator.INTEGER,
				Generator.INTEGER
		};
	}

	@Override
	public String evaluate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void define() {
		// TODO Auto-generated method stub

	}

}
