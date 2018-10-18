package com.example.task05;

import java.util.*;
import java.lang.*;

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
        this.points.clear();
        for (int i = 0; i < points.length; i++) {
            this.addPoint(points[i]);
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point point1 = new Point(point.getX(), point.getY());
        this.points.add(point1);
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
        Iterator<Point> iter = points.iterator();
        if (iter.hasNext()) {
            Point P1 = iter.next();
            while (iter.hasNext()) {
                Point P2 = iter.next();
                length += P1.getLength(P2);
                P1 = P2;
            }
        }
        return length;
    }

}
