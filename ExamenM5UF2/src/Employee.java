public class Employee {
	/**
	 * @author Iván
	 * @param myName
	 *            variable de clase de nom
	 * @param mySalary
	 *            variable privada de salari.
	 */
	private String myName;
	private double mySalary;

	/**
	 * @method funció que relaciona salari amb el propietari
	 * 
	 * @param name
	 *            variable de la funció employee nom
	 * @param salary
	 *            variable de la funció employee salari
	 */
	public Employee(String name, double salary) {
		myName = name;
		mySalary = salary;
		System.out.println("Soc la tercera versio");
	}

	/**
	 * 
	 * @return String
	 */

	public String getName() {
		return myName;
	}

	/**
	 * 
	 * @return double
	 */
	public double getSalary() {
		return mySalary;
	}

	/**
	 * 
	 * @param percent
	 * @method Funcio que retorna el salari amb percentatge.
	 */

	public void raiseSalary(int percent) {
		mySalary = mySalary + percent * 0.01 * mySalary;
	}
	/**
	 * @method Funcio que estableix un salari determinat.
	 * @param salary
	 */

	public void setSalary(double salary) {
		mySalary = salary;
	}
	/**
	 * @method Funcio que imprimeix per pantalla el nom i el seu salari.
	 */

	public String toString() {
		return "Name: " + getName() + ", Salary: " + getSalary();
	}
}