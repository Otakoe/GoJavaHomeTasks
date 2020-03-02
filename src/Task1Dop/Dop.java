package Task1Dop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dop {
    public static void main(String[] args) {
       //обьявление переменных
        String name,surname,sex,locBirth,locCurrent;
        int age;
        //создание сканера
        Scanner sc = new Scanner(System.in);
        //запрос ввода данных, проверка на непустой ввод
        System.out.println("Имя?");
        while((name = sc.nextLine()).isEmpty()){
            System.out.println("Имя не может быть пустым.");
        }
        System.out.println("Фамилия?");
        while((surname = sc.nextLine()).isEmpty()){
            System.out.println("Фамилия не может быть пустой.");
        }
        System.out.println("Пол?");
        while(true){
            sex=sc.nextLine();
            if(sex.equals("мужской")||sex.equals("женский"))
                break;
            else
                System.out.println("должен быть указан только \"мужской\" или \"женский\" пол.");
        }
        System.out.println("Возраст? Цифрами пожалуйста.");
        while(true) {
            //исключение зацикливается не могу пока понять почему
            //try{
                age = sc.nextInt();
            if (age > 100||age<3)
                System.out.println("Введите корректный возраст");
            else
                break;/*}
            catch (InputMismatchException e){
                age=0;
                System.out.println("Нужно ввести возраст цифрами");
            }*/
        }
        System.out.println("Город рождения?");
        while((locBirth = sc.nextLine()).isEmpty()){
            System.out.println("Нужно указать населённый пункт рождения.");
        }
        System.out.println("Город текущего проживания?");
        while((locCurrent = sc.nextLine()).isEmpty()){
            System.out.println("Нужно указать город текущего проживания.");
        }
        razd(20,'-');System.out.print(" PASSPORT ");razd(20,'-');enter();
        razd(50,'-');enter();
        ;enter();enter();
        razd(5,'-');System.out.println("Person: "+name+" "+surname);
        razd(5,'-');enter();
        razd(5,'-');System.out.println("Gender: "+sex+", age: "+age);
        razd(5,'-');enter();
        razd(5,'-');System.out.println("Location: from - "+locBirth+", current - "+locCurrent);
        razd(5,'-');enter();
        razd(50,'-');enter();
        razd(50,'-');enter();
    }
    //функция для напечатания символов разделителей
public static void razd(int a,char c){
    for (int i=0;i<a;i++)
        System.out.print(c);
}
public static void enter(){
    System.out.println();
}

}
