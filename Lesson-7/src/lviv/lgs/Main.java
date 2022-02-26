package lviv.lgs;

public class Main {
public static void main(String[] args) {
	Su27 True = new Su27(219935, 85932, 36300, 0, null);

	True.startEngines();
	True.takeoffPlane();
	True.moveUp();
	True.moveLeft();
	True.moveDown();
	True.moveRight();
	True.becomeStealth();
	True.nuclearStrike();
	True.turboAccelerate();
	True.landingPlane();
}

}

