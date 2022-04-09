package menu;

public interface IMenu {

	/**
	 * Una vez se ejecuta otra funcion, no podremos añadir mas
	 * 
	 * @param pos
	 * @param op
	 */
	public void add(int pos, String op);

	/**
	 * Una vez se ejecuta otra funcion, no podremos añadir mas
	 * 
	 * @param op
	 */
	public void add(String op);

	/**
	 * Retorna el texto de la opción que pasemos por parámetro
	 * 
	 * @param pos Posición solicitada
	 * @return el String de la posición que pedimos
	 */
	public String get(int pos);

	/**
	 * Cambia la opción seleccionada por la siguiente
	 * 
	 * @return La opción seleccionada actual
	 */
	public int next();

	/**
	 * Cambia la opción seleccionada por la anterior
	 * 
	 * @return La opción seleccionada actual
	 */
	public int previous();

	/**
	 * Consulta la opción seleccionada actual
	 * 
	 * @return La opción seleccionada actual
	 */
	public int read();

	/**
	 * Cambia la opción seleccionada por la indicada
	 * 
	 * @param pos Ésta será la opción seleccionada
	 */
	public void select(int pos);

}
