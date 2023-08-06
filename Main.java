import java.util.ArrayList;


public class Main{
	
	public static void main(String args[]){
		
		ArrayList<Blogger> bloggers = new ArrayList<>();
		
		Blogger Alex = new Blogger();
		bloggers.add(Alex);
		bloggers.get(0).inputBlogger();
		
		Blogger Ivan = new Blogger();
		bloggers.add(Ivan);
		bloggers.get(1).setName("QWERTY");
		bloggers.get(1).setDescription("Хороший контент");

		Photo picture = new Photo();

		picture.setName("Как делать сальто?");
		picture.setDescription("Это может быть опасно");
		picture.upload_date.setDate(20,1, 2018);

		bloggers.get(0).addPost(picture);

		Comment hate_comm = new Comment(new Date(11, 2, 2018), "Сломал себе шею", "User");
		bloggers.get(0).posts.get(0).addComment(hate_comm);

		Video movie = new Video("Топ 5 лайф-хаков", "Все придумано самостоятельно", new Date(11, 2, 2018), new Time(10, 30));

		bloggers.get(1).addPost(movie);

		bloggers.get(0).printBlogger();
		bloggers.get(0).printPosts();

		System.out.println();
		bloggers.get(0).posts.get(0).watch(1);

		bloggers.get(1).printBlogger();
		bloggers.get(1).printPosts();
	}
}

