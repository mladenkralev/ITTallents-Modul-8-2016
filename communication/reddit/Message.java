package communication.reddit;

import user.reddit.*;

public class Message {

	private int rating;
	private User userWhoMadeMessage;
	private String textMessage;

	public Message(String textMessage, User user) {
		if ((textMessage == null) || (textMessage.equals(""))) {
			System.out.println("Text is empty");
			return;
		}

		if (user == null) {
			System.out.println("Enter valid user!");
			return;
		}

		this.rating = 0;
		this.textMessage = textMessage;
		this.userWhoMadeMessage = user;
	}

	@Override
	public String toString() {
		return "Message [textMessage=" + textMessage + ", rating= " + rating + ", userWhoMadeMessage="
				+ userWhoMadeMessage + "]";
	}

	public int getRating() {
		return rating;
	}

	public void upRating() {
		this.rating++;
	}

	public void downRating() {
		this.rating--;
	}

}
