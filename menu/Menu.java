package menu;

import java.util.ArrayList;

public class Menu implements IMenu {

	ArrayList<Opcion> lista = new ArrayList<>();
	int opciones = 0;
	boolean validar = true;

	public Menu(String op) {
		Opcion opc = new Opcion(op);
		opc.check();
		lista.add(opc);
		opciones = lista.size();

	}

	@Override
	public void add(int pos, String op) {
		if (validar == true) {
			Opcion opc = new Opcion(op);
			lista.add(pos, opc);
			if (pos == 0) {
				opc.check();
				lista.get(1).uncheck();
			}
		}

	}

	@Override
	public void add(String op) {
		if (validar == true) {
			Opcion opc = new Opcion(op);
			lista.add(opc);
		}
	}

	@Override
	public String get(int pos) {
		return lista.get(pos).toString();
	}

	@Override
	public int next() {
		int i = 0;
		while (lista.get(i).getSeleccionada()) {
			if (lista.get(i).getSeleccionada()) {
				lista.get(i).uncheck();
				lista.get(i + 1).check();
			}

		}
		return 0;
	}

	@Override
	public int previous() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int read() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void select(int pos) {
		// TODO Auto-generated method stub

	}

}
