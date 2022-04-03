package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest {
    @Test
    void shouldFindAreaWhenLengthAndBreadthAreGiven() {
        double length = 1;
        double breadth = 1;
        Rectangle rectangle = new Rectangle(length, breadth);

        double area = rectangle.area();

        assertThat(area, is(closeTo(1, 0.0001)));
    }
}
