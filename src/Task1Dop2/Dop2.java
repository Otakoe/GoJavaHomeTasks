package Task1Dop2;

import java.util.Scanner;

public class Dop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Введите два целых числа через энтер");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Сумма "+(a+b));
        System.out.println("Умножение "+(a*b));
        System.out.println("Деление "+(0.0+(a/b))+" или " + (0.0+(b/a)));
        System.out.println("Вычитание "+(a-b)+" или " + (b-a));
        System.out.println("Деление по модулю "+(a%b)+" или " + (b%a));
        System.out.println("a==b " + (a==b));
        System.out.println("a>b " + (a>b));
        System.out.println("a<b " + (a<b));
    }
}
