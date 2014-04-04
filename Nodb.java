/**
 * 
 * clasa nod contine declaratii, constructori si functii pentru nod
 */

public class Nodb {

	/** declaratii pentru nod */

	private int val;
	private char car;
	private Nodb st, dr;

	/**
	 * constructor nod : caracter si valuare
	 * 
	 * @param car
	 *            caracter nod
	 * @param val
	 *            valuare nod
	 * @return void nimic deoarece este constructor
	 */
	public Nodb() {
	}

	public Nodb(char car, int val) {
		this.setCar(car);
		this.setVal(val);
	}

	/**
	 * constructor: asuma ca arborele drept este mereu mai mic
	 * 
	 * @param st
	 *            valuare stanga
	 * @param dr
	 *            valuarea dreapta
	 * @return nimic deoarece este un constructor
	 */
	public Nodb(Nodb st, Nodb dr) {
		//
		this.setCar((st.getCar() > dr.getCar()) ? st.getCar() : dr.getCar());
		this.setVal(st.getVal() + dr.getVal());
		this.setSt(st);
		this.setDr(dr);
	}

	/**
	 * compara nodul curent cu nodul "a" si returneaza o valuare < 0 daca
	 * numarul de aparitii ale nodului curent este > ca nod "a" sau daca
	 * this.getcar este mai in fata alfabetic decat "a"
	 * 
	 * @param a
	 *            un nod
	 * @return intreg negativ daca caracterul este mai in fata alfabetic ca "a"
	 *         sau daca numar aparitii > ca "a"
	 */
	public int compar(Nodb a) {
		if (a.getVal() == this.getVal()) {
			return a.getCar() - this.getCar();
		} else
			return a.getVal() - this.getVal();
	}

	/**
	 * verifica daca nodul este frunza
	 * 
	 * @param vid
	 *            nu are parametri
	 * @return true daca este frunza, altfel false
	 */
	public boolean isLeaf() {
		return (getSt() == null && getDr() == null);
	}

	/** getter si setter pentru caracter si pentru valuare */

	/**
	 * @param nu
	 *            are parametri
	 * @return car caracter
	 */
	public char getCar() {
		return car;
	}

	/**
	 * @param car
	 *            caracter
	 * @return nu returneaza nimic
	 */
	public void setCar(char car) {
		this.car = car;
	}

	/**
	 * @param nu
	 *            are parametri
	 * @return val valuarea (frecventa)
	 */
	public int getVal() {
		return val;
	}

	/**
	 * @param val
	 *            valuarea
	 * @return nu returneaza nimic
	 */
	public void setVal(int val) {
		this.val = val;
	}

	/**
	 * @param nu
	 *            are parametri
	 * @return st valuarea stanga a nodului .Nodul din stanga.
	 */
	public Nodb getSt() {
		return st;
	}

	/**
	 * @param st
	 *            nod stanga
	 * @return nu returneaza nimic
	 */
	public void setSt(Nodb st) {
		this.st = st;
	}

	/**
	 * @param nu
	 *            are parametrii
	 * @return dr nodul din dreapta
	 */
	public Nodb getDr() {
		return dr;
	}

	/**
	 * @param dr
	 *            valuare dreapta. Nodul din dreapta
	 * @return nu returneaza nimic
	 */
	public void setDr(Nodb dr) {
		this.dr = dr;
	}

}
