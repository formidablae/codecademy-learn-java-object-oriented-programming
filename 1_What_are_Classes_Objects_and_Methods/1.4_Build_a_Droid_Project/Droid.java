// 1.
// The Droid.java file is empty.

// Start by defining the class Droid.

// Don’t forget to include a main() method! You can leave it empty for now.

// We want a Droid object that has the following state:

// name
// battery level
// and the following behavior:

// performing a task
// stating its battery level

// Stuck? Get a hint

public class Droid {
	int batteryLevel;
	String name;

	public Droid(String droidName) {
		name = droidName;
		batteryLevel = 100;
	}

	public String toString() {
		return "Hello, I'm the droid: " + name;
	}

	public void performTask(String task) {
		System.out.println(name + " is performing task: " + task);
		batteryLevel -= 10;
	}

	public void energyReport() {
		System.out.println("Battery level is: " + batteryLevel);
	}

  public static void main(String[] args) {
		Droid codey = new Droid("Codey");
		System.out.println(codey);
		codey.performTask("dancing");
		codey.energyReport();
		codey.performTask("playing");
		codey.energyReport();
		codey.performTask("joking");
		codey.energyReport();
		Droid codey2 = new Droid("Codey2");
		codey2.performTask("dancing");
		codey2.energyReport();
		codey.energyReport();
  }
}
