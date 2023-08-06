import java.util.Scanner;

public class Photo extends Post {

    public Photo(){
        super();
    }
    public Photo(String name){
        super(name);
    }
    public Photo(String name, String descr){
        super(name, descr);
    }
    public Photo(String name, String descr, Date date){
        super(name, descr, date);
    }

    public void printPost(){
        System.out.printf("Название: %s\n", name);
        System.out.printf("Просмотры: %d | Лайки: %d | Комментарии: %d\n", views, likes, comments.size());
        upload_date.printDate();
    };

    public void inputPost(){
        System.out.println("Ввод фото.");
        upload_date.inputDate();
        System.out.print("Ввести название фото? (Да - 1, Нет - 2): ");
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

        System.out.print("Ввести описание фото? (Да - 1, Нет - 2): ");
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

}
