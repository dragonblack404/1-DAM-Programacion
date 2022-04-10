package menu;

import java.util.ArrayList;

public class Menu implements IMenu {

	private ArrayList<Opcion> lista = new ArrayList<>();
	private int opciones = 0;
	private boolean anadirMas = true;

	public Menu(String op) {
		Opcion opc = new Opcion(op);
		opc.check();
		lista.add(opc);
		opciones = lista.size();
	}

	@Override
	public void add(int pos, String op) throws MenuIllegalEstateExcepcion, MenuIndexOutOfBoundExcepcion {
		if (pos < 0 || pos > opciones)
			throw new MenuIndexOutOfBoundExcepcion();
		if (!anadirMas)
			throw new MenuIllegalEstateExcepcion();
		else {
			Opcion opc = new Opcion(op);
			lista.add(pos, opc);
			if (pos == 0) {
				opc.check();
				lista.get(1).uncheck();
			}
			opciones = lista.size();
		}
	}

	@Override
	public void add(String op) throws MenuIllegalEstateExcepcion {
		if (!anadirMas)
			throw new MenuIllegalEstateExcepcion();
		else {
			Opcion opc = new Opcion(op);
			lista.add(opc);
			opciones = lista.size();
		}
	}

	@Override
	public String get(int pos) throws MenuIndexOutOfBoundExcepcion {
		if (pos < 0 || pos >= lista.size())
			throw new MenuIndexOutOfBoundExcepcion();
		return lista.get(pos).getTexto();
	}

	@Override
	public int next() {
		anadirMas = false;
		int i = 0;
		boolean validar = true;
		while (i < opciones - 1 && validar) {
			if (lista.get(i).getSeleccionada()) {
				lista.get(i).uncheck();
				i++;
				lista.get(i).check();
				validar = false;
			} else
				i++;
		}
		return i;
	}

	@Override
	public int previous() {
		anadirMas = false;
		int i;
		if (opciones > 1) {
			i = opciones - 1;
			boolean validar = true;
			while (i > 0 && validar) {
				if (lista.get(i).getSeleccionada()) {
					lista.get(i).uncheck();
					i--;
					lista.get(i).check();
					validar = false;
				} else
					i--;
			}
		}else
			i = 0;

		return i;
	}

	@Override
	public int read() {
		anadirMas = false;
		int i;
		for (i = 0; i < opciones && !lista.get(i).getSeleccionada(); i++) {
		}
		return i;
	}

	@Override
	public void select(int pos) throws MenuIndexOutOfBoundExcepcion {
		if (pos < 0 || pos >= lista.size())
			throw new MenuIndexOutOfBoundExcepcion();
		anadirMas = false;
		int i = 0;
		boolean validar = true;
		while (i < opciones - 1 && validar) {
			if (lista.get(i).getSeleccionada()) {
				lista.get(i).uncheck();
				lista.get(pos).check();
				validar = false;
			} else
				i++;
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < opciones; i++) {
			s += lista.get(i).toString() + "\n";
		}
		return s;
	}

}
