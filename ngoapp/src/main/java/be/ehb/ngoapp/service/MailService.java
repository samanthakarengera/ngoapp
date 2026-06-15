package be.ehb.ngoapp.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String from, String subject, String message) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("admin@ngo.be"); // fake admin mail
        mail.setFrom(from);
        mail.setSubject(subject);
        mail.setText(message);

        mailSender.send(mail);
    }
}