package com.thoughtworks.rectangle;

import com.thoughtworks.rectangle.exceptions.ZeroDimensionException;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) throws ZeroDimensionException {
        if (length == 0 || breadth == 0) throw new ZeroDimensionException();
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}
