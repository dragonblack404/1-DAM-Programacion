package menu;

public interface IMenu {

	/**
	 * Una vez se ejecuta otra funcion, no podremos a�adir mas
	 * 
	 * @param pos
	 * @param op
	 * @throws MenuIllegalEstateExcepcion 
	 * @throws MenuIndexOutOfBoundExcepcion 
	 */
	public void add(int pos, String op) throws MenuIllegalEstateExcepcion, MenuIndexOutOfBoundExcepcion;

	/**
	 * Una vez se ejecuta otra funcion, no podremos a�adir mas
	 * 
	 * @param op
	 * @throws MenuIllegalEstateExcepcion 
	 */
	public void add(String op) throws MenuIllegalEstateExcepcion;

	/**
	 * Retorna el texto de la opci�n que pasemos por par�metro
	 * 
	 * @param pos Posici�n solicitada
	 * @return el String de la posici�n que pedimos
	 * @throws MenuIndexOutOfBoundExcepcion 
	 */
	public String get(int pos) throws MenuIndexOutOfBoundExcepcion;

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
	 * @throws MenuIndexOutOfBoundExcepcion 
	 */
	public void select(int pos) throws MenuIndexOutOfBoundExcepcion;

}
