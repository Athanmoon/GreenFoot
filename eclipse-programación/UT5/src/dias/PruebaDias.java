package dias;

public class PruebaDias {
	public static void main(String[]args) {
		DiaSemana hoy=DiaSemana.Miercoles;
		System.out.println(hoy.ordinal());
		int numDias=100;
		DiaSemana futuro=DiaSemana.diaEnDias(hoy, numDias);
		System.out.println("Dentro de %d dias será %s",numDias,futuro);
	}
}
