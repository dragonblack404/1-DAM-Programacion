package menu;

public interface IMenu {

	/**
	 * Una vez se ejecuta otra funcion, no podremos a�adir mas
	 * 
	 * @param pos
	 * @param op
	 */
	public void add(int pos, String op);

	/**
	 * Una vez se ejecuta otra funcion, no podremos a�adir mas
	 * 
	 * @param op
	 */
	public void add(String op);

	/**
	 * Retorna el texto de la opci�n que pasemos por par�metro
	 * 
	 * @param pos Posici�n solicitada
	 * @return el String de la posici�n que pedimos
	 */
	public String get(int pos);

	/**
	 * Cambia la opci�n seleccionada por la siguiente
	 * 
	 * @return La opci�n seleccionada actual
	 */
	public int next();

	/**
	 * Cambia la opci�n seleccionada por la anterior
	 * 
	 * @return La opci�n seleccionada actual
	 */
	public int previous();

	/**
	 * Consulta la opci�n seleccionada actual
	 * 
	 * @return La opci�n seleccionada actual
	 */
	public int read();

	/**
	 * Cambia la opci�n seleccionada por la indicada
	 * 
	 * @param pos �sta ser� la opci�n seleccionada
	 */
	public void select(int pos);

}
