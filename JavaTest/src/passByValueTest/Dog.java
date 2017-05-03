package passByValueTest;

public class Dog {
	String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}
