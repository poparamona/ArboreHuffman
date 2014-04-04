import java.util.*;

/**
 * clasa arbore contine functii necesare pentru construirea vectorului de noduri
 * si a arborelui
 */

public class Arbore {
	/** creare un vector de noduri x */
	ArrayList<Nodb> x = new ArrayList<Nodb>();

	/**
	 * inserare nod n in vectorul de nod : daca vector gol adauga n. Daca are
	 * elemente il parcurg si face insert sort: cand gaseste primul > ca el le
	 * muta la dreapta si insereaza in locul lui
	 * 
	 * @param n
	 *            un nod
	 * @return void nu intoarce nimic
	 */
	private void insNod(Nodb n) {
		int r;
		if (x.size() == 0)
			x.add(n);
		else {
			int ind = -1;
			for (int i = 0; i < x.size(); i++) {
				r = n.compar(x.get(i));
				if (r > 0) {
					x.add(i, n);
					ind = 1;
					break;
				}
			}
			if (ind == -1) {
				x.add(n);
			}

		}
	}

	/**
	 * combina doua noduri din vector creand un nou nod si elimina cele doua
	 * noduri din vector
	 * 
	 * @param fara
	 *            parametri
	 * @return nou noul nod rezultat in urma combinarii celor doua noduri
	 */
	public Nodb CombNod() {
		Nodb nou = new Nodb(x.remove(0), x.remove(0));
		return nou;
	}

	/**
	 * apeleaza functia combina nod si il insereaza in vectorul x pana ramane un
	 * singur nod
	 * 
	 * @param nu
	 *            are parametri
	 * @return nod radacina
	 */
	public Nodb rad() {
		Nodb nou;
		while (x.size() != 1) {
			nou = CombNod();
			this.insNod(nou);

		}
		return x.get(0);
	}

	/**
	 * primeste un sir de caractere si returneaza vectorul de noduri asociat
	 * sirului . Creaza nod daca nu exista si incrementeaza numarul de aparitii
	 * daca exista
	 * 
	 * @param t
	 *            un sir de caractere
	 * @return void nu returneaza nimic
	 */
	public void vectnod(String t) {
		Nodb nou;
		int i, j;
		boolean semafor;
		nou = new Nodb(t.charAt(0), 1);
		x.add(nou);
		for (j = 1; j < t.length(); j++) {
			semafor = false;
			for (i = 0; i < x.size(); i++) {
				if (x.get(i).getCar() == t.charAt(j)) {
					nou = x.remove(i);
					nou.setVal(nou.getVal() + 1);
					semafor = true;
					this.insNod(nou);
					break;
				}
			}
			if (semafor == false) {
				nou = new Nodb(t.charAt(j), 1);
				this.insNod(nou);
			}
		}
	}

	/**
	 * Constructor fara parametrii
	 */
	public Arbore() {
	}
}