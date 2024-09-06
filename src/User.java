public abstract class User {
	protected IMediator chatRoom;
	protected String name;
	
	public void sendMessage(String message) {
		chatRoom.sendMessage(message, this);
	}
	
	public abstract void receiveMEssage(String message);
	public String getName() {
		return this.name;
	}
}
