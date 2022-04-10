package menu;

public interface IMenu {

	/**
	 * Una vez se ejecuta otra funcion, no podremos añadir mas
	 * 
	 * @param pos
	 * @param op
	 * @throws MenuIllegalEstateExcepcion 
	 * @throws MenuIndexOutOfBoundExcepcion 
	 */
	public void add(int pos, String op) throws MenuIllegalEstateExcepcion, MenuIndexOutOfBoundExcepcion;

	/**
	 * Una vez se ejecuta otra funcion, no podremos añadir mas
	 * 
	 * @param op
	 * @throws MenuIllegalEstateExcepcion 
	 */
	public void add(String op) throws MenuIllegalEstateExcepcion;

	/**
	 * Retorna el texto de la opción que pasemos por parámetro
	 * 
	 * @param pos Posición solicitada
	 * @return el String de la posición que pedimos
	 * @throws MenuIndexOutOfBoundExcepcion 
	 */
	public String get(int pos) throws MenuIndexOutOfBoundExcepcion;

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
	 * @throws MenuIndexOutOfBoundExcepcion 
	 */
	public void select(int pos) throws MenuIndexOutOfBoundExcepcion;

}
