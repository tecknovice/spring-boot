package zalo.chatbot.entity;

public class Message {
	String text;
	String msg_id;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getMsg_id() {
		return msg_id;
	}
	public void setMsg_id(String msg_id) {
		this.msg_id = msg_id;
	}
	@Override
	public String toString() {
		return "Message [text=" + text + ", msg_id=" + msg_id + "]";
	}
	
}
