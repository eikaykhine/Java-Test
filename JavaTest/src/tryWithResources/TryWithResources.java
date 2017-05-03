package tryWithResources;

public class TryWithResources {

	public static void main(String[] args) throws Exception {

		try (OpenDoor door = new OpenDoor()) {
			door.swing();
		} catch (Exception e) {
			System.out.println("Is there a draft? " + e.getClass());
		} finally {
			System.out.println("I'm putting a sweater on, regardless. ");
		}
	}

}
