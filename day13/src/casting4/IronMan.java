package casting4;

public class IronMan extends Hero {

	//생성자
	public IronMan(String name) {
		super(name);
	}

	@Override
	void superPower() {
		System.out.println(this.getName() + "이(가) 수트를 입고 날라갑니다");
		
	}

	
	
	
}