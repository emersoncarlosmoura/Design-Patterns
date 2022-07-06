package designPattern.chainOfResponsability;

import org.junit.Before;
import org.junit.Test;

import designPattern.chainOfResponsability.middlewares.CheckPermissionMiddleware;
import designPattern.chainOfResponsability.middlewares.CheckUserMiddleware;
import designPattern.chainOfResponsability.middlewares.Middleware;
import designPattern.chainOfResponsability.server.Server;

public class MainChainOfResponsability {
	
	private static Server server;
	
	@Before
	public void init () {
		server = new Server();
		server.registerUser("admin@gmail.com", "admin123");
		server.registerUser("user@gmail.com", "user123");

		Middleware middleware = new CheckUserMiddleware(server);
		middleware.linkWith(new CheckPermissionMiddleware());

		server.setMiddleware(middleware);
	}
	
	@Test
	public void autenticar () {
		String email = "admin@gmail.com";
		String password = "admin123";
		server.logIn(email, password);
	}
	
} 