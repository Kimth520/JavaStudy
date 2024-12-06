package marvelTask;

public class MarverlHeroMain {
	public static void main(String[] args) {
		//아이언맨과 헐크 객체를 만들고 정보 출력
		MarvelHero ironMan = new MarvelHero("Ironman","나노 슈트 착용",47);
		MarvelHero hulk = new MarvelHero("Hulk", "초록 괴물화", 45);
		ironMan.printInfo();
		hulk.printInfo();
		
		ironMan.performAction();
		hulk.performAction();
		
	}
}
