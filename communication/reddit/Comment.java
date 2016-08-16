
package communication.reddit;

public class Comment {
	private Message message;
	private int id;

	public Comment(Message message) {
		if (message == null) {
			System.out.println("empty message");
			return;
		}
		this.message = message;
		this.id = Post.currentCommentIndex;
	}

	@Override
	public String toString() {
		return "Comment [message=" + message + ", id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public Message getMessage() {
		return message;
	}

}
