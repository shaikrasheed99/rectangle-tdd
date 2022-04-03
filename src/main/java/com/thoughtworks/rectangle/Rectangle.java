package com.thoughtworks.rectangle;

import com.thoughtworks.rectangle.exceptions.NegativeDimensionException;
import com.thoughtworks.rectangle.exceptions.ZeroDimensionException;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) throws ZeroDimensionException, NegativeDimensionException {
        if (length == 0 || breadth == 0) throw new ZeroDimensionException();
        if (length <= -1 || breadth <= -1) throw new NegativeDimensionException();
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
