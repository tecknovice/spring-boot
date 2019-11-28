package zalo.chatbot.entity;

public class Recipient {
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Recipient [id=" + id + "]";
	}
	
}
