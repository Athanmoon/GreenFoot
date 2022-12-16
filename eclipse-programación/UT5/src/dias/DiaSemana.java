package dias;

public enum DiaSemana {
	Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo;
}
public static DiaSemana diaEnDias(DiaSemana dia, int dias) {
	DiaSemana nuevoDia;
	final int MAX =DiaSemana.values().length-1;
	int nuevo=dia.ordinal();
	for(int n=1;n<=dias;n++) {
		nuevo=nuevo+1;
		if(nuevo>MAX) {
			nuevo=0;
		}
	}
	nuevoDia=DiaSemana.values()[nuevo];
}