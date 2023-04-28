package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayElementsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        ArrayElementsService service = new ArrayElementsService();
        int[] arr = {15, 11, 18, 12, 14};
        int expected = 3;
        int actual = service.getElementDivisibleThree(arr);
        Assertions.assertEquals(expected, actual);

    }
}