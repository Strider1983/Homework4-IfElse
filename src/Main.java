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
        int age = 24;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " то ему пора спать.");
        } else {
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
            } else {
                if (age >= 7 && age <= 18) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
                } else {
                    if (age > 18 && age <= 24) {
                        System.out.println("Если возраст человека равен " + age + " то его место в университете.");
                    } else {
                        if (age <= 60) {
                            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
                        } else {
                            System.out.println("Если возраст человека равен " + age + " то он может отдохнуть.");
                        }
                    }
                }
            }
        }
        System.out.println("----------");
        System.out.println("Задача №5");
        int kidAge = 13;
        if (kidAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge + " то ему нельзя кататься на аттракционе");
        } else {
            if (kidAge >= 5 && kidAge < 14) {
                System.out.println("Если возраст ребенка равен " + kidAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + kidAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
            }
        }
        System.out.println("----------");
        System.out.println("Задача №6. Вариант первый");
        int peopleInVagon = 100;
        if (peopleInVagon <60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else {if (peopleInVagon >=60 && peopleInVagon <102) {System.out.println("В вагоне есть только стоячие места");} else {System.out.println("Вагон заполнен");}}
        System.out.println("----------");
        System.out.println("Задача №6. Вариант второй");
        int people = 34;
        if (people < 60) {
            System.out.println("В вагоне есть " + (60 - people) + " сидячих и " + (102 - 60) + " стоячих свободных мест(а)");
        } else {
            if (people >= 60 && people < 102) {
                System.out.println("В вагоне есть " + (102 - people) + " стоячих свободных мест(а)");
            } else {
                System.out.println("Вагон заполнен");
            }
        }
    }
}