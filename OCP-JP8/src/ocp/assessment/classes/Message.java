package ocp.assessment.classes;


public abstract class Message {										//line 1
	public String recipient;
	/* 
	 * sendMessage(): a method cannot be both ABSTRACT and FINAL
	 * (because final modifier prevents it to be overriden).
	 */
	public abstract final void sendMessage();						//line 3

	public static void main(String[] args) {
		Message m = new TextMessage();
		m.recipient = "1234567890";
		m.sendMessage();											//line 7
	}

	/**
	 * Catch: a static NESTED class may extend other classes.
	 */
	static class TextMessage extends Message {
		public final void sendMessage() {
			System.out.println("Text message to " + recipient);
		} 
	} 
}