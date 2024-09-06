
public class ChatUser extends User{
	public ChatUser(String name, IMediator mediator) {
		this.name = name;
		this.chatRoom = mediator;
	}
	@Override
	public void receiveMEssage(String message) {
		System.out.println("(" + this.getName() + "'s chatbox) "+ message);
	}

}
