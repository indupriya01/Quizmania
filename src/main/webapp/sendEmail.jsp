<%@ page import="java.util.Properties" %>
<%@ page import="javax.mail.*" %>
<%@ page import="javax.mail.internet.*" %>

<%
   // Get the form data submitted by the user
   String name = request.getParameter("name");
   String email = request.getParameter("email");
   String subject = request.getParameter("subject");
   String message = request.getParameter("message");

   // Email configuration
   String toEmail = "recipient@example.com"; // Replace this with the recipient's email address

   // Your SMTP server details
   String host = "smtp.gmail.com"; // Change the host if using a different email provider
   String port = "587"; // Change the port if using a different email provider
   final String username = "2100030192csh@gmail.com"; // Replace this with your own email address
   final String password = "Indu@3026"; // Replace this with your email password

   // Set up the SMTP server properties
   Properties props = new Properties();
   props.put("mail.smtp.host", host);
   props.put("mail.smtp.port", port);
   props.put("mail.smtp.auth", "true");
   props.put("mail.smtp.starttls.enable", "true");

   try {
       // Create a session with the email server
       Session s = Session.getInstance(props, new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
           }
       });

       // Create a message
       Message mailMessage = new MimeMessage(s);
       mailMessage.setFrom(new InternetAddress(username));
       mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
       mailMessage.setSubject(subject);
       mailMessage.setText("Name: " + name + "\nEmail: " + email + "\nSubject: " + subject + "\nMessage: " + message);

       // Send the message
       Transport.send(mailMessage);

       // Redirect back to the contact.jsp with a success message
       response.sendRedirect("contact.jsp?status=success");
   } catch (Exception ex) {
       ex.printStackTrace();
       // Redirect back to the contact.jsp with an error message
       response.sendRedirect("contact.jsp?status=error");
   }
%>
