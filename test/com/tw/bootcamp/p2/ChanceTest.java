package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void shouldCreateChance() throws InvalidChanceException {
        Chance chance =  Chance.createChance(0.4f);
        assertEquals(Chance.createChance(0.4f), chance);
    }

    @Test
    void shouldThrowWhenInvalidChanceIsProvided() {
        InvalidChanceException invalidChanceException = assertThrows(InvalidChanceException.class, () -> Chance.createChance(100f));
        assertEquals("invalid chance 100.0", invalidChanceException.getMessage());
    }

    @Test
    void shouldReturnNotHappeningChance() throws InvalidChanceException {
        Chance chance = Chance.createChance(0.4f);
        Chance expectedChance =  Chance.createChance(0.6f);
       assertEquals(expectedChance, chance.not());
    }

    @Test
    void shouldCalculateChanceOfGettingAtleastOneTail() throws InvalidChanceException {
        Chance chanceOfGettingTails = Chance.createChance(0.5f);
        Chance expectedChance = Chance.createChance(0.75f);

        Chance chanceOfGettingAtleastOneTail = chanceOfGettingTails.or(chanceOfGettingTails);
        assertEquals(expectedChance, chanceOfGettingAtleastOneTail);
    }

    @Test
    void shouldPerformOrOperation() throws InvalidChanceException {
        Chance chance1 = Chance.createChance(0.5f);
        Chance chance2 = Chance.createChance(0.4f);
        Chance expectedChance = Chance.createChance(0.70f);

        Chance result = chance1.or(chance2);
        assertEquals(expectedChance, result);
    }
}