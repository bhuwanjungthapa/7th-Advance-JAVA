package MailServer;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Authenticator;

public class javaMailSend {
    public static void main(String[] args) {
        //String receipent = "kmanuja712@gmail.com";
        //String receipent = "manujakoirala1@gmail.com";


        String receipent = "bhuwanjung115@gmail.com";
        String sender = "bhuwanjung115@gmail.com";

        final String uname = "bhuwanjung115@gmail.com";
        final String pwd = "fkpltnxeqsflxryz";

        String smthost = "smtp.gmail.com";

        Properties propvis = new Properties();
        propvis.put("mail.smtp.auth","true");
        propvis.put("mail.smtp.starttls.enable","true");
        propvis.put("mail.smtp.host", smthost);
        propvis.put("mail.smtp.port", "587");

        //session object


        Session sessionobj = Session.getInstance(propvis, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(uname, pwd);
            }
        });


        try{
            Message messageobj = new MimeMessage(sessionobj);
            messageobj.setFrom(new InternetAddress(sender));
            messageobj.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receipent));

            messageobj.setSubject("hello");

            messageobj.setText("hello");

            Transport.send(messageobj);
            System.out.println("Email sent successfully");
        }catch (MessagingException e){
            throw new RuntimeException(e);
        }
    }
}