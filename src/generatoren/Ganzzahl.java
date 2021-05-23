/**
 * 
 */
package generatoren;

import javax.swing.JOptionPane;

/**
 * @author peter
 *
 */
public class Ganzzahl extends Generator {
	private int wert = 0;

	/**
	 * @param name
	 * @param explanation
	 * @param outputtype
	 */
	public Ganzzahl() {
		super("Ganzzahl", "Dieser Generator erzeugt die Ganzzahl: undefined", Generator.INTEGER);
	}

	@Override
	public String evaluate() {
		if (this.isDefined()) {
			return ""+wert;
		}
		return null;
	}

	@Override
	public void define() {
		String result = JOptionPane.showInputDialog(null, "Zahlenwert:", "Wert festlegen", JOptionPane.QUESTION_MESSAGE);
		try {
			wert = Integer.parseInt(result);
			this.explanation = "Dieser Generator erzeugt die Ganzzahl: "+wert;
			this.defined = true;
		} catch (Exception e) {
		}
	}

}
