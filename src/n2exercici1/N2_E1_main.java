package n2exercici1;

public class N2_E1_main {

	public static void main(String[] args) {
		Smartphone sp = new Smartphone("Samsung", "Galaxy S22");
		
		System.out.println(sp);
		
		System.out.println();
		
		sp.trucar("680284672");
		sp.alarma();
		sp.fotografiar();
	}

}
