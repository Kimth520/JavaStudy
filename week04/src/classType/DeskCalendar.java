package classType;

public class DeskCalendar extends Calendar{

	public DeskCalendar(String color, int month) {
		super(color, month);
	}

	@Override
	void hanging() {
		System.out.println("color" + "달력을 벽에 걸기 위해 고리가 추가로 필요합니다");
	}
	
	void onTheDesk() {
		System.out.println(color + "달력을 책상에 세울 수 있습니다");
	}

	
}
