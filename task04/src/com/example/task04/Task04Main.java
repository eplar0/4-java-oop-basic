package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        Line line = new Line(p1, p2);
        Point p = new Point(5, 5);

        System.out.println("Отрезок: " + line.toString());
        if (line.isCollinearLine(p)) {
            System.out.println("Точка лежит на отрезке");
        }
        else {
            System.out.println("Точка не лежит на отрезке");
        }
    }
}
