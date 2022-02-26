package lviv.lgs;

public class PlaneControl {

	public void moveUp() {
		System.out.println("Літак пролетів вверх " + Move.move() + " км");
	}

	public void moveDown() {
		System.out.println("Літак пролетів вниз " + Move.move() + " км");
	}

	public void moveLeft() {
		System.out.println("Літак пролетів на ліво " + Move.move() + " км");
	}

	public void moveRight() {
		System.out.println("Літак пролетів на право " + Move.move() + " км");
	}
}
