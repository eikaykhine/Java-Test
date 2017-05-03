package Scannertest;

public class Cis84 {
	private String name;
	private int id;
	private double grade;

	public Cis84() {
		name = "not input yet";
		id = 00000;
		grade = 0.0;
	}

	public Cis84(String n, int i, double g) {
		name = n;
		id = i;
		grade = g;
	}

	public void setName(String n) {
		name = n;
	}

	public void setId(int i) {
		id = i;
	}

	public void setGrade(double g) {
		grade = g;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getGrade() {
		return grade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/*@Override
	public String toString() {
		return "Cis84 [name=" + name + ", id=" + id + ", grade=" + grade + "]";
	}*/

	@Override
	public String toString() {
		return String.format("%s\n%d\n%.2f\n", name, id, grade);
	}
}
