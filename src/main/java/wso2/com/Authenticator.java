package wso2.com;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;


import com.duosecurity.duoweb.DuoWeb;
import com.duosecurity.duoweb.DuoWebException;

public class Authenticator {
    
	private static String AKEY;
	private static String SKEY = "zmYnTwqWUjuUAh2gIxlA9ojv8NKfm4Xcl6XMNq5p";
	private static String IKEY = "DITS09HF8UYE0CRPIINU";
	
	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String login(String uName, String psw){
		if(uName=="nuwandi" && psw=="admin"){
			AKEY = strgenerator();			 
			return DuoWeb.signRequest(IKEY, SKEY, AKEY, uName);
		}else{
			return null;
		}
	}
	
	public static String strgenerator(){
		StringBuilder sb = new StringBuilder(42);
		Random rnd = new Random();
		
	    for( int i = 0; i < 42; i++ ){
		   sb.append(AB.charAt(rnd.nextInt(AB.length())));
	    }	      
	    return sb.toString();
	}
	
	public static String verify(String sig_response){
		try {
			return DuoWeb.verifyResponse(IKEY, SKEY, AKEY, sig_response);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
			return null;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		} catch (DuoWebException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
