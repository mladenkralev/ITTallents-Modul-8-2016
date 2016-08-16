package reddit.reddit;

public class Reddit {

	protected static final int DEFAULT_CAPACITY = 10;

	private int counterOfCurrentReddits;
	private Subreddit[] subreddits;
	protected String url;

	Reddit(String url) {
		if ((url == null) || (url.equals(""))) {
			System.out.println("Enter non-empty url");
			this.url = "no such url";
			return;
		} else {
			this.url = ("/r/" + url);
		}
	}

	public Reddit(int capacityOfSubReddits, String name) {
		if (capacityOfSubReddits <= 0) {
			System.out.println("Capacity must be positive");
			subreddits = new Subreddit[DEFAULT_CAPACITY];
			counterOfCurrentReddits = 0;
			return;
		} else {
			subreddits = new Subreddit[capacityOfSubReddits];
			counterOfCurrentReddits = 0;
		}
	}

	public void showSubReddits() {
		for (int index = 0; index < subreddits.length; index++) {
			if (subreddits[index] != null) {
				System.out.println(subreddits[index]);
			}
		}
	}

	public boolean addSubReddit(int capacityOfPosts, String name, String url) {
		if (counterOfCurrentReddits >= subreddits.length) {
			return false;
		} else if (subreddits[counterOfCurrentReddits] == null) {
			subreddits[counterOfCurrentReddits++] = new Subreddit(capacityOfPosts, name, url);
			return true;
		} else {
			System.out.println("Error adding Subreddit");
			return false;
		}

	}

	public void showAllBestPosts() {
		for (int index = 0; index < subreddits.length; index++) {
			if (subreddits[index] != null) {
				subreddits[index].showBestPostInSubReddit();
			}
		}
	}

	public Subreddit getSubReddit(String name) {
		if ((name == null) || (name.equals(""))) {
			System.out.println("Enter non-empty name");
			return null;
		}

		for (int index = 0; index < subreddits.length; index++) {
			if (name.equals(subreddits[index].getName())) {
				return subreddits[index];
			}
		}

		System.out.println("Not found!");
		return null;
	}
}
