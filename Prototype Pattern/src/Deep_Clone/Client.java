package Deep_Clone;

public class Client {

	public static void main(String[] args) {
		Email email,copyEmail = null;
		email = new Email();
		try
		{
			copyEmail = (Email)email.deepClone();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("email == copyEmail?");
		System.out.println(email == copyEmail);
		
		System.out.println("email.getAttachment? == copyEmail.getAttachmen?");
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
	}

}
