import java.util.Objects;
import java.util.Scanner;

public class Main {
    static int pin = 1111;
    static String log = "name";
    static int dol = 1000;


    public static void main(String[] args) {
       boolean errname, errlog;
       while (true)
       {
           if (pin()){
            cash();}
        }
    }
    public static boolean pin()
    {
        boolean errneme = false, errlog = false;
        while (errneme == false ) {
            System.out.println("Введіть імя?");

            if (log.equals(new Scanner(System.in).nextLine())) {
                System.out.println("Введіть пароль?");
                errneme = true;

                while (errlog == false){
                if (pin == new Scanner(System.in).nextInt()) {
                    errlog = true;

                }
                else {
                    System.out.println("Невірне код");
                    System.out.println("Ви можете вийти натиснувши 1");
                    System.out.println("або продовжити наснувши 2");
                    if (1 == new Scanner(System.in).nextInt()) {
                        break;
                    }else {System.out.println("Введіть пароль?");}
                }}
            } else {
                System.out.println("Невірне імя");
                System.out.println("Ви можете вийти натиснувши 1");
                System.out.println("або продовжити наснувши 2");
                if (1 == new Scanner(System.in).nextInt()) {
                     break;
                }
            }

        }
return errlog;
    }
    public static void cash(){
        int sum=dol;
        int exit=0;
        while (exit!=4){
           System.out.println("Ваші дії \n 1 - стан рахунку \n 2 - зняття коштів \n 3 - поповнення рахунку \n 4 - вихід ");
            switch (new Scanner(System.in).nextInt()){
                case 1:
                    System.out.println("Доступних коштів: "+sum +" $");
                    break;
                case 2:
                    System.out.println("Ведіть суму коштів яку ви бажаєте зняти ");
                    int a= new Scanner(System.in).nextInt();
                    if (a<=sum){
                        sum=sum-a;
                        System.out.println("Отримайте ваші" + a+"$ \n Ваш залишок складає "+sum+"$");
                    }
                    else System.out.println("Недостатьня кількість коштів");
                    break;
                case 3:
                    System.out.println("Ведіть суму коштів  на яку ви бажаєте поповнити рахунок ");
                    sum=sum+new Scanner(System.in).nextInt();
                    System.out.println("Рах поповнено\n баланс складає "+ sum+"$");
                    break;
                case 4:
                    exit=4;
                    break;


                    default:break;


            }
        }
    }
}

