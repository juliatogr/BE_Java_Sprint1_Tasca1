package n1exercici1;

public class N1_E1_main {

	public static void main(String[] args) {
		System.out.println("Carregant la classe InstrumentVent mitjançant l'accés a un atribut estàtic...");
		
		InstrumentVent.ATRIBUT_ESTATIC++;
		
		System.out.println();
		
		System.out.println("Inicialitzant els instruments de vent..");
		InstrumentVent iv1 = new InstrumentVent("Flauta", 52);
		InstrumentVent iv2 = new InstrumentVent("Oboe", 207);
		InstrumentVent iv3 = new InstrumentVent("Harmònica", 34);
		
		System.out.println();
		
		System.out.println("Mostrant els instruments de vent...");
		
		System.out.println(iv1);
		System.out.println(iv2);
		System.out.println(iv3);
		
		System.out.println();
		
		System.out.println("Fent sonar els instruments de vent...");
		iv1.tocar();
		iv2.tocar();
		iv3.tocar();
		
		System.out.println();
		
		System.out.println("Carregant la classe InstrumentCorda mitjançant una inicialització...");
		InstrumentCorda ic1 = new InstrumentCorda("Guitarra", 630);

		System.out.println();
		
		System.out.println("Inicialitzant la resta d'instruments de corda...");
		InstrumentCorda ic2 = new InstrumentCorda("Ukelele", 104);
		InstrumentCorda ic3 = new InstrumentCorda("Baix", 523);
		
		System.out.println();
		
		System.out.println("Mostrant els instruments de corda...");
		
		System.out.println(ic1);
		System.out.println(ic2);
		System.out.println(ic3);
		
		System.out.println();
		
		System.out.println("Fent sonar els instruments de corda...");
		ic1.tocar();
		ic2.tocar();
		ic3.tocar();
		
		System.out.println();

		System.out.println("Carregant la classe InstrumentPercussio mitjançant una inicialització...");
		InstrumentPercussio ip1 = new InstrumentPercussio("Tambor", 74);

		System.out.println();
		
		System.out.println("Inicialitzant la resta d'instruments de percussió...");
		InstrumentPercussio ip2 = new InstrumentPercussio("Caixa", 203);
		InstrumentPercussio ip3 = new InstrumentPercussio("Bombo", 321);
		
		System.out.println();
		
		System.out.println("Mostrant els instruments de percussió...");
		
		System.out.println(ip1);
		System.out.println(ip2);
		System.out.println(ip3);
		
		System.out.println();
		
		System.out.println("Fent sonar els instruments de percussió...");
		ip1.tocar();
		ip2.tocar();
		ip3.tocar();
	}

}
