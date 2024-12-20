package Task;

public class TvController {
	public static void main(String[] args) {
//		BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
//		  프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다

		BasicTv tv = new BasicTv(false, "Black", 32, 500000, 1);
		
//		=== TV 컨트롤 메뉴 ===
//		1. 전원 On/Off
//		2. 채널 올리기
//		3. 채널 내리기
//		4. 종료
//		메뉴 번호 입력 : 
		tv.powerOnOff();
		
		tv.channerUp();
		tv.channerDown();
		
		tv.powerOnOff();
		while(true) {
			
		}
		
//		사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//		1 : powerOnOff() 메서드 호출
//		전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//		2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//		꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//		3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//		그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
		
	}
}
