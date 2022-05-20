package net.instituto.desa;

public class Game {
	private static final int AVANCE = 1;
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void control(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.derecha(AVANCE);
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.izquierda(AVANCE);
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.subir(AVANCE);
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.bajar(AVANCE);
		}
	}
}
