package designPattern.chainOfResponsability.middlewares;

import designPattern.chainOfResponsability.server.Server;

public class CheckUserMiddleware extends Middleware {

	private Server server;
	
	public CheckUserMiddleware(Server server) {
		this.server = server;
	}
	
	@Override
	public boolean check(String email, String password) {
		if (!server.hasEmail(email)) {
			System.out.println("Email Inválido");
			return false;
		}

		if (!server.isValidPassord(email, password)) {
			System.out.println("Email ou senha Invalidos");
			return false;
		}

		return checkNext(email, password);
	}

}
