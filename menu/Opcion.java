package menu;

public class Opcion {

	private String texto;
	private boolean selec;
	
	private static boolean comprobacionString(String f) {
		return f.contains("\n");
	}

	public Opcion(String t) {
		if (t == null || t.isBlank() || comprobacionString(t))
			throw new OpcionIllegalArgumentException("Se intentó crear una opcion inválida");
		texto = t;
	}

	public void check() {
		selec = true;
	}

	public void uncheck() {
		selec = false;
	}

	public String getTexto() {
		return texto;
	}

	public boolean getSeleccionada() {
		return selec;
	}

	public String toString() {
		String t;
		if (selec)
			t = "* " + texto;
		else
			t = texto;

		return t;
	}

}
