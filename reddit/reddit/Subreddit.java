package reddit.reddit;

import communication.reddit.Post;
import user.reddit.User;

public class Subreddit extends Reddit {

	private int currentPostIndex;
	private String name;
	private Post[] postsOnHomePage;

	private Subreddit(String url) {
		super(url);
	}

	Subreddit(int cappacityOfPosts, String name, String url) {
		this(url);

		if (cappacityOfPosts <= 0) {
			System.out.println("Capacity of posts must be positive");
			postsOnHomePage = new Post[super.DEFAULT_CAPACITY];
			return;
		} else {
			postsOnHomePage = new Post[cappacityOfPosts];
		}

		if ((name == null) || (name.equals(""))) {
			System.out.println("Emptry name passed");
			this.name = "anonymous";
			return;
		} else {
			this.name = name;
		}

		this.currentPostIndex = 0;
	}

	public void addPost(String name, User userOfPost) {
		if ((name == null) || (name.equals(""))) {
			System.out.println("Emptry name passed");
			return;
		}

		if (userOfPost == null) {
			System.out.println("Empty user");
		}

		if (postsOnHomePage[currentPostIndex] == null) {
			postsOnHomePage[currentPostIndex++] = new Post(name, userOfPost);
		} else {
			System.out.println("Error occour in adding post");
			return;
		}
	}

	public void showAllPosts() {
		for (int index = 0; index < postsOnHomePage.length; index++) {
			if (postsOnHomePage[index] != null) {
				System.out.println(postsOnHomePage[index]);
			}
		}
	}

	public Post getPost(int id) {
		for (int index = 0; index < postsOnHomePage.length; index++) {
			if ((postsOnHomePage[index] != null) && (postsOnHomePage[index].getId() == id)) {
				return postsOnHomePage[index];
			}
		}
		return null;
	}

	void showBestPostInSubReddit() {
		int maxRatingIndex = 0;
		for (int index = 0; index < postsOnHomePage.length; index++) {
			if (postsOnHomePage[index] != null) {
				if (postsOnHomePage[index].getMessage().getRating() > maxRatingIndex) {
					maxRatingIndex = index;
				}
			}
		}

		if (postsOnHomePage[maxRatingIndex] != null) {
			System.out.println(this + " " + postsOnHomePage[maxRatingIndex]);
		} else {
			System.out.println(this + " has no posts");
		}
	}

	@Override
	public String toString() {
		return "[Url:" + super.url + ", Name:" + name + "]";// To change body of
															// generated
															// methods, choose
															// Tools |
															// Templates.
	}

	public String getName() {
		return name;
	}
}
