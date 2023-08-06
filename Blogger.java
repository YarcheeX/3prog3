import java.util.ArrayList;
import java.util.Scanner;


public class Blogger {
    
    private String name = "Noname";
    private String description = "";
    private int followers = 0;
    private static int bloggers_count;
    
    public ArrayList<Post> posts = new ArrayList<>();

    private static void statIncrem(){
        bloggers_count++;
    }
    private static void statDecrem(){
        bloggers_count--;
    }
    
    public static int getStat(){
        return bloggers_count;
    }

    public Blogger(){
        statIncrem();
    }
    public Blogger(String name){
        this();
        this.name = name;
    }
    public Blogger(String name, String descr){
        this(name);
        description = descr;
    }
    
    public void addPost(Post post){
        posts.add(post);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String descr){
        description = descr;
    }

    public void follow(int a){
        followers += a;
    }

    public void printPosts(){
        System.out.println();
        for(int i = 0; i < posts.size(); i++){
            System.out.printf("%d) ", i+1);
            if(posts.get(i).getClass() == Post.class)
                System.out.print("Текстовый пост.\n");
            if(posts.get(i).getClass() == Video.class)
                System.out.print("Видео.\n");
            if(posts.get(i).getClass() == Photo.class)
                System.out.print("Фото.\n");
            posts.get(i).printPost();    
        }
    }

    public void printVideos(){
        System.out.println();
        int a=1;
        for(int i = 0; i < posts.size(); i++){
            if(posts.get(i).getClass() == Video.class){
                System.out.printf("%d) ", a);
                posts.get(i).printPost();
                a++; 
            }
        }
    }

    public void printPhotos(){
        System.out.println();
        int a=1;
        for(int i = 0; i < posts.size(); i++){
            if(posts.get(i).getClass() == Photo.class){
                System.out.printf("%d) ", a);
                posts.get(i).printPost();
                a++; 
            }
        }
    }

    public void printBlogger(){
        System.out.printf("\nНазвание блоггера: %s\n", name);
        System.out.printf("Описание: %s\n", description);
        System.out.printf("Подписчики: %d | Посты: %d\n", followers, posts.size());
    }

    public void inputBlogger(){
        System.out.println("Ввод блоггера.");
        System.out.print("Ввести название блоггера? (Да - 1, Нет - 2): ");
        byte a;
        Scanner s = new Scanner(System.in, "Cp866");
        while(true){
            if(s.hasNextByte()){
                a = s.nextByte();
                if(a == 1 || a == 2){
                    break;
                }
                else System.out.print("Ошибка. Введите один из предложенных вариантов: ");          
            }else{
                System.out.print("Ошибка. Введите один из предложенных вариантов: ");
                s.next();
            }
        }
        s.nextLine();
        if(a == 1){
            System.out.print("Ввод: ");
            name = s.nextLine();
        }

        System.out.print("Ввести описание блоггера? (Да - 1, Нет - 2): ");
        while(true){
            if(s.hasNextByte()){
                a = s.nextByte();
                if(a == 1 || a == 2){
                    break;
                }
                else System.out.print("Ошибка. Введите один из предложенных вариантов: ");          
            }else{
                System.out.print("Ошибка. Введите один из предложенных вариантов: ");
                s.next();
            }
        }
        s.nextLine();
        if(a == 1){
            System.out.print("Ввод: ");
            description = s.nextLine();
        }
    }
   
}
