package InterfaceTest2;

public class Ballad implements Music{

	@Override
	public void mode() {
		System.out.println("Ballad 모드");
	}
	void onlyBallad() {
		System.out.println("onlyBallad 실행");
	}
}
