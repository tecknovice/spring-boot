package zalo.chatbot.entity;

public class UserRequest {

	String app_id;
    Sender sender;
    String user_id_by_app;
    Recipient recipient;
    String event_name;
    Message message;
    String timestamp;
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public String getUser_id_by_app() {
		return user_id_by_app;
	}
	public void setUser_id_by_app(String user_id_by_app) {
		this.user_id_by_app = user_id_by_app;
	}
	public Recipient getRecipient() {
		return recipient;
	}
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "UserRequest [app_id=" + app_id + ", sender=" + sender + ", user_id_by_app=" + user_id_by_app
				+ ", recipient=" + recipient + ", event_name=" + event_name + ", message=" + message + ", timestamp="
				+ timestamp + "]";
	}
    
}
