import java.util.List;
import java.util.ArrayList;

public class ChatRoom implements IMediator{
	private List<User> users;
	
	public ChatRoom()
	{
		users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, User sender) {
		for(User u : users)
		{
			if(u != sender)
			{
				u.receiveMEssage(sender.getName() + " send: " + message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}
	
}
