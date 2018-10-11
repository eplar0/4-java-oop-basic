package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(1, 2, 3);
        System.out.println(t1);
        t1.setHours(4);
        System.out.println(t1.getHours());

        t1.setMinutes(5);
        System.out.println(t1.getMinutes());

        t1.setSeconds(6);
        System.out.println(t1.getSeconds());

        TimeSpan t2 = new TimeSpan();
        t1.add(t2);
        System.out.println(t1);

        t2.setHours(4);
        t2.setMinutes(59);
        t2.setSeconds(59);
        System.out.println(t2);

        t1.add(t2);
        System.out.println("Add: " + t1);

        t1.subtract(t2);
        System.out.println("Sub: " + t1);
    }
}
