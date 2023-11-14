package jefr.pokemon.backend.domain.superclasses;

import jefr.pokemon.backend.domain.enums.HitStatus;

import java.util.HashMap;
import java.util.Random;

public class BasePokemon {
    protected int hitPoints;
    protected double baseDamage;

    public HashMap<HitStatus, Integer> Attack(BaseMove move) {
        HashMap<HitStatus, Integer> returnMap = new HashMap<>();
        HitStatus didHit = doesHit(move);

        if (didHit == HitStatus.MISS) {
            returnMap.put(didHit, 0);
        } else {
            returnMap.put(didHit, hit(move.damage));
        }

        return returnMap;
    }

    /**
     * @param move: the move that gets played
     * @return: returns enum that shows if the move hits or misses
     */
    public HitStatus doesHit(BaseMove move) {
        Random randomGenerator = new Random();
        if (randomGenerator.nextFloat()>= move.getPercentageFloat()) {
            return HitStatus.HIT;
        }
        return HitStatus.MISS;
    }

    //todo: needs actual damage calculations!!
    public int hit(int moveDamage) {
        return moveDamage;
    }
}
