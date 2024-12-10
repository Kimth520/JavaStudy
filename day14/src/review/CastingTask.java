package review;

public class CastingTask {
	public static void main(String[] args) {
		
		//객체 만들고 확인법
		Music[] mus = {new Ballad(), new HipHop(), new Rock()};
		for(Music music : mus) {
			turnMusic(music);
		}
		
		//객체 만들지 않고 참조값만 사용해서 확인법
		turnMusic(new Ballad());
		turnMusic(new HipHop());
		turnMusic(new Rock());
		
//		Ballad ballad = new Ballad();
//		ballad = null; //참조제거
//	    System.gc(); //권장하지 않음(개발자가 가비지컬렉션을 명시적으로 요청할 수 있으나 JVM이 반드시 즉시 실행하지는 않음)

		
		
	}
	static void turnMusic(Music music) {
		music.mode();
		if(music instanceof Rock) {
			((Rock)music).onlyRock();
		}else if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		}
	}
}
