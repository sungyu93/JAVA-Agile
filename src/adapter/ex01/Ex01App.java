package adapter.ex01;

import adapter.lib.Email;

public class Ex01App {
	
	public static void main(String[] args) {
		CustomerService cs = new CustomerService(new Email()); 
		// emailadapter는 가짜기 때문에 언제라도 넣어도 된다.
		cs.acceptClaim("마음에 안들어");
	}
}
