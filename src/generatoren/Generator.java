/**
 * 
 */
package generatoren;

import java.util.ArrayList;

/**
 * @author peter
 *
 */
public abstract class Generator {
	public static final String INTEGER="Integer";
	private static ArrayList<Generator> generatoren;
	private static ArrayList<String> typen = new ArrayList<String>();
	private String name, outputtype;
	protected String explanation;
	protected String[] inputtypen = null; // empty
	protected boolean defined = false;
	
	protected Generator(String name, String explanation, String outputtype) {
		//name soll eindeutig sein
		if (Generator.gibGeneratorMitName(name)!=null) { // Name existiert schon
			int i=0;
			while (Generator.gibGeneratorMitName(name+i)!=null) i++;
			name=name+i;
		}
		this.name=name;
		this.explanation=explanation;
		this.outputtype=outputtype;
		//Falls der outputtype nicht existiert -> eintragen
		if (!typen.contains(outputtype)) {typen.add(outputtype);}
	}
	
	public abstract String evaluate();
	
	public abstract void define();
	
	public static boolean addType(String type) {
		if (typen==null) {
			typen = new ArrayList<String>();
		}
		return typen.add(type);
	}

	public static ArrayList<Generator> getGeneratoren() {
		return generatoren;
	}

	public static ArrayList<String> getTypen() {
		return typen;
	}

	public String getName() {
		return name;
	}

	public String getExplanation() {
		return explanation;
	}

	public String getOutputtype() {
		return outputtype;
	}

	public String[] getInputtypen() {
		return inputtypen;
	}

	public boolean isDefined() {
		return defined;
	}
	
	/**
	 * gibt den Generator mit dem Namen <name> zurück, sonst null
	 * @param name gesuchter name
	 * @return den Generator mit diesem Namen oder null
	 */
	public static Generator gibGeneratorMitName(String name) {
		if (generatoren == null) {
			generatoren = new ArrayList<Generator>();
		}
		for (Generator i: generatoren) {
			if (i.getName().equals(name)) return i;
		}
		return null;
	}
	
}
