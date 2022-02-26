package lviv.lgs;

public abstract class Plane {

	private int length;
	private int height;
	private int weight;

	private PlaneControl planeControl = new PlaneControl();

	public Plane(int length, int height, int weight) {
		this.setLength(length);
		this.setHeight(height);
		this.setWeight(weight);
	}

	

	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("Заводжу двигуни. Взлетимо через " + countdown + " сек");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("Починаю здійматись.Літак з повними баками пролетить " + distance + " км");
	}

	public void landingPlane() {
		System.out.println("Виконую посадку.");
	}

	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}
	
}
