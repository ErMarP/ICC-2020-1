import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreCompleto = new String();
		String fechaCumple = new String();

		System.out.println("Dame tu nombre completo");
		nombreCompleto = scanner.nextLine();
		nombreCompleto = nombreCompleto.trim();

		System.out.println("Dame tu fecha de cumpleaños dd/mm/aaaa");
		fechaCumple = scanner.nextLine();
		fechaCumple = fechaCumple.trim();

	        int lp = nombreCompleto.indexOf(' ');
		int lm = nombreCompleto.lastIndexOf(' ');
		int f1 = fechaCumple.indexOf('/');
		int f2 = fechaCumple.lastIndexOf('/');

		System.out.println(nombreCompleto.substring(lp+1,lp+3).toUpperCase() + nombreCompleto.charAt(lm+1) + nombreCompleto.charAt(0) + fechaCumple.substring(f2+3,f2+5) + fechaCumple.substring(f1+1,f1+3) + fechaCumple.substring(0,2));
	}

}
