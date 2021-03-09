import java.util.Scanner;

interface Animal{
    public void run(int a);
    public void swim(int a);
    public void jump(double a);
}
class Dog implements Animal{
    public void run(int a) {
        if (a<500){
            System.out.println("Dog run: true");
        } else {
            System.out.println("Dog run: false");
        }
    }
    public void swim(int a) {
        if (a<10){
            System.out.println("Dog swim: true");
        }
        else {
            System.out.println("Dog swim: false");
        }
    }
    public void jump(double a) {
        if (a<0.5){
            System.out.println("Dog jump: true");
        } else {
            System.out.println("Dog jump: false");
        }
    }
}
class Cat implements Animal{
    public void run(int a) {
        if (a<200){
            System.out.println("Cat run: true");
        } else System.out.println("Cat run: false");
    }
    public void swim(int a) {
        if (a<=0){
            System.out.println("Cat swim: true");
        } else
            System.out.println("Cat swim: false");
    }
    public void jump(double a) {
        if (a<2){
            System.out.println("Cat jump: true");
        } else System.out.println("Cat jump: false");
    }
}
public class Lab10 {
    //Вариант 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое животное вы хотите использовать?\n Введите Cat или Dog");
        String name = sc.nextLine();
        if (name.equals("Dog")) {
            sc.nextLine();
            System.out.println("Введите длину бега ");
            int distance1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите высоту прышка ");
            double distance2 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Введите длину плавания ");
            int distance3 = sc.nextInt();
            Dog Jerry = new Dog();
            Jerry.run(distance1);
            Jerry.jump(distance2);
            Jerry.swim(distance3);
        }
        if (name.equals("Cat")) {
            System.out.println("Введите длину бега ");
            int distance1 = sc.nextInt();
            System.out.println("Введите высоту прышка ");
            double distance2 = sc.nextDouble();
            System.out.println("Введите длину плавания ");
            int distance3 = sc.nextInt();
            Cat Tom = new Cat();
            Tom.run(distance1);
            Tom.jump(distance2);
            Tom.swim(distance3);
        }
    }
}
