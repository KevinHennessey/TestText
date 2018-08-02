package com.xavient.TestText;

import org.springframework.boot.SpringApplication;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestTextApplication {

	public static final String ACCOUNT_SID = "AC99065dae38cc67289429c8d014c8daf8";
	public static final String AUTH_TOKEN = "300caa7e7c86cde69a18b6680fb4e327";
	public static final String FROM_NUMBER = "+16108549593";
	public static final String TO_NUMBER = "+14846539993";
	
	public static void main(String[] args) {
	    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	    Message message = Message
	      .creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
	        "Texting from twilio sample app")
	      //.setMediaUrl("https://climacons.herokuapp.com/clear.png")
	      .create();
	    System.out.println(message.getSid());
		SpringApplication.run(TestTextApplication.class, args);
	}
}
