package adapter;

public class AmericanoAdapter implements Coffee{

	private Americano americano;
	
	public AmericanoAdapter(Americano americano) { 
		this.americano = americano;
	}

	@Override
	public String make() {
		System.out.println("시럽추가");
		return americano.make();
	}
	// 아메라카노의 make를 주입받는 방법이 두 가지 있다. 
	// 첫번째: extends 사용 (이 방법은 쓰지 않는다)
	// 두번째: 컴퍼지션 사용 후 생성자로 주입받기
}
