package com.test.yo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest{

    @Test
    void testAddTwoPositiveNumbers(){
        //Arrange
        int a = 2;
        int b = 3;
        Calculator calc = new Calculator();

        //Act
        int somme = calc.add(a, b);

        //Assert
        assertEquals(5, somme);

    }


}