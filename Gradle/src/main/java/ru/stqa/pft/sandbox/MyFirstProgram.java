package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[]args) {

        Rentagle r = new Rentagle();
        r.a = 10;
        r.b = 55;
        System.out.println("Cумму вот этой хуйни ты хоте получить, братан ?" + " "+ r.a +"и" +r.b + "=" + area(r) );

    }

    public static int area (Rentagle r){

        return r.a +r.b;
    }


        /*


        Square s = new Square();
        s.l=5;
        System.out.println("Площадь прямоугольника со стороной" + s.l + "=" + area(s) +"!");

    }

       public static double area (Square s){

        return s.l*s.l;

    }


*/



}