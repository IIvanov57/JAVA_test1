package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        Square s = new Square(5);
        System.out.println("Площадь квадрата с стороной " + s.l + "=" + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника с сторонами " + r.a + " и " + r.b + "=" + r.area());

        Point p1 = new Point(2,5);
        Point p2 = new Point(4,8);
        System.out.println("расстояние между двумя точкама = " + p1.distance(p2));

    }
    public static void hello(String somebody) {
        System.out.println("Hello," + somebody+ "!");
    }

}



