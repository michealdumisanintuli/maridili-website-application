package database;

public class Controller {

	public static AccountDispatcher createAccountDispatcher() {
		   return (new AccountDispatcher());
	}
	
	public static GroupDispatcher createGroupDispatcher() {
		   return (new GroupDispatcher());
	}
	
	public static MessageDispatcher createMessageDispatcher() {
		   return (new MessageDispatcher());
	}
	
	public static NewsDispatcher createNewsDispatcher() {
		   return (new NewsDispatcher());
	}
	
	public static SubjectDispatcher createSubjectDispatcher() {
		   return (new SubjectDispatcher());
	}
	
	public static TestDispatcher createTestDispatcher() {
		   return (new TestDispatcher());
	}
	
	public static DocumentDispatcher createDocumentDispatcher() {
		   return (new DocumentDispatcher());
	}
	
}
