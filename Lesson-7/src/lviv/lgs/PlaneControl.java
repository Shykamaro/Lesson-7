package lviv.lgs;

public class PlaneControl {

	public void moveUp() {
		System.out.println("˳��� ������� ����� " + Move.move() + " ��");
	}

	public void moveDown() {
		System.out.println("˳��� ������� ���� " + Move.move() + " ��");
	}

	public void moveLeft() {
		System.out.println("˳��� ������� �� ��� " + Move.move() + " ��");
	}

	public void moveRight() {
		System.out.println("˳��� ������� �� ����� " + Move.move() + " ��");
	}
}
