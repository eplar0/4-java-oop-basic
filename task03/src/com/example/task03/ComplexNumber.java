package com.example.task03;

public class ComplexNumber {
    private double Re;
    private double Im;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imagine) {
        Re = real;
        Im = imagine;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(Re + number.Re, Im + number.Im);
    }

    public ComplexNumber mult(ComplexNumber number) {
        double newRe = Re * number.Re - Im * number.Im;
        double newIm = Re * number.Im + number.Re * Im;
        return new ComplexNumber(newRe, newIm);
    }

    public String toString() {
        return Re + (Im < 0 ? "-" : "+") + Im + "i";
    }
}
