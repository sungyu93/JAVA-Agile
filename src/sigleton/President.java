package sigleton;

public class President {
	
	private static President instance = new President("이재명");
	// 변수는 다 private로 만들어야 한다.
	
	public static President getInstance() { 
		return instance;
	}
		
	private String name;
	
	private President(String name) {
		this.name = name;
	}
}
