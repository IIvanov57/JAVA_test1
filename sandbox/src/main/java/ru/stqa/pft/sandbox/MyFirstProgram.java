package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        Square s = new Square(5);
        System.out.println("Площадь квадрата с стороной " + s.l + "=" + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника с сторонами " + r.a + " и " + r.b + "=" + r.area());

        Point d = new Point(4,8,2,4);
        System.out.println("Расстояние между двумя точками = " + d.distance());
    }
    public static void hello(String somebody) {
        System.out.println("Hello," + somebody+ "!");
    }

}


