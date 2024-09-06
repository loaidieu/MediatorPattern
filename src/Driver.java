public class Driver {
	public static void main(String[] args) {
		IMediator chatManager = new ChatRoom();
		User alex = new ChatUser("alex", chatManager);
		User ben = new ChatUser("ben", chatManager);
		User shen = new ChatUser("shen", chatManager);
		User olivia = new ChatUser("olivia", chatManager);
		
		chatManager.addUser(alex);
		chatManager.addUser(ben);
		chatManager.addUser(olivia);
		chatManager.addUser(shen);
		
		shen.sendMessage("hi everyone");
		shen.sendMessage("My name is Shen and we can start by creating the discord group for this course's project");
	}
	
	
}
