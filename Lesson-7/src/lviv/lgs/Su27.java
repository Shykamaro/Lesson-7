package lviv.lgs;

public class Su27 extends Plane implements NuclearStrike,StealthTechnology,TurboAcceleration {

	int maxSpeed;
	String color;

	public Su27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * 500 );
		System.out.println("Турбоприскорення запущено. Швидкість літака " + accSpeed + " км/год");
		
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("Запущена технологія Стелс. Літак зникне через  " + unvisibleTime + " cек");
		
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("Активований ядерний удар.Буде скинуто  " + bombsAmount + " боєголовок");
		
	}

}
