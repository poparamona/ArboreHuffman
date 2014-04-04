import java.util.ArrayList;

/**
 * clasa codificare cu constructori si functii necesare pentru codificarea
 * sirului citit de la stdin
 */
public class codificare {
	private Nodb rad;
	private ArrayList<String> t;

	/**
	 * constructor ce primeste sir de caractere si afisaza secventa de biti
	 * 
	 * @param t
	 *            sir de caractere
	 */
	public codificare(String t) {
		Arbore arb = new Arbore();
		this.t = new ArrayList<String>();
		arb.vectnod(t);
		setRad(arb.rad());
		CreareCoduri(rad, new StringBuffer());
		System.out.println(".");
		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < this.t.size(); j++) {
				if (t.charAt(i) == this.t.get(j).charAt(0)) {
					System.out.print(this.t.get(j).substring(2));
				}
			}
		}
	}

	/**
	 * Daca nodul este frunza afisaza codul asci al caracterului urmat de spatiu
	 * si codul. Daca nu este frunza creaza codul adaugand "0" pe ramura stanga
	 * si "1" pentru ramura dreapta
	 * 
	 * @param n
	 *            nod
	 * @param prefix
	 * @return void nu returneaza nimic decat printeaza codurile caracterelor
	 */
	public void CreareCoduri(Nodb n, StringBuffer prefix) {
		if (n.isLeaf()) {
			t.add(n.getCar() + " " + prefix.toString());
			System.out.println((int) n.getCar() + " " + prefix.toString());
		} else {

			prefix.append('0');
			CreareCoduri(n.getSt(), prefix);
			prefix.deleteCharAt(prefix.length() - 1);

			prefix.append('1');
			CreareCoduri(n.getDr(), prefix);
			prefix.deleteCharAt(prefix.length() - 1);
		}
	}

	public ArrayList<String> CoduriCaracter() {
		return t;
	}

	/**
	 * getter pentru radacina.
	 * 
	 * @return rad radacina arborelui
	 */
	public Nodb getRad() {
		return rad;
	}

	/**
	 * setter pentru radacina
	 * 
	 * @param rad
	 */
	public void setRad(Nodb rad) {
		this.rad = rad;
	}

}
