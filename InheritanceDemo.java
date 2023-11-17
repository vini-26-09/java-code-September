class Vehicle {
	String name;
	int num;
	private int status;

	void run() {
		status = 1;
		System.out.println("Vehicle is running");
	}

	void display() {
		System.out.println("Name " + name);
		System.out.println("status " + status);
		System.out.println("Num " + num);
	}

	void stop() {
		status = 0;
		System.out.println("Vehicle is stopped");

	}
}

class TwoWheeler extends Vehicle {
	void show() {
		System.out.println("two wheeler class function " + status);
	}
}

public class InheritanceDemo {
	public static void main(String ar[]) {
		TwoWheeler obj = new TwoWheeler();
		obj.run();
		obj.stop();
		// obj.show();
		Vehicle v = new Vehicle();
		v.run();
		v.stop();
		v.display();

	}

}
