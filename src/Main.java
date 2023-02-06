import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов , нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов , можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int machineSpeed = 61;
        if (machineSpeed > 60) {
            System.out.println("Если скорость больше 60 ,то придется заплатить штраф");
        } else {
            System.out.println("Если скорость меньше 60 ,то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 19;
        if (age >= 2 && age<=6) {
            System.out.println("Если возраст человека равен "+ age +" , то ему нужно ходить в детский сад");
        } else if (age>=7 && age<=18) {
            System.out.println("Если возраст человека равен "+ age +" , то ему нужно ходить в школу");
        } else if (age>18 && age<24) {
            System.out.println("Если возраст человека равен "+ age +" , то ему нужно ходить в университет");
        } else if (age>24) {
            System.out.println("Если возраст человека равен "+ age +" , то ему нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 13;
        boolean hasAdult = true;
        if (childAge<5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }else if (childAge>=5 && childAge<14 && hasAdult){
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        }else if (childAge>=5 && childAge<14 && !hasAdult){
            System.out.println("Ребенок не может кататься на аттракционе без сопровождении взрослого");
        }else {
            System.out.println("Ребенок может кататься на аттракционе");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int places = 103;
        int CapacityOfOneWagon = 102;
        int seatPlace = 60;
        int standingRoom = 42;
        if (places >= CapacityOfOneWagon) {
            System.out.println("Мест в вагоне нету");
        } else {
            System.out.println("Места в вагоне есть");
        }
        if (places >= seatPlace && places<CapacityOfOneWagon) {
            System.out.println("Стоячие места есть");
        } else{
            System.out.println("Стоячих мест нету");
        }
        if (places <= standingRoom) {
            System.out.println("Сидячие места есть");
        }else {
            System.out.println("Сидячих мест нету");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 8;
        int two = 5;
        int three = 7;
        boolean largeNumber = true;
        if (one>two && one>three && largeNumber) {
            System.out.println("Самое большое число " + one);
        } else if (one>two && one>three && !largeNumber) {
            System.out.println("Не самое большое число");
        }else if (two>one && two>three && largeNumber) {
            System.out.println("Самое большое число " + two);
        } else if (two>one && two>three && !largeNumber) {
            System.out.println("Не самое большое число");
        }else if (three>one && three>two && largeNumber) {
            System.out.println("Самое большое число " + three);
        }else {
            System.out.println("Не самое большое число");
        }
    }
}