package menu;

public class Opcion {

	private String texto;
	private boolean selec;

	public Opcion(String t) {
		if (t == null || t.isBlank())
			throw new OpcionIllegalArgumentException("Se intentó crear una opcion sin texto");
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
		if (selec == true)
			t = "* " + texto;
		else
			t = texto;

		return t;
	}

}
