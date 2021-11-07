package org.lab.basic;

public class Coordinate3D<T extends Number> extends Coordinate2D {
    private T z;
    public Coordinate3D(T x, T y, T z) {
        super(x, y);
        this.z = z;
    }
    public T getZ() {
        return z;
    }
    public void setZ(T z) {
        this.z = z;
    }
}
