import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int bonus;
        System.out.print("Сколько у вас сейчас денег на счету? ");
        int a = in.nextInt();
        System.out.print("У вас на счету: " + a + " рублей \n") ;

        System.out.print("Введите сумму, на которую хотите пополнить счёт: ");
        int num = in.nextInt();

        System.out.printf("Вы пополнили счет на: %d \n", num);
        if (num <= 1000) {
            bonus = a + num;
            System.out.print("Бонусов нет. У вас на счету: " + bonus + " рублей \n") ;
        }
        else {
            int b = num/100;
            bonus = a + num + b;
            System.out.print("Бонус равен: " + b + " рублям. У вас на счету: " + bonus + " рублей \n") ;
        }
        in.close();
    }
}
