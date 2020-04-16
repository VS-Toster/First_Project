package ru.stqa.pft.sandbox;

import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[]args) {

        Car car = new Car(2.500, 330,"blue", "volvo");
        /*
        Scanner in = new Scanner (System.in);
        System.out.println("Какую марку вы предпочитаете? " );
        String mark = in.nextLine();
        System.out.println("Какой вы предпочитаете цвет? " );
        String color = in.nextLine();

         */

        System.out.println("Автомобиль каторый вы выбрали имеет следующие параметры:" + "Вес - " + " "+ car.weight + " Максимальную скорость - "+ car.maxSpeed + " "+ "color" +" "+ "mark");
        System.out.println("Спасибо, что выбрали наш автосалон? " );


    }



}