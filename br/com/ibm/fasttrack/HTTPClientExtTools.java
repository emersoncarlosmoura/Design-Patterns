package br.com.ibm.fasttrack;

import java.io.IOException;
import java.util.HashMap;

import org.jdom.Element;
import org.jdom.JDOMException;

public class HTTPClientExtTools {

	public static Element talkExtCleanBody(String url, String postXML, String proxy, String socks, HashMap sslParms,
			String headerXML, String method, String body) throws JDOMException, IOException {
		
		body = body.replace("&#227;", "�").replace("&#195;", "�").replace("&#245;", "�")
				 .replace("&#213;", "�").replace("&#225;", "�").replace("&#193;", "�")
				 .replace("&#243;", "�").replace("&#211;", "�").replace("&#224;", "�")
				 .replace("&#192;", "�").replace("&#233;", "�").replace("&#201;", "�")
				 .replace("&#231;", "�").replace("&#199;", "�").replace("&#241;", "�")
				 .replace("&#209;", "�").replace("&quot;", "\"").replace("&amp;", "&");
		
		return HTTPClientExtBody.talkExtBody(url, postXML, proxy, socks, sslParms, headerXML, method, body);
	}

}
