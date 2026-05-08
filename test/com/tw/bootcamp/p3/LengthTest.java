package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LengthTest {
    @Test
    void shouldCreateInch() throws InvalidLengthException {
        Length inch = Length.createInches(1);
        assertEquals(Length.createInches(1), inch);
    }

    @Test
    void shouldCreateFeet() throws InvalidLengthException {
        Length feet = Length.createFeet(2);
        assertEquals(Length.createFeet(2), feet);
    }

    @Test
    void lengthCannotBeNegative() {
        InvalidLengthException invalidLengthException = assertThrows(InvalidLengthException.class, () -> Length.createInches(-2));
        assertEquals("Invalid Length", invalidLengthException.getMessage());
    }

    @Test
    void shouldCreateCm() throws InvalidLengthException {
        Length twoCentimeters = Length.createCm(2);
        assertEquals(Length.createCm(2), twoCentimeters);
    }

    @Test
    void onFeetIsEqualTo12Inches() throws InvalidLengthException {
        assertEquals(Length.createFeet(1), Length.createInches(12));
    }

    @Test
    void twoInchesIsEqualTo5Cm() throws InvalidLengthException {
        assertEquals(Length.createInches(2), Length.createCm(5.08));
    }

    @Test
    void shouldCreateMm() throws InvalidLengthException {
        Length oneMillimeter = Length.createMm(1);
        assertEquals(Length.createMm(1), oneMillimeter);
    }

    @Test
    void oneCentimeterIsEqualToTenMillimeters() throws InvalidLengthException {
        Length oneCentimeter = Length.createCm(1);
        assertEquals(Length.createMm(10), oneCentimeter);
    }

    @Test
    void shouldAddTwoInches() throws InvalidLengthException {
        Length twoInches = Length.createInches(2);
        Length sum = twoInches.add(Length.createInches(2));
        assertEquals(Length.createInches(4), sum);
    }


    @Test
    void twoAndAHalfCmAddedToTwoInchesIsEqualToThreeInches() throws InvalidLengthException {
        Length twoInches = Length.createInches(2);
        Length twoAndAHalfCm = Length.createCm(2.54);
        assertEquals(Length.createInches(3), twoInches.add(twoAndAHalfCm));
    }
}