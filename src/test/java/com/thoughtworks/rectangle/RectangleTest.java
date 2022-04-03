package com.thoughtworks.rectangle;

import com.thoughtworks.rectangle.exceptions.ZeroDimensionException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void shouldFindAreaWhenLengthAndBreadthAreGiven() throws ZeroDimensionException {
        double length = 1;
        double breadth = 1;
        Rectangle rectangle = new Rectangle(length, breadth);

        double area = rectangle.area();

        assertThat(area, is(closeTo(1, 0.0001)));
    }

    @Test
    void shouldFindPerimeterWhenLengthAndBreadthAreGiven() throws ZeroDimensionException {
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
}
