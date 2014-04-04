import java.util.*;

/**
 * decodificare sir de biti
 * 
 */
public class decodificare {
	Nodb r = new Nodb();

	/* private ArrayList<String> s; */
	/**
	 * constructor fara parametrii
	 */

	public decodificare() {
	}

	/**
	 * @param s
	 *            un sir de caractere
	 * @return void nu returneaza nimic
	 */
	public void caracter(String s) {
		Nodb n = r;
		String x = "";
		/**
		 * Parcurg "s" cu "k" pana la caracterul spatiu si salvez in stringul
		 * "x" initial vid codul asci al caracterului
		 */
		for (int k = 0; k < s.length(); k++) {
			if (s.charAt(k) != ' ') {
				x = x + s.charAt(k);
			} else {
				s = s.substring(k + 1);
				break;
			}
		}

		/**
		 * Parcurg cu "i" sirul 's' si daca gasesc caracterul "0" ma duc in
		 * ramura din stanga ,iar daca noddul din stanga nu exista il creez.
		 * Acelasi lucru in dreapta daca gasesc "1"
		 */
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				if (n.getSt() == null) {
					n.setSt(new Nodb('0', 0));
				}
				n = n.getSt();
			}
			if (s.charAt(i) == '1') {
				if (n.getDr() == null) {
					n.setDr(new Nodb('0', 0));
				}
				n = n.getDr();
			}
		}
		n.setCar((char) Integer.parseInt(x));
		n.setVal(1);
	}

	/**
	 * Daca in sirul "s" gasesc "1" ma duc pe ramura dreapta altfel daca gasesc
	 * "0" ma duc pe ramura stanga.Daca nu exista nod nici in stanga nici in
	 * dreapta afisez caracterul.
	 * 
	 * @param s
	 *            sir de caractere
	 * @return void nu returneaza nimic
	 */
	public void secventa(String s) {
		Nodb n = r;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				n = n.getDr();
			} else {
				n = n.getSt();
			}
			if (n.getDr() == null && n.getSt() == null) {
				System.out.print(n.getCar());
				n = r;
			}
		}
	}
}
