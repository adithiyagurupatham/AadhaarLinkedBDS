package secure;

import java.util.*;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    public static boolean sendMail(String from,String password,String message,String to[])
    {
        String host="smtp.gmail.com";
        Properties pro=System.getProperties();
        pro.put("mail.smtp.starttls.enable","true");
        pro.put("mail.smtp.host",host);
        pro.put("mail.smtp.user",from);
        pro.put("mail.smtp.password",password);
        pro.put("mail.smtp.port", 587); //port number for https
        pro.put("mail.smtp.auth","true"); //for the purpose of authentication
        Session session=Session.getDefaultInstance(pro,null); //Creation of new session
        MimeMessage mimeMessage=new MimeMessage(session); //New mime message created
        try
        {
            mimeMessage.setFrom(new InternetAddress("adithiyagurupathamcit@gmail.com")); // To change From address edit here
            InternetAddress[] toAddress=new InternetAddress[to.length];
            for(int i=0;i<to.length;i++)
            {
                toAddress[i]=new InternetAddress(to[i]); // To address made as an array
            }
                for(int i=0;i<toAddress.length;i++)
                {
                        mimeMessage.addRecipient(RecipientType.TO,toAddress[i]); //Recipient added
                        
                }
                mimeMessage.setSubject("Emergency Blood Required"); // To change the subject edit here
                mimeMessage.setText(message);
                Transport transport= session.getTransport("smtp"); // Sets the transport protocol
                transport.connect(host,from,password); // Connection established
                transport.sendMessage(mimeMessage,mimeMessage.getAllRecipients());
                transport.close(); // Connection closed
                return true;
                
            
            
        }
        catch(MessagingException me)
        {
            me.printStackTrace(); // Prints Error message
        }
        
        
        return false;
    }

    boolean sendMail(String adithiyagurupathamcitgmailcom, String guru1997, String[] to) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
