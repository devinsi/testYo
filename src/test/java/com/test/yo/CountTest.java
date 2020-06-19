package com.test.yo;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CountTest {
    @Test
    void writeList(){
        // Arrange
        int a = 1;
        int b = 10;
        Count count = new Count();

        // Act
        String str = count.countOrWrite(a, b);

        // Assert
        assertEquals("1 2 freez 4 buzz freez 7 8 freez buzz ", str);
    }



}
