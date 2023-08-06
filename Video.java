import java.util.Scanner;

public class Video extends Post {
    
    public Time duration;
    
    public Video(){};
    public Video(String name){
        super(name);
    }
    public Video(String name, String descr){
        super(name, descr);
    }
    public Video(String name, String descr, Date date){
        super(name, descr, date);
    }
    public Video(String name, String descr, Date date, Time dur){
        super(name, descr, date);
        duration = dur;
    }

    public void printPost(){
        System.out.printf("Название: %s\n", name);
        System.out.printf("Длительность: %d:%d\n", duration.getMin(), duration.getSec());
        System.out.printf("Просмотры: %d | Лайки: %d | Комментарии: %d\n", views, likes, comments.size());
        upload_date.printDate();
    }

    public void inputPost(){
        System.out.println("Ввод видео.");
        upload_date.inputDate();
        System.out.print("Ввести название видео? (Да - 1, Нет - 2): ");
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

        System.out.print("Ввести описание видео? (Да - 1, Нет - 2): ");
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

        System.out.print("Ввести длительность видео? (Да - 1, Нет - 2): ");
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
            Number min, sec;
            System.out.printf("Введите минуты: ");
            while(true){
                if(s.hasNextByte()){
                    min = s.nextByte();
                    break;
                }else{
                    System.out.print("Ошибка. Введите минуты: ");
                    s.next();
                }
            }
            s.nextLine();

            System.out.printf("Введите секунды: ");
            while(true){
                if(s.hasNextByte()){
                    sec = s.nextByte();
                    break;
                }else{
                    System.out.print("Ошибка. Введите секунды: ");
                    s.next();
                }
            }
            s.nextLine();
            setDuration(min, sec);
        }
    }

    public void setDuration(Number min, Number sec){
        duration.setTime(min, sec);
    };
}
