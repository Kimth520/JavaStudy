package inter;

public class ThreeStarPhone implements Phone {
	int batteryCapacity = 35;
	boolean isOn = false;
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("***폰이 켜졌습니다***\n");
			isOn = true;
		}else {
			System.out.println("배터리가 부족합니다...");
		}
	}
	@Override
	public void powerOff() {
		System.out.println("***폰이 꺼졌습니다***\n");
		isOn = false;
		
	}
	@Override
	public boolean isOn() {
		if(isOn){
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("----유튜브 시청 중-----");
			batteryCapacity -= 10;
			System.out.println("잔여 배터리 ..." + batteryCapacity + "%\n");
		}else {
			System.out.println("배터리가 부족합니다...");
			powerOff();
		}
		
	}
	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY -20) {
			System.out.println("----충전중----");
			batteryCapacity += 5;
			System.out.println("자여 배터리 ..." + batteryCapacity + "%\n");
		}else {
			System.out.println("충전할 필요가 없습니다");
			System.out.println("잔여 배터리..." + batteryCapacity + "%");
		}
		
	}
	
	
}
