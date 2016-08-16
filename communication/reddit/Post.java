package communication.reddit;

import communication.reddit.*;
import user.reddit.*;

public class Post {
	public static int currentCommentIndex = 0;

	private final int COMMENTS_CAPACITY = 100;
	private Comment[] coments;
	private int id;
	private Message message;

	public Post(String textMessage, User userOfPost) {
		message = new Message(textMessage, userOfPost);
		coments = new Comment[COMMENTS_CAPACITY];
	}

	public Message getMessage() {
		return message;
	}

	public void showComments() {
		System.out.println("Post with id: " + id);
		for (int index = 0; index < coments.length; index++) {
			if (coments[index] != null) {
				System.out.println(coments[index]);
			}
		}
	}

	public void addComment(Comment comment) {
		for (int index = 0; index < coments.length; index++) {
			if (coments[index] == null) {
				coments[index] = comment;
				currentCommentIndex++;
				break;
			}
		}
	}

	public Message getCommnetMessage(int id) {
		for (int index = 0; index < coments.length; index++) {
			if (coments[index] != null) {
				if (coments[index].getId() == id) {
					return coments[index].getMessage();
				}
			}
		}
		System.out.println("No comment is found");
		return coments[0].getMessage();
	}

	@Override
	public String toString() {
		return "Post " + this.id + ": " + message + "";
	}

	public int getId() {
		return id;
	}
}
