package ru.skillbench.tasks.basics.math;

import java.util.Arrays;

public class ArrayVectorImpl implements ArrayVector {

    private double[] array;

    @Override
    public void set(double... elements) {
        array = elements;
    }

    @Override
    public double[] get() {
        return array;
    }

    @Override
    public ArrayVector clone() {
        ArrayVectorImpl copy = new ArrayVectorImpl();
        //System.arraycopy(this.get(), 0, copy.get(), 0, this.getSize());
        copy.set(array.clone());
        return copy;
    }

    @Override
    public int getSize() {
        return array.length;
    }

    @Override
    public void set(int index, double value) {
        if (index < 0) return;
        if (index >= array.length) {
            double[] new_arr = new double [index + 1];
            System.arraycopy(array, 0, new_arr, 0, array.length);
            new_arr[index] = value;
            this.set(new_arr);
        } else {
            array[index] = value;
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        return array[index];
    }

    @Override
    public double getMax() {
        double max = Double.MIN_VALUE;
        for (double var:array)
            max = Math.max(max, var);
        return max;
    }

    @Override
    public double getMin() {
        double min = Double.MAX_VALUE;
        for (double var:array)
            min = Math.min(min, var);
        return min;
    }

    @Override
    public void sortAscending() {
        Arrays.sort(array);
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i < array.length; i++) array[i] *= factor;
    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        int length = Math.min(array.length, anotherVector.getSize());
        for (int i = 0; i < length; i++) array[i] += anotherVector.get(i);
        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double result = 0;
        int length = Math.min(array.length, anotherVector.getSize());
        for (int i = 0; i < length; i++) {
            result += array[i] * anotherVector.get(i);
        }
        return result;
    }

    @Override
    public double getNorm() {
        double result = 0;
        for (double v : array) {
            result += v * v;
        }
        return Math.sqrt(result);
    }
}
