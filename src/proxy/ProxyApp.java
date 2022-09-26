package proxy;

public class ProxyApp{
	
	public static void main(String[] args) {
		// BlogServer s = new BlogServer();
		ProxyServer ps = new ProxyServer(new BlogServer());
		ps.request();
		
		// 코드는 adapter랑 똑같지만 바라보는 대상이 proxy를 보고 타고 간다.
	}

}
