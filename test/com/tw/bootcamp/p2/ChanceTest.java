package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void shouldCreateChance() {
        Chance chance = assertDoesNotThrow(() -> Chance.createChance(0.4f));
        Chance sameChance = assertDoesNotThrow(() -> Chance.createChance(0.4f));
        assertEquals(chance, sameChance);
    }

    @Test
    void shouldRepresentChance() {
        assertDoesNotThrow( ()->Chance.createChance(0.2f));
    }

    @Test
    void shouldThrowWhenInvalidChanceIsGiven() {
        assertThrows(InvalidChanceException.class, ()->Chance.createChance(100f));
    }

    @Test
    void shouldReturnNotHappeningChance() {
        Chance chance = assertDoesNotThrow(() -> Chance.createChance(0.4f));
        Chance expectedChance = assertDoesNotThrow(() -> Chance.createChance(0.6f));
       assertEquals(expectedChance, chance.not());
    }
}