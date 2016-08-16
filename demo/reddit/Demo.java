package demo.reddit;

import java.util.Scanner;

import communication.reddit.Comment;
import communication.reddit.Message;
import reddit.reddit.Reddit;
import user.reddit.User;

/*
 *	15/7/2016
 *  Ne e zabvursheno, ostavqm ti go ako iskash da go pregledash,
 *  shte se opitam da go doupravq i da go predstavq po natatuk, zashtoto immam
 *  oshte mnogo neshta da sloja, priemam kritiki s otvoreni obiqtiq obache
 *  
 *  P.S shte implementiram i Comentara da ima comentari i rekursivnoto tursene v tqh
 * 
 */
class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choise;

		Reddit reddit = new Reddit(10, "reddit.com");
		reddit.showSubReddits();
		reddit.addSubReddit(10, "video", "video");
		reddit.addSubReddit(10, "sexDoZori", "sexDoZori");
		reddit.addSubReddit(10, "movies", "movies");
		reddit.showSubReddits();
		
		reddit.getSubReddit("sexDoZori").addPost("Seksa e mnogo gotin kogato e za pari", new User("tosho"));
		reddit.getSubReddit("sexDoZori").showAllPosts();
	

	}

}
