public class Main {
    public static void main(String[] args) {
        System.out.println("Условные операторы");
        System.out.println("----------");
        System.out.println("Задача №1");
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("----------");
        System.out.println("Задача №2");
        int temp = 7;
        if (temp <5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");} else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("----------");
        System.out.println("Задача №3");
        int speed = 54;
        if (speed >60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");} else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
    }
}