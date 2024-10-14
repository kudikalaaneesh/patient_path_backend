package capstone.project.paticentpath.services.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import capstone.project.paticentpath.services.EmailSender;
import io.swagger.v3.oas.annotations.servers.Server;

@Service

public class SendEmailImpl implements EmailSender {

	//sending email using spring boot to send mail
	
	
	 @Autowired
	 private JavaMailSender  sendmail;
	 
	 private static org.slf4j.Logger logger = LoggerFactory.getLogger(SendEmailImpl.class);
	 
	 
	@Override


	public void sendEmail(String sender_to_Email, String subject, String body) {

		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("aneeshkudikala@gmail.com");
        message.setTo(sender_to_Email);
        message.setSubject(subject);
        message.setText(body);

        try {
            sendmail.send(message);
            logger.info("Email sent successfully to {}", sender_to_Email);
        } catch (Exception e) {
            logger.error("Failed to send email: {}", e.getMessage());
        }
    }
	}


