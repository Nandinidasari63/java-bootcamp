package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldCreateGallon() {
        Volume oneGallon = Volume.createGallon(1);
        assertEquals(Volume.createGallon(1), oneGallon);
    }

    @Test
    void shouldCreateLitre() {
        Volume fiveLitre = Volume.createLitre(5);
        assertEquals(Volume.createLitre(5), fiveLitre);
    }

    @Test
    void twoGallonsIsApproximatelyEqualTo8Litre() {
        Volume twoGallon = Volume.createGallon(2);
        assertEquals(Volume.createLitre(7.56), twoGallon);
    }
    
}