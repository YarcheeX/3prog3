import java.util.ArrayList;
import java.util.Scanner;

public class Post {
    protected String name = "";
    protected String description = "";
    protected int views = 0;
    protected int likes = 0;

    public Date upload_date = new Date();
    public ArrayList<Comment> comments = new ArrayList<>();

    public Post(){};
    public Post(String name){
        this.name = name;
    }
    public Post(String name, String descr){
        this(name);
        description = descr;
    }
    public Post(String name, String descr, Date date){
        this(name, descr);
        upload_date = date;
    }

    public void printPost(){
        System.out.printf("Заголовок: %s\n", name);
        System.out.printf("Просмотры: %d | Лайки: %d | Комментарии: %d\n", views, likes, comments.size());
        upload_date.printDate();
    };
    
    public void inputPost(){
        System.out.println("Ввод текстового поста.");
        upload_date.inputDate();
        System.out.print("Ввести заголовок поста? (Да - 1, Нет - 2): ");
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

        System.out.print("Ввести описание поста? (Да - 1, Нет - 2): ");
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
    };

    public void setName(String name){
        this.name = name;
    };
    
    public void setDescription(String descr){
        this.description = descr;
    };
    
    public void addComment(Comment comment){
        comments.add(comment);
    };
    
    public void deleteComment(int a){
        comments.remove(a);
    }
    
    public void watch(int views){
        this.views += views;
        printPost();
        System.out.printf("Описание: %s\nКомментарии:\n", description);
        for(int i = 0; i < comments.size(); i++)
        {
            System.out.printf("%d)",i+1);
            comments.get(i).printComment();
        }
        System.out.println();
    }
    
    public void like(int a){
        likes += a;
    }
}



