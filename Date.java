import java.util.Scanner;

public class Date{
    private byte day, month; 
    private int year;
    final byte  UNDEF = -77;
    public Date(){}
    
    {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    

    public Date(Number day, Number month, Number year){

        setDate(day, month, year);
    }


    public void setDate(Number day, Number month, Number year){

        byte a = day.byteValue();
        this.day = (a < 32 && a > 0) ? a : UNDEF;
        a = month.byteValue();
        this.month = (a < 13 && a > 0) ? a : UNDEF;
        int b = year.intValue();
        this.year = (b < 2024 && b > 2005) ? b : UNDEF;
    }


    public Date getDate(Date date){

        date.setDate(day, month, year);

        return date;
    }


    public void printDate(){
        System.out.printf("Дата: %d.%d.%d\n", day, month, year);
    }


    public void inputDate(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ввод даты:");
        System.out.print("День: ");
        while(true){
            if(sc.hasNextInt()){
                day = sc.nextByte();
                break;
            }else{
                System.out.print("Ошибка. Введите день числом: ");
                sc.next();
            }
        }
        sc.nextLine();

        System.out.print("Месяц:");
        while(true){
            if(sc.hasNextInt()){
                day = sc.nextByte();
                break;
            }else{
                System.out.print("Ошибка. Введите месяц числом: ");
                sc.next();
            }
        }
        sc.nextLine();

        System.out.print("Год:");
        while(true){
            if(sc.hasNextInt()){
                day = sc.nextByte();
                break;
            }else{
                System.out.print("Ошибка. Введите год числом: ");
                sc.next();
            }
        }
    }
}
