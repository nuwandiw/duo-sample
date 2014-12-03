package wso2.com;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.json.JSONObject;

import com.duosecurity.client.Http;

public class CreateUser {
	private static String SKEY = "6Beg8JwYTxwyzKuIRDHAiev63zYIGd509ui3yju0";
	private static String IKEY = "DIEH769PXM6C3NPH1Q8U";
	private static String host = "api-b1b75575.duosecurity.com";
	
	public static void main(String[] args){
		Options options = new Options();
        Option opt;
        opt = new Option("username", true, "username (required)");
        opt.setRequired(true);
        options.addOption(opt);
        
        CommandLineParser parser = new PosixParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;
        try {
            cmd = parser.parse(options, args);
        }
        catch (ParseException parseException) {
            System.err.println(parseException.getMessage());
            formatter.printHelp("CreateUser", options);
            System.exit(1);
            return;
        }
        JSONObject result = null;
        
        try{
        	Http request = new Http("POST", host,"/admin/v1/users");
        	request.addParam("username", cmd.getOptionValue("username"));
        	request.signRequest(IKEY,SKEY);
            
        	result = (JSONObject)request.executeRequest();
            request = null; // cleanup the request object
        	
            System.out.println("Created user with ID:"+result.getString("user_id"));
        } catch(Exception e){
        	
        }
		
	}

}
