package tryWithResources;

class OpenDoor implements AutoCloseable {

	public OpenDoor() throws Exception {
		System.out.println("The door is open.");
		//throw new Exception();
	}

	public void swing() throws Exception {
		System.out.println("The door is becoming unhinged.");
		//throw new Exception();
	}

	public void close() throws Exception {

		System.out.println("The door is closed.");
		throw new Exception();
	}
}
