**This is a java application that has the following features**
	
	- 2 modes of user operation (admin & hospital admin)

	- Validation of the aadhaar number using the Verhoff's algorithm

	- Instant notification sending facility for registered e-mail and mobile number

	- Validation of the entered e-mail address

	- Backend connectivity for storing the user data

	- AES encrypted password security

**How to run this application**

	- Copy the secure folder into the IDE's project folder and open the project in your IDE (Netbeans,Eclipse etc.,)

	- Add the jar files in the jar files folder to your project. To add jar file refer : **https://www.quora.com/How-can-I-add-jar-files-to-libraries-in-Netbeans-IDE8-0**

	- Create a database "technosoft"

	- In the database create 3 tables namely,
	
		a) userInfo - (aadhaar(varchar),mobile(varchar),bg(varchar),email(varchar),location(varchar))
		
		b) Userlogin - (username (varchar),password(varchar))

		c) register - (honame (varchar),loc1 (varchar),mailid(varchar),passw(varchar))

	- Update the  e-mail id and password from which the message has to be sent in "Emergency.java" and "EmailSender.java"

	- Create an account in "MSG91" or other SMS providers and update the following in "sendSMS.java"

	- Start the application by running the "Welcome.java"

Wishing all a great start ahead !!!!!!!!

Note : Feel free to provide your feedback &  ping me for any further assistance @ adithiyagurupatham@gmail.com
