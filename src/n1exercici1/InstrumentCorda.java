package n1exercici1;

public class InstrumentCorda extends Instrument {
	
	static {
		// El bloc nom�s s'executar� el primer cop que es carregui la classe,
		// abans d'inicialitzar cap objecte i entrar al constructor.
		System.out.println("Has carregat la classe InstrumentCorda.");
	}
	
	{
		// El bloc s'executar� cada cop que s'instanc�i un objecte de la classe.
		System.out.println("Has inicialitzat un Instrument de Corda.");
	}
	
	public InstrumentCorda(String nom, int preu) {
		super(nom, preu);
		//Despr�s de cridar al super, es crida al bloc d'inicialitzaci� autom�ticament.
	}
	
	public void tocar() {
		System.out.println("Est� sonant un instrument de corda.");
	}
	
	@Override
	public String toString() {
		return "S�c un/a " + nom + " i pertanyo als Instruments de Corda. Tinc un cost de " + preu + " �";
	}
}
