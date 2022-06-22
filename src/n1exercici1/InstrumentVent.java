package n1exercici1;

public class InstrumentVent extends Instrument {
	
	static int ATRIBUT_ESTATIC = 3;
	static {
		// El bloc nom�s s'executar� el primer cop que es carregui la classe,
		// abans d'inicialitzar cap objecte i entrar al constructor.
		System.out.println("Has carregat la classe InstrumentVent.");
	}
	
	{
		// El bloc s'executar� cada cop que s'instanc�i un objecte de la classe.
		System.out.println("Has inicialitzat un Instrument de Vent.");
	}
	
	public InstrumentVent(String nom, int preu) {
		super(nom, preu);
		//Despr�s de cridar al super, es crida al bloc d'inicialitzaci� autom�ticament.
	}
	
	public void tocar() {
		System.out.println("Est� sonant un instrument de vent.");
	}

	@Override
	public String toString() {
		return "S�c un/a " + nom + " i pertanyo als Instruments de Vent. Tinc un cost de " + preu + " �";
	}
	
}
