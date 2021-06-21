package br.com.ibm.fasttrack;

import java.io.IOException;
import java.util.HashMap;

import org.jdom.Element;
import org.jdom.JDOMException;

public class HTTPClientExtTools {

	public static Element talkExtCleanBody(String url, String postXML, String proxy, String socks, HashMap sslParms,
			String headerXML, String method, String body) throws JDOMException, IOException {
		
		body = body.replace("&#227;", "ã").replace("&#195;", "Ã").replace("&#245;", "õ")
				 .replace("&#213;", "Õ").replace("&#225;", "á").replace("&#193;", "Á")
				 .replace("&#243;", "ó").replace("&#211;", "Ó").replace("&#224;", "à")
				 .replace("&#192;", "À").replace("&#233;", "é").replace("&#201;", "É")
				 .replace("&#231;", "ç").replace("&#199;", "Ç").replace("&#241;", "ñ")
				 .replace("&#209;", "Ñ").replace("&quot;", "\"").replace("&amp;", "&");
		
		return HTTPClientExtBody.talkExtBody(url, postXML, proxy, socks, sslParms, headerXML, method, body);
	}

}
