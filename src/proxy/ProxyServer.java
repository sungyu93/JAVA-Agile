package proxy;

public class ProxyServer implements Server {

	private BlogServer server;

	public ProxyServer(BlogServer blogServer) {
	}

	@Override
	public void request() {
		System.err.println("요청을 받음");
	}
	
}
