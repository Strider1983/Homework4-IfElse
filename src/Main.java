public class Main {
    public static void main(String[] args) {
        System.out.println("Условные операторы");
        System.out.println("----------");
        System.out.println("Задача №1");
        int personAge = 13;
        if (personAge >= 18) {
            System.out.println("Если возраст человека равен " + personAge + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + personAge + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("----------");
        System.out.println("Задача №2");
        int temp = 7;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("----------");
        System.out.println("Задача №3");
        int speed = 54;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        System.out.println("----------");
        System.out.println("Задача №4");
        int age = 98;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " то ему пора спать.");
        } else {
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
            } else {
                if (age >= 7 && age <= 18) {System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
                } else {if (age >18 && age <=24) {System.out.println("Если возраст человека равен " + age + " то его место в университете.");} else
                {if (age <=60) {System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");}
                else {System.out.println("Если возраст человека равен " + age + " то он может отдохнуть.");}
                }
                }
            }
        }
    }
}