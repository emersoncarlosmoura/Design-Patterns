package designPattern.chainOfResponsability.server;

import java.util.HashMap;
import java.util.Map;

import designPattern.chainOfResponsability.middlewares.Middleware;

public class Server {
	
	private Map<String, String> users = new HashMap<String, String>();
	
	private Middleware middleware;

	public void setMiddleware(Middleware middleware) {
		this.middleware = middleware;
	}
	
	public boolean logIn (String email, String password) {
		if (middleware.check(email, password)) {
			System.out.println("Usuário autenticado com sucesso!");
			System.out.println("Seja bem vindo!");
			return true;
		}
		return false;
	}
	
	public void registerUser (String email, String password) {
		users.put(email, password);
	}
	
	public boolean hasEmail (String email) {
		return users.containsKey(email);
	}
	
	public boolean isValidPassord (String email, String password) {
		return users.get(email).equals(password);
	}

}
