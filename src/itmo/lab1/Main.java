package itmo.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //1.1
        System.out.println("я\nхорошо\nзнаю\nJava");
        //1.2
        int i = 10;
        double res = (46+i)*((double)i/3);
        int res1 = 29*4*(-15);
        System.out.println(res);
        System.out.println(res1);
        //1.3
        int number = 10500;
        double result = (number/10)/10;
        System.out.println(result);
        //1.4
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result1 = a*b*c;
        System.out.println(result1);
        //1.5
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num +"\n"+num1 +"\n"+num2 +"\n");
        //1.6
        Scanner scan = new Scanner(System.in);
        int bb = scan.nextInt();
        if(bb%2!=0){
            System.out.println("Нечетное число");
        } else if (bb%2==0 && bb<=100) {
            System.out.println("Четное число");
        } else if (bb%2==0 && bb>100) {
            System.out.println("Выход за пределы диапазона");
        }

    }
}
