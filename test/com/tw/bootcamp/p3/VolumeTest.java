package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VolumeTest {
    @Test
    void shouldCreateGallon() throws Throwable {
        Volume oneGallon = Volume.createGallon(1);
        assertEquals(Volume.createGallon(1), oneGallon);
    }

    @Test
    void shouldCreateLitre() throws Throwable {
        Volume fiveLitre = Volume.createLitre(5);
        assertEquals(Volume.createLitre(5), fiveLitre);
    }

    @Test
    void volumeCannotBeNegative() {
        InvalidVolumeException invalidVolumeException = assertThrows(InvalidVolumeException.class, () -> Volume.createGallon(-20));
        assertEquals("Invalid Volume", invalidVolumeException.getMessage());

    }

    @Test
    void twoGallonsIsApproximatelyEqualTo8Litre() throws Throwable {
        Volume twoGallon = Volume.createGallon(2);
        assertEquals(Volume.createLitre(7.56), twoGallon);
    }

    @Test
    void sumOfOneLitreAndOneGallonIsApproximately5Litre() throws Throwable {
        Volume oneLitre = Volume.createLitre(1);
        Volume oneGallon = Volume.createGallon(1);
        assertEquals(Volume.createLitre(4.779), oneLitre.add(oneGallon));
    }
}