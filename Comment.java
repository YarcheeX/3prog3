import java.util.ArrayList;
import java.util.Scanner;

public class Comment {
    private String text;
    private String author;

    public Date upload_date = new Date();
    public ArrayList<Comment> answers = new ArrayList<>();
    
    {
        author = "Аноним";
        text = "Нет текста";
    }
    
    public Comment(){};
    
    public Comment(Date date){
        upload_date = date;
    }

    public Comment(Date date, String text){
        this(date);
        this.text = text;
    }

    public Comment(Date date, String text, String author)
    {
        this(date, text);
        this.author = author;
    }

    public void addAnswer(Comment answer){
        answers.add(answer);
    }

    public void deleteAnswer(int index){
        answers.remove(index);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printComment(){
        System.out.printf("Автор: | %s", author);
        upload_date.printDate();
        System.out.printf("Текст: %s\nОтветы: %d", text, answers.size());
    }

    public void inputComment(){
        System.out.println("Ввод комментария.\n");
        upload_date.inputDate();
        System.out.println("Ввести автора? (Да - 1, нет - 2):");
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
            author = s.nextLine();
        }

        System.out.println("Ввести текст? (Да - 1, нет - 2):");
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
            text = s.nextLine();
        }
    }

}
