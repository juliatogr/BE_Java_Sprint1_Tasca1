package n1exercici2;

public class N1_E2_main {
	public static void main(String[] args) {
		
		System.out.println("Instanciant dos cotxes sense assignar model...");
		Cotxe c1 = new Cotxe(30);
		Cotxe c2 = new Cotxe(40);
		
		// El model es considera null.
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println();
		
		System.out.println("Instanciant un cotxe amb model Qashqai...");
		Cotxe c3 = new Cotxe("Qashqai", 120);
		
		// El model és Qashqai
		System.out.println(c3);
		
		System.out.println();
		
		// El model de tots els cotxes creats fins ara és Qashqai perquè
		// l'atribut model és static.
		System.out.println("Imprimint tots els cotxes creats fins ara...");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println();
		
		System.out.println("Instanciant un cotxe amb model Juke...");
		Cotxe c4 = new Cotxe("Juke", 80);
		
		// El model és Juke
		System.out.println(c4);
		
		System.out.println();
		
		// El model de tots els cotxes creats fins ara és Juke perquè
		// l'atribut model és static.
		System.out.println("Imprimint tots els cotxes creats fins ara...");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println();
		
		System.out.println("Modificant el model del cotxe 2 per 'Micra'...");
		c2.setModel("Micra");

		System.out.println();
		
		// El model de tots els cotxes creats fins ara és Micra perquè
		// l'atribut model és static.
		System.out.println("Imprimint tots els cotxes creats fins ara...");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
