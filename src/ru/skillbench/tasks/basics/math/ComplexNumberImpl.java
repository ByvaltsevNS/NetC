package ru.skillbench.tasks.basics.math;

public class ComplexNumberImpl implements ComplexNumber {

    private double re;
    private double im;

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }

    @Override
    public boolean isReal() {
        if (im == 0) return true;
        return false;
    }

    @Override
    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void set(String value) throws NumberFormatException {
        double val;
        for (int i = 0; i < value.length(); i++) {

        }
    }

    @Override
    public ComplexNumber copy() {
        return null;
    }

    @Override
    public ComplexNumber clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        return 0;
    }

    @Override
    public void sort(ComplexNumber[] array) {

    }

    @Override
    public ComplexNumber negate() {
        return null;
    }

    @Override
    public ComplexNumber add(ComplexNumber arg2) {
        return null;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber arg2) {
        return null;
    }
}
