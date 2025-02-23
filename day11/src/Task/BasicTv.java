package Task;

public class BasicTv {
//	    필드 :
//		boolean power : TV 전원 상태 (기본값: false)
//		int channel : TV 채널 (기본값: 1)
//		String color : TV의 색상
//		int size : TV의 크기
//		int price : TV의 가격
//


	// 필드
	boolean power;
	String color;
	int size;
	int price;
	int channer;


	// 생성자
	public BasicTv(boolean power, String color, int size, int price, int channer) {
		this.power = power;
		this.color = color;
		this.size = size;
		this.price = price;
		this.channer = channer;
	}
//	메서드:
//	void powerOnOff() : TV 전원을 켜거나 끄는 메서드
//	      전원이 켜져 있으면 끄고, 꺼져 있으면 켜야 다른 동작이 가능하다
//	void channelUp() : 채널을 1씩 증가시키는 메서드
//	      채널 최대값 999
//	void channelDown() : 채널을 1씩 감소시키는 메서드
//	      채널 최소값 1
	
	void powerOnOff() {
		power = !power;
		System.out.println("TV 전원이 " + (power ? "켜졌습니다":"꺼졌습니다"));
	}
	
	void channerUp() {
		if(power) {
		System.out.println("현재 채널 : " + channer);
		if(channer >=1 && channer <=999) {
			channer ++;
		}
		System.out.println("올린 후 현재 채널 : " + channer);
		}else {
			System.out.println("TV 전원을 먼저 켜주세요");
		}
	}
	
	void channerDown() {
		if(power) {
		System.out.println("현재 채널 : " + channer);
		if(channer >=1 && channer <=999) {
			channer --;
		}
		System.out.println("내린 후 현재 채널 : " + channer);
		}else {
			System.out.println("TV 전원을 먼저 켜주세요");
		}
	}
	
}
