package MailServer;
import java.util.Arrays;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Address;

public class javaMailReceive {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");

        try {
            Session session = Session.getInstance(props);
            Store store = session.getStore();
            store.connect("imap.gmail.com", "bhuwanjung115@gmail.com", "fkpltnxeqsflxryz");

            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_ONLY);

            System.out.println("--------------------------------------");
            Message message = inbox.getMessage(inbox.getMessageCount());

            Address[] fromAddresses = message.getFrom();
            System.out.println("From: " + fromAddresses[0]);

            System.out.println("Subject: " + message.getSubject());

            System.out.println("Text: " + message.getContent());

            inbox.close(true);
            store.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
