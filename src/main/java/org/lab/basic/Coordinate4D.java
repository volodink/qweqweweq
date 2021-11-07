package org.lab.basic;

public class Coordinate4D<T extends Number> extends Coordinate3D{
    private T t;

    public Coordinate4D(T x, T y, T z, T t) {
        super(x, y, z);
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
