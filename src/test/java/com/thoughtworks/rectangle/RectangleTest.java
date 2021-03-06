package com.thoughtworks.rectangle;

import com.thoughtworks.rectangle.exceptions.NegativeDimensionException;
import com.thoughtworks.rectangle.exceptions.ZeroDimensionException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void shouldFindAreaWhenLengthAndBreadthAreGiven() throws ZeroDimensionException, NegativeDimensionException {
        double length = 1;
        double breadth = 1;
        Rectangle rectangle = new Rectangle(length, breadth);

        double area = rectangle.area();

        assertThat(area, is(closeTo(1, 0.0001)));
    }

    @Test
    void shouldFindPerimeterWhenLengthAndBreadthAreGiven() throws ZeroDimensionException, NegativeDimensionException {
        double length = 2;
        double breadth = 2;
        Rectangle rectangle = new Rectangle(length, breadth);

        double perimeter = rectangle.perimeter();

        assertThat(perimeter, is(closeTo(8, 0.0001)));
    }

    @Test
    void shouldNotCreateRectangleWhenZeroLengthOrBreadthIsGiven() {
        double length = 1;
        double breadth = 0;

        assertThrows(ZeroDimensionException.class, () -> new Rectangle(length, breadth));
    }

    @Test
    void shouldNotCreateRectangleWhenNegativeLengthOrBreadthIsGiven() {
        double length = 1;
        double breadth = -1;

        assertThrows(NegativeDimensionException.class, () -> new Rectangle(length, breadth));
    }

    @Test
    void shouldFindAreaOfSquareWhenSideIsGiven() throws NegativeDimensionException, ZeroDimensionException {
        double side = 2;

        Rectangle square = Rectangle.createSquare(side);
        double area = square.area();

        assertThat(area, is(closeTo(4, 0.0001)));
    }

    @Test
    void shouldFindPerimeterOfSquareWhenSideIsGiven() throws NegativeDimensionException, ZeroDimensionException {
        double side = 2;
        Rectangle square = Rectangle.createSquare(side);

        double perimeter = square.perimeter();

        assertThat(perimeter, is(closeTo(8, 0.0001)));
    }
}
