package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
    private final float chance;

    private Chance(float chance) {
        this.chance = chance;
    }

    public static Chance createChance(float chance) throws InvalidChanceException {
        if(chance < 0 || chance > 1){
            throw new InvalidChanceException("invalid chance %s".formatted(chance));
        }
        return new Chance(chance);
    }

    public Chance not() throws InvalidChanceException {
        return createChance(1-chance);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Float.compare(chance, chance1.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    @Override
    public String toString() {
        return "Chance{" +
                "chance=" + chance +
                '}';
    }

    public Chance orDemorgans(Chance another) throws InvalidChanceException {
        return (this.not().and(another.not())).not();
    }

    public Chance or(Chance another) throws InvalidChanceException {
        return createChance(( chance + another.chance - chance * another.chance));
    }

    public Chance and(Chance another) throws InvalidChanceException {
        return createChance(chance * another.chance);
    }

}
