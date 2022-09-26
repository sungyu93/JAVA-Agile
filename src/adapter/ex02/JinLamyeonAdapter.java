package adapter.ex02;

public class JinLamyeonAdapter implements Lamyeon{

	private JinLamyeon jinLamyeon;
	
	public JinLamyeonAdapter(JinLamyeon jinLamyeon) {
		this.jinLamyeon = jinLamyeon;
	}

	@Override
	public void cook() {
		jinLamyeon.cook();
		System.out.println("계란추가");
		
	}


}
