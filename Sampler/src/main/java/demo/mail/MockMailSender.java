package demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements MailSender {
	
	public static final Log LOG = LogFactory.getLog(MockMailSender.class);
	@Override
	public void send(String to, String subject, String body) {

		LOG.info("to : "+to);
		LOG.info("subject : "+subject);
		LOG.info("body : "+body);
	}
}
