package com.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

	public static void main(String[] args) {

		String to = "vijay.bharti@oracle.com";
		String from = "vijay.bharti@oracle.com";
		String host = "internal-mail-router.oracle.com";

		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);

		Session session = Session.getDefaultInstance(properties);

		try {

			MimeMessage message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			message.setSubject("Testing");

			message.setText("Testing");

			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}