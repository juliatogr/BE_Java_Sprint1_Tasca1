package n1exercici1;

public class InstrumentPercussio extends Instrument {
	
	static {
		// El bloc nom�s s'executar� el primer cop que es carregui la classe,
		// abans d'inicialitzar cap objecte i entrar al constructor.
		System.out.println("Has carregat la classe InstrumentPercussio.");
	}
	
	{
		// El bloc s'executar� cada cop que s'instanc�i un objecte de la classe.
		System.out.println("Est�s instanciant un objecte de InstrumentPercussio.");
	}
	
	public InstrumentPercussio(String nom, int preu) {
		super(nom, preu);
		//Despr�s de cridar al super, es crida al bloc d'inicialitzaci� autom�ticament.
		// Despr�s, continua amb el codi del constructor.
		System.out.println("Has instanciat un objecte de InstrumentPrecussio");
	}
	
	public void tocar() {
		System.out.println("Est� sonant un instrument de percussio.");
	}
	
	@Override
	public String toString() {
		return "S�c un/a " + nom + " i pertanyo als Instruments de Percussi�. Tinc un cost de " + preu + " �";
	}
}
