package com.example.task05;

import java.util.*;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    ArrayList<Point> points = new ArrayList<Point>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            Point point = new Point(points[i].getX(), points[i].getY());
            this.points.add(point);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point P = new Point(point.getX(), point.getY());
        this.points.add(P);
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        this.points.add(point);
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.toArray().length; ++i) {
            length += (points.get(i)).getLength(points.get(i - 1));
        }
        return length;
    }

}
