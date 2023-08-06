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
		bloggers.get(1).setDescription("Good content");

		Photo picture = new Photo();

		picture.setName("Kak delat salto?");
		picture.setDescription("eto mozhet bit opasno");
		picture.upload_date.setDate(20,10, 2014);

		bloggers.get(0).addPost(picture);

		Comment hate_comm = new Comment(new Date(11, 1, 2010), "slomal sebe sheyu", "User");
		bloggers.get(0).posts.get(0).addComment(hate_comm);

		Video movie = new Video("top 5 life hackov", "all life hacks were stolen", new Date(11, 1, 2010), new Time(10, 30));

		bloggers.get(1).addPost(movie);

		
		bloggers.get(0).printBlogger();
		bloggers.get(0).printPosts();

		System.out.println();
		bloggers.get(0).posts.get(0).watch(1);

		bloggers.get(1).printBlogger();
		bloggers.get(1).printPosts();
	}
}

