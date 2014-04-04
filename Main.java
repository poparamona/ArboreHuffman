import java.util.Scanner;

/**
 * clasa Main pentru testare
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args[0].equals("c")) {
			codificare c;
			String x;
			StringBuffer t = new StringBuffer();
			Scanner s = new Scanner(System.in);
			x = s.nextLine();
			t.append(x);
			x = s.nextLine();
			while (!x.equals(".")) {
				t.append("\r\n");
				t.append(x);
				x = s.nextLine();
			}
			c = new codificare(t.toString());
		}
		if (args[0].equals("d")) {
			Scanner s = new Scanner(System.in);
			decodificare u = new decodificare();
			String x = s.nextLine();
			while (!x.equalsIgnoreCase(".")) {
				u.caracter(x);
				x = s.nextLine();
			}
			x = s.nextLine();
			u.secventa(x);
			System.out.print("\r\n" + ".");
		}
	}
}
